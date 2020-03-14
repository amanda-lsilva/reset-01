package exercicio2;

public class Main {

    public static void main(String[] args) {

        Livro livroUm = new Livro("O Senhor dos Anéis", "J.R.Schimitt", Categoria.FANTASIA, Status.EM_USO);
        livroUm.imprimirLivro();

        Livro livroDois = new Livro("O Poder do Amanhã", "Não faço ideia", Categoria.ROMANCE, Status.DISPONÍVEL);
        livroDois.imprimirLivro();

        Livro livroTres = new Livro("1", "teste", Categoria.SUSPENSE, Status.DISPONÍVEL);
        livroTres.imprimirLivro();
    }
}
