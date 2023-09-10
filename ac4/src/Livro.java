public class Livro {
    String titulo;
    String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String LivroTitulo() {
        return titulo;
    }

    public String LivroAutor() {
        return autor;
    }

    public void reservar() {
        System.out.println("Livro '" + titulo + "' de '" + autor + "' reservado com sucesso!");
    }

    public void cancelarReserva() {
        System.out.println("Reserva do livro '" + titulo + "' de '" + autor + "' cancelada com sucesso!");
    }
}
