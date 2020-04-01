package br.com.reset.tinderevolution.console;

import br.com.reset.tinderevolution.dominio.CategoriaFilme;
import br.com.reset.tinderevolution.dominio.Filme;
import br.com.reset.tinderevolution.gerenciador.FilmeGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

// Menu de Funcionalidade do Filme
public class FilmeMenu {

    private FilmeGerenciador gerenciador;

    public FilmeMenu() {
        this.gerenciador = new FilmeGerenciador();
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

    public Filme criar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCriação de Filme...");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.print("Sinopse: ");
        String sinopse = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Categoria:");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ C ] COMÉDIA");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.println("[ A ] AÇÃO");
        System.out.println("[ M ] MUSICAL");
        System.out.print("> ");
        String categoria = scanner.next();

        CategoriaFilme categoriaFilme;
        switch (categoria) {
            case "F":
                categoriaFilme = CategoriaFilme.DRAMA;
                break;
            case "P":
                categoriaFilme = CategoriaFilme.COMÉDIA;
                break;
            case "R":
                categoriaFilme = CategoriaFilme.SUSPENSE;
                break;
            case "I":
                categoriaFilme = CategoriaFilme.TERROR;
                break;
            case "S":
                categoriaFilme = CategoriaFilme.AÇÃO;
                break;
            case "M":
                categoriaFilme = CategoriaFilme.MUSICAL;
                break;
            default:
                categoriaFilme = CategoriaFilme.DRAMA;
                break;
        }

        Filme filme = new Filme(nome, diretor, categoriaFilme, LocalDate.of(ano, mes, dia), sinopse);
        return gerenciador.salvar(filme);
    }

    public Filme editar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEdição de Filme...");
        System.out.println("Qual filme deseja editar?");

        List<Filme> filmes = gerenciador.listar();
        for (Filme filme : filmes) {
            System.out.println("[ " + filme.getId() + " ] - " + filme.getNome());
        }

        System.out.print("Digite o ID do filme: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.print("Sinopse: ");
        String sinopse = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Categoria:");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ C ] COMÉDIA");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.println("[ A ] AÇÃO");
        System.out.println("[ M ] MUSICAL");
        System.out.print("> ");
        String categoria = scanner.next();

        CategoriaFilme categoriaFilme;
        switch (categoria) {
            case "F":
                categoriaFilme = CategoriaFilme.DRAMA;
                break;
            case "P":
                categoriaFilme = CategoriaFilme.COMÉDIA;
                break;
            case "R":
                categoriaFilme = CategoriaFilme.SUSPENSE;
                break;
            case "I":
                categoriaFilme = CategoriaFilme.TERROR;
                break;
            case "S":
                categoriaFilme = CategoriaFilme.AÇÃO;
                break;
            case "M":
                categoriaFilme = CategoriaFilme.MUSICAL;
                break;
            default:
                categoriaFilme = CategoriaFilme.DRAMA;
                break;
        }

        Filme atualizacao = new Filme(nome, diretor, categoriaFilme, LocalDate.of(ano, mes, dia), sinopse);

        Filme filmeAtualizado = gerenciador.editar(id, atualizacao);

        if (filmeAtualizado == null) {
            System.out.println("Filme não encontrado");
        } else {
            System.out.println(filmeAtualizado);
        }
        return filmeAtualizado;
    }

    private List<Filme> listar() {
        System.out.println("\nListagem de Filme...");
        List<Filme> filmes = gerenciador.listar();

        for (Filme filme : filmes) {
            System.out.println(filme);
        }
        return filmes;
    }

    public void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de Filme...");
        System.out.println("Qual o código do filme?");

        System.out.print("> ");
        int id = scanner.nextInt();

        Filme filme = gerenciador.procurar(id);

        if (filme == null) {
            System.out.println("Filme não encontrado.");
        } else {
            System.out.println(filme);
        }
    }

    private void deletar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de Filme...");
        System.out.println("Qual filme deseja deletar?");

        List<Filme> filmes = gerenciador.listar();

        for (Filme filme : filmes) {
            System.out.println(filme);
        }

        System.out.print("Digite o ID do filme: ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Filme deletado.");
        } else {
            System.out.println("Filme não encontrado.");
        }
    }
}
