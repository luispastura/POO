import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.io.*;

class Aluno {
    public String nome;
    public String curso;
    public String matricula;

    public Aluno(String nome, String curso, String matricula) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + "\nNome: " + nome + "\nCurso: " + curso;
    }
}

class AlunoCRUD {
    public Map<String, Aluno> alunos;

    public AlunoCRUD() {
        alunos = new HashMap<>();
    }

    public void adicionarAluno(String nome, String curso, String matricula) {
        Aluno aluno = new Aluno(nome, curso, matricula);
        alunos.put(matricula, aluno);
    }

    public void removerAluno(String matricula) {
        alunos.remove(matricula);
    }

    public void atualizarCurso(String matricula, String novoCurso) {
        if (alunos.containsKey(matricula)) {
            Aluno aluno = alunos.get(matricula);
            aluno.curso = novoCurso;
        }
    }

    public Aluno obterAluno(String matricula) {
        return alunos.get(matricula);
    }

    public void listarTodosAlunos() {
        for (Aluno aluno : alunos.values()) {
            System.out.println(aluno);
            System.out.println();
        }
    }
}

public class App {
    public static void main(String[] args) {
        AlunoCRUD crud = new AlunoCRUD();
        carregarDadosDeArquivo(crud);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Incluir aluno");
            System.out.println("2 - Remover aluno");
            System.out.println("3 - Editar curso do aluno");
            System.out.println("4 - Listar alunos");
            System.out.println("5 - Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (escolha) {
                case 1:
                    System.out.print("Nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("Curso: ");
                    String curso = scanner.nextLine();
                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();
                    crud.adicionarAluno(nome, curso, matricula);
                    break;
                case 2:
                    System.out.print("Matrícula do aluno a ser removido: ");
                    matricula = scanner.nextLine();
                    crud.removerAluno(matricula);
                    break;
                case 3:
                    System.out.print("Matrícula do aluno a ser editado: ");
                    matricula = scanner.nextLine();
                    System.out.print("Novo curso: ");
                    curso = scanner.nextLine();
                    crud.atualizarCurso(matricula, curso);
                    break;
                case 4:
                    System.out.println("Lista de Alunos:");
                    crud.listarTodosAlunos();
                    break;
                case 5:
                    salvarDadosEmArquivo(crud);
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void carregarDadosDeArquivo(AlunoCRUD crud) {
        try (BufferedReader br = new BufferedReader(new FileReader("alunos.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 3) {
                    String nome = partes[0];
                    String curso = partes[1];
                    String matricula = partes[2];
                    crud.adicionarAluno(nome, curso, matricula);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar dados do arquivo: " + e.getMessage());
        }
    }

    public static void salvarDadosEmArquivo(AlunoCRUD crud) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("alunos.txt"))) {
            for (Aluno aluno : crud.alunos.values()) {
                bw.write(aluno.nome + "," + aluno.curso + "," + aluno.matricula);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar dados no arquivo: " + e.getMessage());
        }
    }
}