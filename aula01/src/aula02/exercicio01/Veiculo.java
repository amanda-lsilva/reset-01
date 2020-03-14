package aula02.exercicio01;

public class Veiculo {

    String nome;
    String terreno;
    int lotacaoMaxima;
    double velocidadeMaxima;

    public Veiculo (String nome, String terreno, int lotacaoMaxima, double velocidadeMaxima) {
        this.nome = nome;
        this.terreno = terreno;
        this.lotacaoMaxima = lotacaoMaxima;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public String toString (){
        return "Veículo: " + this.nome;
    }
}
