package br.com.reset.tinderevolution.console;

import br.com.reset.tinderevolution.dominio.CategoriaJogo;
import br.com.reset.tinderevolution.dominio.Jogo;
import br.com.reset.tinderevolution.dominio.PlataformaJogo;
import br.com.reset.tinderevolution.gerenciador.JogoGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

// Menu de Funcionalidade do Jogo
public class JogoMenu {

    private JogoGerenciador gerenciador;

    public JogoMenu() {
        this.gerenciador = new JogoGerenciador();
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

    public Jogo criar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCriação de Jogo...");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Publisher: ");
        String publisher = scanner.nextLine();

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

        CategoriaJogo categoriaJogo;
        switch (categoria) {
            case "D":
                categoriaJogo = CategoriaJogo.DRAMA;
                break;
            case "C":
                categoriaJogo = CategoriaJogo.COMÉDIA;
                break;
            case "S":
                categoriaJogo = CategoriaJogo.SUSPENSE;
                break;
            case "T":
                categoriaJogo = CategoriaJogo.TERROR;
                break;
            case "A":
                categoriaJogo = CategoriaJogo.AÇÃO;
                break;
            case "M":
                categoriaJogo = CategoriaJogo.MUSICAL;
                break;
            default:
                categoriaJogo = CategoriaJogo.DRAMA;
                break;
        }

        System.out.println("Plataforma:");
        System.out.println("[ 1 ] XBOX");
        System.out.println("[ 2 ] PS4");
        System.out.println("[ 3 ] PC");
        System.out.println("[ 4 ] SNES");
        System.out.print("> ");
        int plataforma = scanner.nextInt();

        PlataformaJogo plataformaJogo;
        switch (plataforma) {
            case 1:
                plataformaJogo = PlataformaJogo.XBOX;
                break;
            case 2:
                plataformaJogo = PlataformaJogo.PS4;
                break;
            case 3:
                plataformaJogo = PlataformaJogo.PC;
                break;
            case 4:
                plataformaJogo = PlataformaJogo.SNES;
                break;
            default:
                plataformaJogo = PlataformaJogo.XBOX;
                break;
        }

        Jogo jogo = new Jogo(nome, publisher, categoriaJogo, LocalDate.of(ano, mes, dia), plataformaJogo);
        return gerenciador.salvar(jogo);
    }

    public Jogo editar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEdição de Jogo...");
        System.out.println("Qual jogo deseja editar?");

        List<Jogo> jogos = gerenciador.listar();
        for (Jogo jogo : jogos) {
            System.out.println("[ " + jogo.getId() + " ] - " + jogo.getNome());
        }

        System.out.print("Digite o ID do jogo: ");
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

        CategoriaJogo categoriaJogo;
        switch (categoria) {
            case "D":
                categoriaJogo = CategoriaJogo.DRAMA;
                break;
            case "C":
                categoriaJogo = CategoriaJogo.COMÉDIA;
                break;
            case "S":
                categoriaJogo = CategoriaJogo.SUSPENSE;
                break;
            case "T":
                categoriaJogo = CategoriaJogo.TERROR;
                break;
            case "A":
                categoriaJogo = CategoriaJogo.AÇÃO;
                break;
            case "M":
                categoriaJogo = CategoriaJogo.MUSICAL;
                break;
            default:
                categoriaJogo = CategoriaJogo.DRAMA;
                break;
        }

        System.out.println("Plataforma:");
        System.out.println("[ 1 ] XBOX");
        System.out.println("[ 2 ] PS4");
        System.out.println("[ 3 ] PC");
        System.out.println("[ 4 ] SNES");
        System.out.print("> ");
        int plataforma = scanner.nextInt();

        PlataformaJogo plataformaJogo;
        switch (plataforma) {
            case 1:
                plataformaJogo = PlataformaJogo.XBOX;
                break;
            case 2:
                plataformaJogo = PlataformaJogo.PS4;
                break;
            case 3:
                plataformaJogo = PlataformaJogo.PC;
                break;
            case 4:
                plataformaJogo = PlataformaJogo.SNES;
                break;
            default:
                plataformaJogo = PlataformaJogo.XBOX;
                break;
        }

        Jogo atualizacao = new Jogo(nome, diretor, categoriaJogo, LocalDate.of(ano, mes, dia), plataformaJogo);

        Jogo jogoAtualizado = gerenciador.editar(id, atualizacao);

        if (jogoAtualizado == null) {
            System.out.println("Jogo não encontrado");
        } else {
            System.out.println(jogoAtualizado);
        }
        return jogoAtualizado;
    }

    private List<Jogo> listar() {
        System.out.println("\nListagem do Jogo...");
        List<Jogo> jogos = gerenciador.listar();

        for (Jogo jogo : jogos) {
            System.out.println(jogo);
        }
        return jogos;
    }

    public void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa do Jogo...");
        System.out.println("Qual o código do jogo?");

        System.out.print("> ");
        int id = scanner.nextInt();

        Jogo jogo = gerenciador.procurar(id);

        if (jogo == null) {
            System.out.println("Jogo não encontrado.");
        } else {
            System.out.println(jogo);
        }
    }

    private void deletar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão do Jogo...");
        System.out.println("Qual jogo deseja deletar?");

        List<Jogo> jogos = gerenciador.listar();

        for (Jogo jogo : jogos) {
            System.out.println(jogo);
        }

        System.out.print("Digite o ID do jogo: ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Jogo deletado.");
        } else {
            System.out.println("Jogo não encontrado.");
        }
    }
}
