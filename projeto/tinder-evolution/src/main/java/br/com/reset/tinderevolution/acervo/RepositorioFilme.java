package br.com.reset.tinderevolution.acervo;

import br.com.reset.tinderevolution.dominio.Filme;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

// Criação e Manutenção do Repositório de Filmes
@Repository
public class RepositorioFilme {

    private static int contador = 1;
    private static final List<Filme> filmes = new ArrayList<>();

    public Filme salvar(Filme filme) {
        filme.setId(contador++);
        filmes.add(filme);
        return filme;
    }

    public List<Filme> listar() {
        return filmes;
    }

    public Filme procurar(int id) {
        for (Filme filme : filmes) {
            if (filme.getId() == id) {
                return filme;
            }
        }
        return null;
    }

    public boolean deletar(int id) {
        Filme filmeParaDeletar = procurar(id);
        if (filmeParaDeletar != null) {
            return filmes.remove(filmeParaDeletar);
        }
        return false;
    }

    public Filme editar(Filme filmeParaEditar, Filme filmeAtualizado) {
        filmeParaEditar.setNome(filmeAtualizado.getNome());
        filmeParaEditar.setDiretor(filmeAtualizado.getDiretor());
        filmeParaEditar.setLancamento(filmeAtualizado.getLancamento());
        filmeParaEditar.setCategoriaFilme(filmeAtualizado.getCategoriaFilme());
        filmeParaEditar.setSinopse(filmeAtualizado.getSinopse());

        return filmeParaEditar;
    }
}
