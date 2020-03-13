package SimuladorRPG;

public class Feiticeiro {

    String nome;
    double vida;
    double ataque;
    double defesa;
    double mana;

    Feiticeiro(String nome, double vida, double ataque, double defesa, double mana) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.mana = mana;
    }

    public void atacar(Guerreiro alvo, Magia magia) {
        if (this.vida > 0) {
            if (this.mana >= magia.custoMana) {
                this.mana = this.mana - magia.custoMana;
                double danoFinal = this.ataque * magia.poder - alvo.defesa;
                alvo.vida = alvo.vida - danoFinal;
                System.out.println(this.nome + " atacou " + alvo.nome + " com " + magia.nome + " causando " + danoFinal + " de dano.");
                if (alvo.vida<=0){
                    System.out.println(alvo.nome + " morreu nesse ataque!");
                }
            } else {
                System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas não possui mana suficiente.");
            }
        } else {
            System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas o ataque foi ignorado, pois " + this.nome + " já está morto!");
        }
    }

    public void atacar(Barbaro alvo, Magia magia) {
        if (this.vida > 0) {
            if (this.mana >= magia.custoMana) {
                this.mana = this.mana - magia.custoMana;
                double danoFinal = this.ataque * magia.poder - alvo.defesa;
                alvo.vida = alvo.vida - danoFinal;
                System.out.println(this.nome + " atacou " + alvo.nome + " com " + magia.nome + " causando " + danoFinal + " de dano.");
                if (alvo.vida<=0){
                    System.out.println(alvo.nome + " morreu nesse ataque!");
                }
            } else {
                System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas não possui mana suficiente.");
            }
        } else {
            System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas o ataque foi ignorado, pois " + this.nome + " já está morto!");
        }
    }

    public void atacar(Clerigo alvo, Magia magia) {
        if (this.vida > 0) {
            if (this.mana >= magia.custoMana) {
                this.mana = this.mana - magia.custoMana;
                double danoFinal = this.ataque * magia.poder - alvo.defesa;
                alvo.vida = alvo.vida - danoFinal;
                System.out.println(this.nome + " atacou " + alvo.nome + " com " + magia.nome + " causando " + danoFinal + " de dano.");
                if (alvo.vida<=0){
                    System.out.println(alvo.nome + " morreu nesse ataque!");
                }
            } else {
                System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas não possui mana suficiente.");
            }
        } else {
            System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas o ataque foi ignorado, pois " + this.nome + " já está morto!");
        }
    }

    public void atacar(Druida alvo, Magia magia) {
        if (this.vida > 0) {
            if (this.mana >= magia.custoMana) {
                this.mana = this.mana - magia.custoMana;
                double danoFinal = this.ataque * magia.poder - alvo.defesa;
                alvo.vida = alvo.vida - danoFinal;
                System.out.println(this.nome + " atacou " + alvo.nome + " com " + magia.nome + " causando " + danoFinal + " de dano.");
                if (alvo.vida<=0){
                    System.out.println(alvo.nome + " morreu nesse ataque!");
                }
            } else {
                System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas não possui mana suficiente.");
            }
        } else {
            System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas o ataque foi ignorado, pois " + this.nome + " já está morto!");
        }
    }

    public void atacar(Mago alvo, Magia magia) {
        if (this.vida > 0) {
            if (this.mana >= magia.custoMana) {
                this.mana = this.mana - magia.custoMana;
                double danoFinal = this.ataque * magia.poder - alvo.defesa;
                alvo.vida = alvo.vida - danoFinal;
                System.out.println(this.nome + " atacou " + alvo.nome + " com " + magia.nome + " causando " + danoFinal + " de dano.");
                if (alvo.vida<=0){
                    System.out.println(alvo.nome + " morreu nesse ataque!");
                }
            } else {
                System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas não possui mana suficiente.");
            }
        } else {
            System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas o ataque foi ignorado, pois " + this.nome + " já está morto!");
        }
    }
}


