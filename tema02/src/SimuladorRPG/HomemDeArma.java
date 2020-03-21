package SimuladorRPG;

public class HomemDeArma extends Personagem {

    private Arma arma;

    public HomemDeArma(String nome, double vida, double ataque, double defesa, Arma arma) {
        super(nome, vida, ataque, defesa);
        this.arma = arma;
    }

    public void atacar(Personagem alvo) {
        if (getVida() > 0) {
            double dano = danoFinal(alvo.getDefesa(), arma.getPoderAtaque());
            alvo.setVida(alvo.getVida() - dano);
            System.out.println(getNome() + " atacou " + alvo.getNome() + " com " + arma.getNome() + " causando " + dano + " de dano.");
            if (alvo.getVida() <= 0) {
                System.out.println(alvo.getNome() + " morreu nesse ataque!");
            }
        } else {
            System.out.println(getNome() + " tentou atacar " + alvo.getNome() + ", mas o ataque foi ignorado, pois " + getNome() + " já está morto!");
        }
    }

    public void imprimir() {
        System.out.println("Personagem " + getNome());
        System.out.println("Vida: " + getVida());
    }
}
