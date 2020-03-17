package exercicio3;

public class Item {

    private String nome;
    private Segmento segmento;
    private double valor;
    private int quantidade;

    public Item(String nome, Segmento segmento, double valor, int quantidade) {
        this.nome = nome;
        this.segmento = segmento;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Segmento getSegmento() {
        return segmento;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
