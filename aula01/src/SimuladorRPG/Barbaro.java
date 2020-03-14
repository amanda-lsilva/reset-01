package SimuladorRPG;

public class Barbaro {

    String nome;
    double vida;
    double ataque;
    double defesa;

    Barbaro(String nome, double vida, double ataque, double defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void atacar (Guerreiro alvo, Arma arma) {
        if (this.vida > 0) {
            double danoFinal = this.ataque * arma.poderAtaque - alvo.defesa;
            alvo.vida = alvo.vida - danoFinal;
            System.out.println(this.nome + " atacou " + alvo.nome + " com " + arma.nome + " causando " + danoFinal + " de dano.");
            if (alvo.vida < 0) {
                System.out.println(alvo.nome + " morreu nesse ataque.");
            }
        } else {
            System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas o ataque foi ignorado, pois " + this.nome + " já está morto!");
        }
    }

    public void atacar (Clerigo alvo, Arma arma) {
        if (this.vida > 0) {
            double danoFinal = this.ataque * arma.poderAtaque - alvo.defesa;
            alvo.vida = alvo.vida - danoFinal;
            System.out.println(this.nome + " atacou " + alvo.nome + " com " + arma.nome + " causando " + danoFinal + " de dano.");
            if (alvo.vida < 0) {
                System.out.println(alvo.nome + " morreu nesse ataque.");
            }
        } else {
            System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas o ataque foi ignorado, pois " + this.nome + " já está morto!");
        }
    }

    public void atacar (Druida alvo, Arma arma) {
        if (this.vida > 0) {
            double danoFinal = this.ataque * arma.poderAtaque - alvo.defesa;
            alvo.vida = alvo.vida - danoFinal;
            System.out.println(this.nome + " atacou " + alvo.nome + " com " + arma.nome + " causando " + danoFinal + " de dano.");
            if (alvo.vida < 0) {
                System.out.println(alvo.nome + " morreu nesse ataque.");
            }
        } else {
            System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas o ataque foi ignorado, pois " + this.nome + " já está morto!");
        }
    }

    public void atacar (Feiticeiro alvo, Arma arma) {
        if (this.vida > 0) {
            double danoFinal = this.ataque * arma.poderAtaque - alvo.defesa;
            alvo.vida = alvo.vida - danoFinal;
            System.out.println(this.nome + " atacou " + alvo.nome + " com " + arma.nome + " causando " + danoFinal + " de dano.");
            if (alvo.vida < 0) {
                System.out.println(alvo.nome + " morreu nesse ataque.");
            }
        } else {
            System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas o ataque foi ignorado, pois " + this.nome + " já está morto!");
        }
    }

    public void atacar (Mago alvo, Arma arma) {
        if (this.vida > 0) {
            double danoFinal = this.ataque * arma.poderAtaque - alvo.defesa;
            alvo.vida = alvo.vida - danoFinal;
            System.out.println(this.nome + " atacou " + alvo.nome + " com " + arma.nome + " causando " + danoFinal + " de dano.");
            if (alvo.vida < 0) {
                System.out.println(alvo.nome + " morreu nesse ataque.");
            }
        } else {
            System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas o ataque foi ignorado, pois " + this.nome + " já está morto!");
        }
    }
}