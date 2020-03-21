package SimuladorRPG;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combate {

    public static void main(String[] args) {

        List<Personagem> listaDePersonagens = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 1; i++) {
            System.out.println("Criação de Personagem!");
            System.out.println("Escolha a classe do personagem:");
            System.out.println("1 - Guerreiro");
            System.out.println("2 - Bárbaro");
            System.out.println("3 - Clérigo");
            System.out.println("4 - Druida");
            System.out.println("5 - Feiticeiro");
            System.out.println("6 - Mago");

            System.out.print("Classe:");
            int classe = scanner.nextInt();
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Vida: ");
            double vida = scanner.nextDouble();
            System.out.print("Ataque: ");
            double ataque = scanner.nextDouble();
            System.out.print("Defesa: ");
            double defesa = scanner.nextDouble();

            double fe;
            double mana;
            String nomeArma;
            double poderAtaque;

            switch (classe) {
                case '1':
                    System.out.println("Criando Arma: ");
                    nomeArma = scanner.next();
                    poderAtaque = scanner.nextDouble();
                    Arma armaUm = new Arma(nomeArma, poderAtaque);
                    System.out.println("Criando Guerreiro: ");
                    Guerreiro guerreiro = new Guerreiro(nome, vida, ataque, defesa, armaUm);
                    listaDePersonagens.add(guerreiro);
                    break;

                case '2':
                    System.out.println("Criando Arma: ");
                    nomeArma = scanner.next();
                    poderAtaque = scanner.nextDouble();
                    Arma armaDois = new Arma(nomeArma, poderAtaque);
                    System.out.println("Criando Bárbaro: ");
                    Barbaro barbaro = new Barbaro(nome, vida, ataque, defesa, armaDois);
                    listaDePersonagens.add(barbaro);
                    break;

                case '3':
                    System.out.println("Fé: ");
                    fe = scanner.nextDouble();
                    System.out.println("Criando Clérigo: ");
                    Clerigo clerigo = new Clerigo(nome, vida, ataque, defesa, fe);
                    listaDePersonagens.add(clerigo);
                    break;

                case '4':
                    System.out.println("Fé: ");
                    fe = scanner.nextDouble();
                    System.out.println("Criando Druida: ");
                    Druida druida = new Druida(nome, vida, ataque, defesa, fe);
                    listaDePersonagens.add(druida);
                    break;

                case '5':
                    System.out.println("Mana: ");
                    mana = scanner.nextDouble();
                    System.out.println("Criando Feiticeiro: ");
                    Feiticeiro feiticeiro = new Feiticeiro(nome, vida, ataque, defesa, mana);
                    listaDePersonagens.add(feiticeiro);
                    break;

                case '6':
                    System.out.println("Mana: ");
                    mana = scanner.nextDouble();
                    System.out.println("Criando Mago: ");
                    Mago mago = new Mago(nome, vida, ataque, defesa, mana);
                    listaDePersonagens.add(mago);
                    break;

            }

            scanner.close();

            for (Personagem personagem : listaDePersonagens) {
                System.out.println("Nome: " + personagem.getNome() + " | Vida: " + personagem.getVida());
            }
        }


        /* Guerreiro redgar = new Guerreiro("Redgar", 100, 8.5, 7.2);
        Barbaro conan = new Barbaro("Conan", 100, 8.4, 7.8);
        Mago ezren = new Mago("Ezren", 100, 7.6, 8.4, 50);
        Feiticeiro fandom = new Feiticeiro("Fandom", 26.2, 6, 8.4, 40);
        Druida lini = new Druida("Lini", 100, 7.2, 7.7, 100);
        Clerigo jozan = new Clerigo("Jozan", 16, 7.8, 5.5, 80); */

        Magia luz = new Magia("Luz", 3.4, 10);
        Magia nevoa = new Magia("Nevoa", 2.7, 40);

        PoderDivino bencao = new PoderDivino("Bencao", 2.4, 50);
        PoderDivino enfeiticar = new PoderDivino("Enfeiticar", 5.1, 30);

        /* redgar.atacar(conan, espada);
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

        redgar.imprimir();
        conan.imprimir();
        ezren.imprimir();
        fandom.imprimir();
        lini.imprimir();
        jozan.imprimir(); */
    }
}

