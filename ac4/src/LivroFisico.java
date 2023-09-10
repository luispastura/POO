public class LivroFisico extends Livro {
    boolean emprestado;

    public LivroFisico(String titulo, String autor) {
        super(titulo, autor);
        this.emprestado = false;
    }

    public boolean LivroFisicoEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        if (emprestado) {
            System.out.println("Livro físico já está emprestado!");
        } else {
            emprestado = true;
            System.out.println("Livro físico emprestado com sucesso!");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro físico devolvido com sucesso!");
        } else {
            System.out.println("Livro físico não está emprestado!");
        }
    }
}
