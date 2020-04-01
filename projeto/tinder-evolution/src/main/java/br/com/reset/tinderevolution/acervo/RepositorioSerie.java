package br.com.reset.tinderevolution.acervo;

import br.com.reset.tinderevolution.dominio.Serie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

// Criação e Manutenção do Repositório de Séries
@Repository
public class RepositorioSerie {

    private static int contador = 1;
    private static final List<Serie> series = new ArrayList<>();

    public Serie salvar(Serie serie) {
        serie.setId(contador++);
        series.add(serie);
        return serie;
    }

    public List<Serie> listar() {
        return series;
    }

    public Serie procurar(int id) {
        for (Serie serie : series) {
            if (serie.getId() == id) {
                return serie;
            }
        }
        return null;
    }

    public boolean deletar(int id) {
        Serie serieParaDeletar = procurar(id);
        if (serieParaDeletar != null) {
            return series.remove(serieParaDeletar);
        }
        return false;
    }

    public Serie editar(Serie serieParaEditar, Serie serieAtualizada) {
        serieParaEditar.setNome(serieAtualizada.getNome());
        serieParaEditar.setDiretor(serieAtualizada.getDiretor());
        serieParaEditar.setLancamento(serieAtualizada.getLancamento());
        serieParaEditar.setCategoriaSerie(serieAtualizada.getCategoriaSerie());
        serieParaEditar.setSinopse(serieAtualizada.getSinopse());
        serieParaEditar.setEpisodio(serieAtualizada.getEpisodio());
        serieParaEditar.setTemporada(serieAtualizada.getTemporada());

        return serieParaEditar;
    }
}