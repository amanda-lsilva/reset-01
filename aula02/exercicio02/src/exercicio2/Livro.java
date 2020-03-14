package exercicio2;

public class Livro {

    String titulo;
    String autor;
    Categoria categoria;
    Status status;

    public Livro(String titulo, String autor, Categoria categoria, Status status) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.status = status;
    }

    public void imprimirLivro () {
        System.out.println(titulo);
    }
}
