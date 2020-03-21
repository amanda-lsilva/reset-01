package SimuladorRPG;

public class HomemDePoderDivino extends Personagem {

    private double fe;

    public HomemDePoderDivino(String nome, double vida, double ataque, double defesa, double fe) {
        super(nome, vida, ataque, defesa);
        this.fe = fe;
    }

    public double getFe() {
        return fe;
    }

    public void setFe(double fe) {
        this.fe = fe;
    }

    public void atacar(Personagem alvo, PoderDivino poderDivino) {
        if (getVida() > 0) {
            if (getFe() >= poderDivino.getCustoFe()) {
                setFe(getFe() - poderDivino.getCustoFe());
                double dano = danoFinal(alvo.getDefesa(), poderDivino.getIntensidade());
                alvo.setVida(alvo.getVida() - dano);
                System.out.println(getNome() + " atacou " + alvo.getNome() + " com " + poderDivino.getNome() + " causando " + dano + " de dano.");
                if (alvo.getVida() <= 0) {
                    System.out.println(alvo.getNome() + " morreu nesse ataque!");
                }
            } else {
                System.out.println(getNome() + " tentou atacar " + alvo.getNome() + ", mas não possui fé suficiente.");
            }
        } else {
            System.out.println(getNome() + " tentou atacar " + alvo.getNome() + ", mas o ataque foi ignorado, pois " + getNome() + " já está morto!");
        }
    }

    public void imprimir() {
        System.out.println("Personagem " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Fé: " + getFe());
    }
}



