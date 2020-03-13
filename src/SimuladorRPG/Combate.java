package SimuladorRPG;

public class Combate {

    public static void main(String[] args) {

        Guerreiro redgar = new Guerreiro("Redgar", 100, 8.5, 7.2);
        Barbaro conan = new Barbaro("Conan", 100, 8.4, 7.8);
        Mago ezren = new Mago("Ezren", 100, 7.6, 8.4, 50);
        Feiticeiro fandom = new Feiticeiro("Fandom", 26.2, 6, 8.4, 40);
        Druida lini = new Druida("Lini", 100, 7.2, 7.7, 100);
        Clerigo jozan = new Clerigo("Jozan", 16, 7.8, 5.5, 80);

        Arma espada = new Arma("Espada", 2);
        Arma martelo = new Arma("Martelo", 2.5);

        Magia luz = new Magia("Luz", 3.4, 10);
        Magia nevoa = new Magia("Nevoa", 2.7, 40);

        PoderDivino bencao = new PoderDivino("Bencao", 2.4, 50);
        PoderDivino enfeiticar = new PoderDivino("Enfeiticar", 5.1, 30);

        redgar.atacar(conan, espada);
        redgar.atacar(jozan, martelo);
        conan.atacar(ezren, espada);
        conan.atacar(lini, martelo);
        ezren.atacar(redgar, luz);
        ezren.atacar(jozan, nevoa);
        fandom.atacar(redgar, luz);
        fandom.atacar(lini, nevoa);
        lini.atacar(ezren, bencao);
        lini.atacar(fandom, enfeiticar);
        jozan.atacar(conan, bencao);
        jozan.atacar(fandom, enfeiticar);

        System.out.println("Personagem " + redgar.nome);
        System.out.println("Vida: " + redgar.vida);
        System.out.println("Personagem " + conan.nome);
        System.out.println("Vida: " + conan.vida);
        System.out.println("Personagem " + ezren.nome);
        System.out.println("Vida: " + ezren.vida);
        System.out.println("Mana: " + ezren.mana);
        System.out.println("Personagem " + fandom.nome);
        System.out.println("Vida: " + fandom.vida);
        System.out.println("Mana: " + fandom.mana);
        System.out.println("Personagem " + lini.nome);
        System.out.println("Vida: " + lini.vida);
        System.out.println("Fé: " + lini.fe);
        System.out.println("Personagem " + jozan.nome);
        System.out.println("Vida: " + jozan.vida);
        System.out.println("Fé: " + jozan.fe);
    }
}
