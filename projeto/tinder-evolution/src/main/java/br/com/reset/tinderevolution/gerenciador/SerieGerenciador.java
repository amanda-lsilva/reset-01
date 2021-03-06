package br.com.reset.tinderevolution.gerenciador;

import br.com.reset.tinderevolution.acervo.RepositorioSerie;
import br.com.reset.tinderevolution.dominio.Serie;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

// Regras de Negócio do Cadastro de Séries
@Service
public class SerieGerenciador {

    private RepositorioSerie repositorio = new RepositorioSerie();

    // Salvar Série
    public Serie salvar(Serie serie) {

        List<Serie> series = repositorio.listar();

        // Validação se a serie já existe com o mesmo nome
        for (Serie serieExistente : series) {
            if (serie.getNome().equals(serieExistente.getNome())) {
                System.out.println("Serie já existente.");
                return serieExistente;
            }
        }

        // Validação se todos os campos foram preenchidos
        if (serie.getNome().isEmpty() || serie.getDiretor().isEmpty() || serie.getCategoriaSerie() == null || serie.getLancamento() == null || serie.getSinopse().isEmpty()) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }

        //Validação se possui uma temporada e um episódio por temporada
        if (serie.getTemporada() < 1 && serie.getEpisodio() < serie.getTemporada()) {
            System.out.println("Deve existir ao menos uma temporada e ao menos um episódio por temporada.");
            return null;
        }

        // Validação se a data de lançamento não é futura
        if (serie.getLancamento().isAfter(LocalDate.now())) {
            System.out.println("Data de lançamento não pode ser uma data futura.");
            return null;
        }
        return repositorio.salvar(serie);
    }

    // Editar Série
    public Serie editar(int id, Serie serieAtualizada) {
        Serie serieParaEditar = procurar(id);
        if (serieParaEditar == null) {
            return null;
        }
        // Validação se todos os campos foram preenchidos
        if (serieAtualizada.getNome().isEmpty() || serieAtualizada.getDiretor().isEmpty() || serieAtualizada.getCategoriaSerie() == null || serieAtualizada.getLancamento() == null || serieAtualizada.getSinopse().isEmpty()) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }
        //Validação se possui uma temporada e um episódio por temporada
        if (serieAtualizada.getTemporada() < 1 && serieAtualizada.getEpisodio() < serieAtualizada.getTemporada()) {
            System.out.println("Deve existir ao menos uma temporada e ao menos um episódio por temporada.");
            return null;
        }
        // Validação se a data de lançamento não é futura
        if (serieAtualizada.getLancamento().isAfter(LocalDate.now())) {
            System.out.println("Data de lançamento não pode ser uma data futura.");
            return null;
        } else {
            return repositorio.editar(serieParaEditar, serieAtualizada);
        }
    }

    // Listar Série
    public List<Serie> listar() {
        return repositorio.listar();
    }

    // Procurar Série
    public Serie procurar(int id) {
        if (id > 0) {
            return repositorio.procurar(id);
        }
        return null;
    }

    // Deletar Série
    public boolean deletar(int id) {
        if (id > 0) {
            return repositorio.deletar(id);
        }
        return false;
    }
}
