package br.com.reset.tinderevolution.console;

import br.com.reset.tinderevolution.dominio.EstiloMusical;
import br.com.reset.tinderevolution.dominio.Musica;
import br.com.reset.tinderevolution.gerenciador.MusicaGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

// Menu de Funcionalidade da Música
public class MusicaMenu {

    private MusicaGerenciador gerenciador;

    public MusicaMenu() {
        this.gerenciador = new MusicaGerenciador();
    }

    public void opcoes() {
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {
            System.out.println("\nSelecione uma opção:");
            System.out.println("[ C ] Criar");
            System.out.println("[ E ] Editar");
            System.out.println("[ L ] Listar");
            System.out.println("[ P ] Procurar");
            System.out.println("[ D ] Deletar");
            System.out.println("[ X ] Voltar");
            System.out.print("> ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'C':
                    criar();
                    break;
                case 'E':
                    editar();
                    break;
                case 'L':
                    listar();
                    break;
                case 'P':
                    procurar();
                    break;
                case 'D':
                    deletar();
                    break;
                case 'X':
                    System.out.println("...");
                    break;
                default:
                    System.out.println("...opção inválida...");
            }
        }
    }

    public Musica criar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCriação de Música...");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Artista: ");
        String artista = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Estilo:");
        System.out.println("[ F ] FUNK");
        System.out.println("[ P ] PAGODE");
        System.out.println("[ R ] ROCK");
        System.out.println("[ I ] INDIE");
        System.out.println("[ S ] SERTANEJO");
        System.out.println("[ M ] METAL");
        System.out.print("> ");
        String estilo = scanner.next();

        EstiloMusical estiloMusical;
        switch (estilo) {
            case "F":
                estiloMusical = EstiloMusical.FUNK;
                break;
            case "P":
                estiloMusical = EstiloMusical.PAGODE;
                break;
            case "R":
                estiloMusical = EstiloMusical.ROCK;
                break;
            case "I":
                estiloMusical = EstiloMusical.INDIE;
                break;
            case "S":
                estiloMusical = EstiloMusical.SERTANEJO;
                break;
            case "M":
                estiloMusical = EstiloMusical.METAL;
                break;
            default:
                estiloMusical = EstiloMusical.FUNK;
                break;
        }

        Musica musica = new Musica(nome, artista, estiloMusical, LocalDate.of(ano, mes, dia));
        return gerenciador.salvar(musica);
    }

    public Musica editar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEdição de Música...");
        System.out.println("Qual música deseja editar?");

        List<Musica> musicas = gerenciador.listar();
        for (Musica musica : musicas) {
            System.out.println("[ " + musica.getId() + " ] - " + musica.getNome());
        }

        System.out.print("Digite o ID da música: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Artista: ");
        String artista = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Estilo:");
        System.out.println("[ F ] FUNK");
        System.out.println("[ P ] PAGODE");
        System.out.println("[ R ] ROCK");
        System.out.println("[ I ] INDIE");
        System.out.println("[ S ] SERTANEJO");
        System.out.println("[ M ] METAL");
        System.out.print("> ");
        String estilo = scanner.next();

        EstiloMusical estiloMusical;
        switch (estilo) {
            case "F":
                estiloMusical = EstiloMusical.FUNK;
                break;
            case "P":
                estiloMusical = EstiloMusical.PAGODE;
                break;
            case "R":
                estiloMusical = EstiloMusical.ROCK;
                break;
            case "I":
                estiloMusical = EstiloMusical.INDIE;
                break;
            case "S":
                estiloMusical = EstiloMusical.SERTANEJO;
                break;
            case "M":
                estiloMusical = EstiloMusical.METAL;
                break;
            default:
                estiloMusical = EstiloMusical.FUNK;
                break;
        }

        Musica atualizacao = new Musica(nome, artista, estiloMusical, LocalDate.of(ano, mes, dia));

        Musica musicaAtualizada = gerenciador.editar(id, atualizacao);

        if (musicaAtualizada == null) {
            System.out.println("Música não encontrada");
        } else {
            System.out.println(musicaAtualizada);
        }
        return musicaAtualizada;
    }

    private List<Musica> listar() {
        System.out.println("\nListagem de Música...");
        List<Musica> musicas = gerenciador.listar();

        for (Musica musica : musicas) {
            System.out.println(musica);
        }
        return musicas;
    }

    public void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de Música...");
        System.out.println("Qual o código da música?");

        System.out.print("> ");
        int id = scanner.nextInt();

        Musica musica = gerenciador.procurar(id);

        if (musica == null) {
            System.out.println("Música não encontrada.");
        } else {
            System.out.println(musica);
        }
    }

    private void deletar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de Música...");
        System.out.println("Qual música deseja deletar?");

        List<Musica> musicas = gerenciador.listar();

        for (Musica musica : musicas) {
            System.out.println(musica);
        }

        System.out.print("Digite o ID da música: ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)){
            System.out.println("Música deletada.");
        } else {
            System.out.println("Música não encontrada.");
        }
    }
}
