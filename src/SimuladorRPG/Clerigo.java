package SimuladorRPG;

public class Clerigo {

    String nome;
    double vida;
    double ataque;
    double defesa;
    double fe;

    Clerigo(String nome, double vida, double ataque, double defesa, double fe) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.fe = fe;
    }

    public void atacar(Guerreiro alvo, PoderDivino poder) {
        if (this.vida > 0) {
            if (this.fe >= poder.custoFe) {
                this.fe = this.fe - poder.custoFe;
                double danoFinal = this.ataque * poder.intensidade - alvo.defesa;
                alvo.vida = alvo.vida - danoFinal;
                System.out.println(this.nome + " atacou " + alvo.nome + " com " + poder.nome + " causando " + danoFinal + " de dano.");
                if (alvo.vida < 0) {
                    System.out.println(alvo.nome + " morreu nesse ataque.");
                }
            } else {
                System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas não possui fé suficiente");
            }
        } else {
            System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas o ataque foi ignorado, pois " + this.nome + " já está morto!");
        }
    }

    public void atacar(Barbaro alvo, PoderDivino poder) {
        if (this.vida > 0) {
            if (this.fe >= poder.custoFe) {
                this.fe = this.fe - poder.custoFe;
                double danoFinal = this.ataque * poder.intensidade - alvo.defesa;
                alvo.vida = alvo.vida - danoFinal;
                System.out.println(this.nome + " atacou " + alvo.nome + " com " + poder.nome + " causando " + danoFinal + " de dano.");
                if (alvo.vida < 0) {
                    System.out.println(alvo.nome + " morreu nesse ataque.");
                }
            } else {
                System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas não possui fé suficiente");
            }
        } else {
            System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas o ataque foi ignorado, pois " + this.nome + " já está morto!");
        }
    }

    public void atacar(Druida alvo, PoderDivino poder) {
        if (this.vida > 0) {
            if (this.fe >= poder.custoFe) {
                this.fe = this.fe - poder.custoFe;
                double danoFinal = this.ataque * poder.intensidade - alvo.defesa;
                alvo.vida = alvo.vida - danoFinal;
                System.out.println(this.nome + " atacou " + alvo.nome + " com " + poder.nome + " causando " + danoFinal + " de dano.");
                if (alvo.vida < 0) {
                    System.out.println(alvo.nome + " morreu nesse ataque.");
                }
            } else {
                System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas não possui fé suficiente");
            }
        } else {
            System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas o ataque foi ignorado, pois " + this.nome + " já está morto!");
        }
    }

    public void atacar(Mago alvo, PoderDivino poder) {
        if (this.vida > 0) {
            if (this.fe >= poder.custoFe) {
                this.fe = this.fe - poder.custoFe;
                double danoFinal = this.ataque * poder.intensidade - alvo.defesa;
                alvo.vida = alvo.vida - danoFinal;
                System.out.println(this.nome + " atacou " + alvo.nome + " com " + poder.nome + " causando " + danoFinal + " de dano.");
                if (alvo.vida < 0) {
                    System.out.println(alvo.nome + " morreu nesse ataque.");
                }
            } else {
                System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas não possui fé suficiente");
            }
        } else {
            System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas o ataque foi ignorado, pois " + this.nome + " já está morto!");
        }
    }

    public void atacar(Feiticeiro alvo, PoderDivino poder) {
        if (this.vida > 0) {
            if (this.fe >= poder.custoFe) {
                this.fe = this.fe - poder.custoFe;
                double danoFinal = this.ataque * poder.intensidade - alvo.defesa;
                alvo.vida = alvo.vida - danoFinal;
                System.out.println(this.nome + " atacou " + alvo.nome + " com " + poder.nome + " causando " + danoFinal + " de dano.");
                if (alvo.vida < 0) {
                    System.out.println(alvo.nome + " morreu nesse ataque.");
                }
            } else {
                System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas não possui fé suficiente");
            }
        } else {
            System.out.println(this.nome + " tentou atacar " + alvo.nome + ", mas o ataque foi ignorado, pois " + this.nome + " já está morto!");
        }
    }
}
