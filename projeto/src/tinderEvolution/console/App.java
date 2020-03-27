package tinderEvolution.console;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        MusicaMenu musicaMenu = new MusicaMenu();
        UsuarioMenu usuarioMenu = new UsuarioMenu();
        FilmeMenu filmeMenu = new FilmeMenu();
        SerieMenu serieMenu = new SerieMenu();
        JogoMenu jogoMenu = new JogoMenu();
        EsporteMenu esporteMenu = new EsporteMenu();
        CuriosidadeMenu curiosidadeMenu = new CuriosidadeMenu();

        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {
            System.out.println("Selecione uma opção:");
            System.out.println("[ U ] Usuários");
            System.out.println("[ M ] Músicas");
            System.out.println("[ F ] Filmes");
            System.out.println("[ S ] Séries");
            System.out.println("[ J ] Jogos");
            System.out.println("[ E ] Esportes");
            System.out.println("[ C ] Curiosidades");
            System.out.println("[ X ] Encerrar");
            System.out.print("> ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'U':
                    usuarioMenu.opcoes();
                    break;
                case 'M':
                    musicaMenu.opcoes();
                    break;
                case 'F':
                    filmeMenu.opcoes();
                case 'S':
                    serieMenu.opcoes();
                    break;
                case 'J':
                    jogoMenu.opcoes();
                    break;
                case 'E':
                    esporteMenu.opcoes();
                    break;
                case 'C':
                    curiosidadeMenu.opcoes();
                    break;
                case 'X':
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("...opção inválida...");
            }
        }
    }
}
