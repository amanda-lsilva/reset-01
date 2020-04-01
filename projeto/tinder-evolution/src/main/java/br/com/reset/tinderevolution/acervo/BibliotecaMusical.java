package br.com.reset.tinderevolution.acervo;

import java.util.List;
import java.util.ArrayList;

import br.com.reset.tinderevolution.dominio.Musica;
import org.springframework.stereotype.Repository;

// Criação e Manutenção da Biblioteca de Músicas
@Repository
public class BibliotecaMusical {

    private static int contador = 1;
    private static final List<Musica> musicas = new ArrayList<>();

    public Musica salvar(Musica musica) {
        musica.setId(contador++);
        musicas.add(musica);
        return musica;
    }

    public List<Musica> listar() {
        return musicas;
    }

    public Musica procurar(int id) {
        for (Musica musica : musicas) {
            if (musica.getId() == id) {
                return musica;
            }
        }
        return null;
    }

    public boolean deletar(int id) {
        Musica musicaParaDeletar = procurar(id);
        if (musicaParaDeletar != null) {
            return musicas.remove(musicaParaDeletar);
        }
        return false;
    }

    public Musica editar(Musica musicaParaEditar, Musica musicaAtualizada) {
        musicaParaEditar.setNome(musicaAtualizada.getNome());
        musicaParaEditar.setArtista(musicaAtualizada.getArtista());
        musicaParaEditar.setLancamento(musicaAtualizada.getLancamento());
        musicaParaEditar.setEstiloMusical(musicaAtualizada.getEstiloMusical());

        return musicaParaEditar;
    }
}
