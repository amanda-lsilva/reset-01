package SimuladorRPG;

public class HomemDeMagia extends Personagem {

    private double mana;

    public HomemDeMagia(String nome, double vida, double ataque, double defesa, double mana) {
        super(nome, vida, ataque, defesa);
        this.mana = mana;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public void atacar(Personagem alvo, Magia magia) {
        if (getVida() > 0) {
            if (getMana() >= magia.getCustoMana()) {
                setMana(getMana() - magia.getCustoMana());
                double dano = danoFinal(alvo.getDefesa(), magia.getPoder());
                alvo.setVida(alvo.getVida() - dano);
                System.out.println(getNome() + " atacou " + alvo.getNome() + " com " + magia.getNome() + " causando " + dano + " de dano.");
                if (alvo.getVida() <= 0) {
                    System.out.println(alvo.getNome() + " morreu nesse ataque!");
                }
            } else {
                System.out.println(getNome() + " tentou atacar " + alvo.getNome() + ", mas não possui mana suficiente.");
            }
        } else {
            System.out.println(getNome() + " tentou atacar " + alvo.getNome() + ", mas o ataque foi ignorado, pois " + getNome() + " já está morto!");
        }
    }

    public void imprimir() {
        System.out.println("Personagem " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Mana: " + getMana());
    }
}
