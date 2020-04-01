package br.com.reset.tinderevolution.console;

import br.com.reset.tinderevolution.dominio.CategoriaCuriosidade;
import br.com.reset.tinderevolution.dominio.Curiosidade;
import br.com.reset.tinderevolution.gerenciador.CuriosidadeGerenciador;

import java.util.List;
import java.util.Scanner;

// Menu de Funcionalidade da Curiosidade
public class CuriosidadeMenu {

    private CuriosidadeGerenciador gerenciador;

    public CuriosidadeMenu() {
        this.gerenciador = new CuriosidadeGerenciador();
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

    public Curiosidade criar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCriação de Curiosidade...");

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.println("Categoria:");
        System.out.println("[ 1 ] COMPORTAMENTO");
        System.out.println("[ 2 ] EVENTO");
        System.out.println("[ 3 ] APARÊNCIA");
        System.out.println("[ 4 ] ALIMENTAÇÃO");
        System.out.print("> ");
        int categoria = scanner.nextInt();

        CategoriaCuriosidade categoriaCuriosidade;
        switch (categoria) {
            case 1:
                categoriaCuriosidade = CategoriaCuriosidade.COMPORTAMENTO;
                break;
            case 2:
                categoriaCuriosidade = CategoriaCuriosidade.EVENTO;
                break;
            case 3:
                categoriaCuriosidade = CategoriaCuriosidade.APARÊNCIA;
                break;
            case 4:
                categoriaCuriosidade = CategoriaCuriosidade.ALIMENTAÇÃO;
                break;
            default:
                categoriaCuriosidade = CategoriaCuriosidade.COMPORTAMENTO;
                break;
        }

        Curiosidade curiosidade = new Curiosidade(descricao, categoriaCuriosidade);
        return gerenciador.salvar(curiosidade);
    }

    public Curiosidade editar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEdição de Curiosidade...");
        System.out.println("Qual curiosidade deseja editar?");

        List<Curiosidade> curiosidades = gerenciador.listar();
        for (Curiosidade curiosidade : curiosidades) {
            System.out.println("[ " + curiosidade.getId() + " ] - " + curiosidade.getDescricao());
        }

        System.out.print("Digite o ID do curiosidade: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.println("Categoria:");
        System.out.println("[ 1 ] COMPORTAMENTO");
        System.out.println("[ 2 ] EVENTO");
        System.out.println("[ 3 ] APARÊNCIA");
        System.out.println("[ 4 ] ALIMENTAÇÃO");
        System.out.print("> ");
        int categoria = scanner.nextInt();

        CategoriaCuriosidade categoriaCuriosidade;
        switch (categoria) {
            case 1:
                categoriaCuriosidade = CategoriaCuriosidade.COMPORTAMENTO;
                break;
            case 2:
                categoriaCuriosidade = CategoriaCuriosidade.EVENTO;
                break;
            case 3:
                categoriaCuriosidade = CategoriaCuriosidade.APARÊNCIA;
                break;
            case 4:
                categoriaCuriosidade = CategoriaCuriosidade.ALIMENTAÇÃO;
                break;
            default:
                categoriaCuriosidade = CategoriaCuriosidade.COMPORTAMENTO;
                break;
        }

        Curiosidade atualizacao = new Curiosidade(descricao, categoriaCuriosidade);

        Curiosidade curiosidadeAtualizada = gerenciador.editar(id, atualizacao);

        if (curiosidadeAtualizada == null) {
            System.out.println("Curiosidade não encontrada");
        } else {
            System.out.println(curiosidadeAtualizada);
        }
        return curiosidadeAtualizada;
    }

    private List<Curiosidade> listar() {
        System.out.println("\nListagem de Curiosidade...");
        List<Curiosidade> curiosidades = gerenciador.listar();

        for (Curiosidade curiosidade : curiosidades) {
            System.out.println(curiosidade);
        }
        return curiosidades;
    }

    public void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de Curiosidade...");
        System.out.println("Qual o código da curiosidade?");

        System.out.print("> ");
        int id = scanner.nextInt();

        Curiosidade curiosidade = gerenciador.procurar(id);

        if (curiosidade == null) {
            System.out.println("Curiosidade não encontrada.");
        } else {
            System.out.println(curiosidade);
        }
    }

    private void deletar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de Curiosidade...");
        System.out.println("Qual curiosidade deseja deletar?");

        List<Curiosidade> curiosidades = gerenciador.listar();

        for (Curiosidade curiosidade : curiosidades) {
            System.out.println(curiosidade);
        }

        System.out.print("Digite o ID da curiosidade: ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Curiosidade deletada.");
        } else {
            System.out.println("Curiosidade não encontrada.");
        }
    }
}

