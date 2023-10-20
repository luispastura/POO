import java.util.HashMap;
import java.util.Map;

class Aluno {
    public String nome;
    public String curso;
    public String matricula;

    public Aluno(String nome, String curso, String matricula) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
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

    public void listarInformacoesAluno(String matricula) {
        Aluno aluno = alunos.get(matricula);
        if (aluno != null) {
            System.out.println("Matrícula: " + aluno.matricula);
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Curso: " + aluno.curso);
        }else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public void listarTodosAlunos() {
        for (Aluno aluno : alunos.values()) {
            System.out.println("Matrícula: " + aluno.matricula);
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Curso: " + aluno.curso);
            System.out.println();
        }
    }
}

public class App {
    public static void main(String[] args) {
        AlunoCRUD crud = new AlunoCRUD();

        crud.adicionarAluno("Luis", "Ciencia de dados", "202202393614");
        crud.adicionarAluno("Matheus", "Ciencia de dados", "202208385011");

        System.out.println("Lista de Alunos:");
        crud.listarTodosAlunos();

        System.out.println("Removendo aluno com matrícula 202202393614");
        crud.removerAluno("202202393614");

        System.out.println("Lista de Alunos após remoção:");
        crud.listarTodosAlunos();

        System.out.println("Atualizando o curso do aluno com matrícula 202208385011 para Engenharia da computação");
        crud.atualizarCurso("202208385011", "Engenharia da computação");

        System.out.println("Informações do aluno com matrícula 202208385011:");
        crud.listarInformacoesAluno("202208385011");
    }
}
