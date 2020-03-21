package SimuladorRPG;

public class PoderDivino {

    private String nome;
    private double intensidade;
    private double custoFe;

    PoderDivino(String nome, double intensidade, double custoFe) {
        this.nome = nome;
        this.intensidade = intensidade;
        this.custoFe = custoFe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(double intensidade) {
        this.intensidade = intensidade;
    }

    public double getCustoFe() {
        return custoFe;
    }

    public void setCustoFe(double custoFe) {
        this.custoFe = custoFe;
    }
}
