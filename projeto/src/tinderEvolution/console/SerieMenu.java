package tinderEvolution.console;

import tinderEvolution.dominio.CategoriaSerie;
import tinderEvolution.dominio.Serie;
import tinderEvolution.gerenciador.SerieGerenciador;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

// Menu de Funcionalidade da Série
public class SerieMenu {

    private SerieGerenciador gerenciador;

    public SerieMenu() {
        this.gerenciador = new SerieGerenciador();
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

    public Serie criar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCriação de Série...");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.print("Sinopse: ");
        String sinopse = scanner.nextLine();

        System.out.print("Temporadas: ");
        int temporada = scanner.nextInt();

        System.out.print("Episódios: ");
        int episodio = scanner.nextInt();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Categoria:");
        System.out.println("[ 1 ] DRAMA");
        System.out.println("[ 2 ] COMÉDIA");
        System.out.println("[ 3 ] SUSPENSE");
        System.out.println("[ 4 ] TERROR");
        System.out.println("[ 5 ] AÇÃO");
        System.out.println("[ 6 ] SITCOM");
        System.out.print("> ");
        int categoria = scanner.nextInt();

        CategoriaSerie categoriaSerie;
        switch (categoria) {
            case 1:
                categoriaSerie = CategoriaSerie.DRAMA;
                break;
            case 2:
                categoriaSerie = CategoriaSerie.COMÉDIA;
                break;
            case 3:
                categoriaSerie = CategoriaSerie.SUSPENSE;
                break;
            case 4:
                categoriaSerie = CategoriaSerie.TERROR;
                break;
            case 5:
                categoriaSerie = CategoriaSerie.AÇÃO;
                break;
            case 6:
                categoriaSerie = CategoriaSerie.SITCOM;
                break;
            default:
                categoriaSerie = CategoriaSerie.DRAMA;
                break;
        }

        Serie serie = new Serie(nome, diretor, categoriaSerie, LocalDate.of(ano, mes, dia), sinopse, temporada, episodio);
        return gerenciador.salvar(serie);
    }

    public Serie editar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEdição de Série...");
        System.out.println("Qual série deseja editar?");

        List<Serie> series = gerenciador.listar();
        for (Serie serie : series) {
            System.out.println("[ " + serie.getId() + " ] - " + serie.getNome());
        }

        System.out.print("Digite o ID do série: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.print("Sinopse: ");
        String sinopse = scanner.nextLine();

        System.out.print("Temporadas: ");
        int temporada = scanner.nextInt();

        System.out.print("Episódios: ");
        int episodio = scanner.nextInt();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Categoria:");
        System.out.println("[ 1 ] DRAMA");
        System.out.println("[ 2 ] COMÉDIA");
        System.out.println("[ 3 ] SUSPENSE");
        System.out.println("[ 4 ] TERROR");
        System.out.println("[ 5 ] AÇÃO");
        System.out.println("[ 6 ] SITCOM");
        System.out.print("> ");
        int categoria = scanner.nextInt();

        CategoriaSerie categoriaSerie;
        switch (categoria) {
            case 1:
                categoriaSerie = CategoriaSerie.DRAMA;
                break;
            case 2:
                categoriaSerie = CategoriaSerie.COMÉDIA;
                break;
            case 3:
                categoriaSerie = CategoriaSerie.SUSPENSE;
                break;
            case 4:
                categoriaSerie = CategoriaSerie.TERROR;
                break;
            case 5:
                categoriaSerie = CategoriaSerie.AÇÃO;
                break;
            case 6:
                categoriaSerie = CategoriaSerie.SITCOM;
                break;
            default:
                categoriaSerie = CategoriaSerie.DRAMA;
                break;
        }

        Serie atualizacao = new Serie(nome, diretor, categoriaSerie, LocalDate.of(ano, mes, dia), sinopse, temporada, episodio);
        Serie serieAtualizada = gerenciador.editar(id, atualizacao);

        if (serieAtualizada == null) {
            System.out.println("Série não encontrada");
        } else {
            System.out.println(serieAtualizada);
        }
        return serieAtualizada;
    }

    private List<Serie> listar() {
        System.out.println("\nListagem de Série...");
        List<Serie> series = gerenciador.listar();

        for (Serie filme : series) {
            System.out.println(series);
        }
        return series;
    }

    public void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de Série...");
        System.out.println("Qual o código da série?");

        System.out.print("> ");
        int id = scanner.nextInt();

        Serie serie = gerenciador.procurar(id);

        if (serie == null) {
            System.out.println("Série não encontrada.");
        } else {
            System.out.println(serie);
        }
    }

    private void deletar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de Série...");
        System.out.println("Qual série deseja deletar?");

        List<Serie> series = gerenciador.listar();

        for (Serie serie : series) {
            System.out.println(serie);
        }

        System.out.print("Digite o ID da série: ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Série deletada.");
        } else {
            System.out.println("Série não encontrada.");
        }
    }
}
