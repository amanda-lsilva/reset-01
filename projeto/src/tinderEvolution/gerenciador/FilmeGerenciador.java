package tinderEvolution.gerenciador;

import tinderEvolution.acervo.RepositorioFilmes;
import tinderEvolution.dominio.Filme;

import java.time.LocalDate;
import java.util.List;

// Regras de Negócio do Cadastro de Filmes
public class FilmeGerenciador {

    private RepositorioFilmes repositorio = new RepositorioFilmes();

    // Salvar Filme
    public Filme salvar(Filme filme) {

        List<Filme> filmes = repositorio.listar();

        // Validação se o filme já existe com o mesmo nome
        for (Filme filmeExistente : filmes) {
            if (filme.getNome().equals(filmeExistente.getNome())) {
                System.out.println("Filme já existente.");
                return filmeExistente;
            }
        }

        // Validação se todos os campos foram preenchidos
        if (filme.getNome().isEmpty() || filme.getDiretor().isEmpty() || filme.getCategoriaFilme() == null || filme.getLancamento() == null || filme.getSinopse().isEmpty()) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }

        // Validação se a data de lançamento não é futura
        if (filme.getLancamento().isAfter(LocalDate.now())) {
            System.out.println("Data de lançamento não pode ser uma data futura.");
            return null;
        }
        return repositorio.salvar(filme);
    }

    // Editar Filme
    public Filme editar(int id, Filme filmeAtualizado) {
        Filme filmeParaEditar = procurar(id);
        if (filmeParaEditar == null) {
            return null;
        } else {
            return repositorio.editar(filmeParaEditar, filmeAtualizado);
        }
    }

    // Listar Filme
    public List<Filme> listar() {
        return repositorio.listar();
    }

    // Procurar Filme
    public Filme procurar(int id) {
        if (id > 0) {
            return repositorio.procurar(id);
        }
        return null;
    }

    // Deletar Filme
    public boolean deletar(int id) {
        if (id > 0) {
            return repositorio.deletar(id);
        }
        return false;
    }
}