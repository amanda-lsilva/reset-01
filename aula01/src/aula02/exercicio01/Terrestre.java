package aula02.exercicio01;

public class Terrestre extends Veiculo {

    int roda;
    String combustivel;

    Terrestre (String nome, String terreno, int lotacaoMaxima, double velocidadeMaxima, int roda, String combustivel) {
        super(nome, terreno, lotacaoMaxima, velocidadeMaxima);
        this.roda = roda;
        this.combustivel = combustivel;
    }
    

    @Override
    public String toString() {
        return "Terrestre{" +
                "roda=" + roda +
                ", combustivel='" + combustivel + '\'' +
                ", nome='" + nome + '\'' +
                ", terreno='" + terreno + '\'' +
                ", lotacaoMaxima=" + lotacaoMaxima +
                ", velocidadeMaxima=" + velocidadeMaxima +
                '}';
    }
}
