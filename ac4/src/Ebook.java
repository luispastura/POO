public class Ebook extends Livro {
    String formato;

    public Ebook(String titulo, String autor, String formato) {
        super(titulo, autor);
        this.formato = formato;
    }

    public String EbookFormato() {
        return formato;
    }
}
