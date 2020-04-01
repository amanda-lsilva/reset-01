package br.com.reset.tinderevolution.gerenciador;

import br.com.reset.tinderevolution.acervo.RepositorioFilme;
import br.com.reset.tinderevolution.dominio.Filme;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

// Regras de Negócio do Cadastro de Filmes
@Service
public class FilmeGerenciador {

    private RepositorioFilme repositorio = new RepositorioFilme();

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
        }
        // Validação se todos os campos foram preenchidos
        if (filmeAtualizado.getNome().isEmpty() || filmeAtualizado.getDiretor().isEmpty() || filmeAtualizado.getCategoriaFilme() == null || filmeAtualizado.getLancamento() == null || filmeAtualizado.getSinopse().isEmpty()) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }

        // Validação se a data de lançamento não é futura
        if (filmeAtualizado.getLancamento().isAfter(LocalDate.now())) {
            System.out.println("Data de lançamento não pode ser uma data futura.");
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