package SimuladorRPG;

public class Magia {

    private String nome;
    private double poder;
    private double custoMana;


    Magia(String nome, double poder, double custoMana) {
        this.nome = nome;
        this.poder = poder;
        this.custoMana = custoMana;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }

    public double getCustoMana() {
        return custoMana;
    }

    public void setCustoMana(double custoMana) {
        this.custoMana = custoMana;
    }
}