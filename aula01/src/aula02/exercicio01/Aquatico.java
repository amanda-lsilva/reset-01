package aula02.exercicio01;

public class Aquatico extends Veiculo {

    double profundidadeMaxima;
    String combustivel;

    Aquatico(String nome, String terreno, int lotacaoMaxima, double velocidadeMaxima, double profundidadeMaxima, String combustivel){
        super(nome, terreno, lotacaoMaxima, velocidadeMaxima);
        this.profundidadeMaxima = profundidadeMaxima;
        this.combustivel = combustivel;
    }

    public String toString() {
        return super.toString() + " | Combustivel: " + this.combustivel;
    }


}
