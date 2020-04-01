package br.com.reset.tinderevolution.gerenciador;

import br.com.reset.tinderevolution.acervo.BibliotecaMusical;
import br.com.reset.tinderevolution.dominio.Musica;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

// Regras de Negócio do Cadastro de Músicas
@Service
public class MusicaGerenciador {

    private BibliotecaMusical biblioteca = new BibliotecaMusical();

    // Salvar Música
    public Musica salvar(Musica musica) {

        List<Musica> musicas = biblioteca.listar();

        // Validação se a música já existe com o mesmo nome
        for (Musica musicaExistente : musicas) {
            if (musica.getNome().equals(musicaExistente.getNome())) {
                System.out.println("Música já existente.");
                return musicaExistente;
            }
        }

        // Validação se todos os campos foram preenchidos
        if (musica.getNome().isEmpty() || musica.getArtista().isEmpty() || musica.getEstiloMusical() == null || musica.getLancamento() == null) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }

        // Validação se a data de lançamento não é futura
        if (musica.getLancamento().isAfter(LocalDate.now())) {
            System.out.println("Data de lançamento não pode ser uma data futura.");
            return null;
        }
        return biblioteca.salvar(musica);
    }

    // Editar Música
    public Musica editar(int id, Musica musicaAtualizada) {
        Musica musicaParaEditar = procurar(id);
        if (musicaParaEditar == null) {
            return null;
        }
        // Validação se todos os campos foram preenchidos
        if (musicaAtualizada.getNome().isEmpty() || musicaAtualizada.getArtista().isEmpty() || musicaAtualizada.getEstiloMusical() == null || musicaAtualizada.getLancamento() == null) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }

        // Validação se a data de lançamento não é futura
        if (musicaAtualizada.getLancamento().isAfter(LocalDate.now())) {
            System.out.println("Data de lançamento não pode ser uma data futura.");
            return null;
        }
        else {
            return biblioteca.editar(musicaParaEditar, musicaAtualizada);
        }
    }

    // Listar Música
    public List<Musica> listar() {
        return biblioteca.listar();
    }

    // Procurar Música
    public Musica procurar(int id) {
        if (id > 0) {
            return biblioteca.procurar(id);
        }
        return null;
    }

    // Deletar Música
    public boolean deletar(int id) {
        if (id > 0) {
            return biblioteca.deletar(id);
        }
        return false;
    }
}