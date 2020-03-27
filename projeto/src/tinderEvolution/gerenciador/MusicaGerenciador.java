package tinderEvolution.gerenciador;

import tinderEvolution.acervo.BibliotecaMusical;
import tinderEvolution.dominio.Musica;

import java.time.LocalDate;
import java.util.List;

public class MusicaGerenciador {

    private BibliotecaMusical biblioteca = new BibliotecaMusical();

    public Musica salvar(Musica musica) {

        List<Musica> musicas = biblioteca.listar();

        for (Musica musicaExistente : musicas) {
            if (musica.getNome().equals(musicaExistente.getNome())) {
                System.out.println("Música já existente.");
                return musicaExistente;
            }
        }
        if (musica.getNome().isEmpty() || musica.getArtista().isEmpty() || musica.getEstiloMusical() == null || musica.getLancamento() == null) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }
        if (musica.getLancamento().isAfter(LocalDate.now())) {
            System.out.println("Data de lançamento não pode ser uma data futura.");
            return null;
        }
        return biblioteca.salvar(musica);
    }

    public Musica editar(int id, Musica musicaAtualizada) {
        Musica musicaParaEditar = procurar(id);
        if (musicaParaEditar == null) {
            return null;
        } else {
            return biblioteca.editar(musicaParaEditar, musicaAtualizada);
        }
    }

    public List<Musica> listar() {
        return biblioteca.listar();
    }

    public Musica procurar(int id) {
        if (id > 0) {
            return biblioteca.procurar(id);
        }
        return null;
    }

    public boolean deletar(int id){
        if (id > 0 ){
            return biblioteca.deletar(id);
        }
        return false;
    }
}