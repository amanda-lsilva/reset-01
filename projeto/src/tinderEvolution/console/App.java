package tinderEvolution.console;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        MusicaMenu musicaMenu = new MusicaMenu();
        UsuarioMenu usuarioMenu = new UsuarioMenu();

        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {
            System.out.println("Selecione uma opção:");
            System.out.println("[ M ] Músicas");
            System.out.println("[ U ] Usuários");
            System.out.println("[ X ] Encerrar");
            System.out.print("> ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'M':
                    musicaMenu.opcoes();
                    break;
                case 'U':
                    usuarioMenu.opcoes();
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
