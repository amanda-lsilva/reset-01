package br.com.reset.tinderevolution.gerenciador;

import br.com.reset.tinderevolution.acervo.*;
import br.com.reset.tinderevolution.dominio.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikeDislikeGerenciador {

    private BibliotecaMusical bibliotecaMusical = new BibliotecaMusical();
    private UsuarioGerenciador gerenciadorUsuario = new UsuarioGerenciador();
    private RepositorioFilme repositorioFilme = new RepositorioFilme();
    private RepositorioSerie repositorioSerie = new RepositorioSerie();
    private AcervoJogo acervoJogo = new AcervoJogo();
    private ListaEsporte listaEsporte = new ListaEsporte();
    private AcervoCuriosidade acervoCuriosidade = new AcervoCuriosidade();

    //Música
    //Curtir música
    public Usuario curtirMusica(int idMusica, int idUsuario) {
        Usuario usuarioCurtirMusica = gerenciadorUsuario.procurar(idUsuario);
        Musica musicaCurtida = bibliotecaMusical.procurar(idMusica);
        usuarioCurtirMusica.salvarMusica(musicaCurtida);
        return usuarioCurtirMusica;
    }

    //Descurtir música
    public Usuario descurtirMusica(int idMusica, int idUsuario) {
        Usuario usuarioDescurtirMusica = gerenciadorUsuario.procurar(idUsuario);
        for (Musica musica : usuarioDescurtirMusica.getMusicasCurtidas()) {
            if (musica.getId() == idMusica) {
                usuarioDescurtirMusica.deletarMusica(musica);
            }
        }
        throw new RuntimeException("Usuário não havia curtido essa música");
    }

    //Listar música por usuário
    public List<Musica> listarMusica(int idUsuario) {
        Usuario listaUsuario = gerenciadorUsuario.procurar(idUsuario);
        return listaUsuario.getMusicasCurtidas();
    }

    //Filme
    //Curtir filme
    public Usuario curtirFilme(int idFilme, int idUsuario) {
        Usuario usuarioCurtirFilme = gerenciadorUsuario.procurar(idUsuario);
        Filme filmeCurtido = repositorioFilme.procurar(idFilme);
        usuarioCurtirFilme.salvarFilme(filmeCurtido);
        return usuarioCurtirFilme;
    }

    //Descurtir filme
    public Usuario descurtirFilme(int idFilme, int idUsuario) {
        Usuario usuarioDescurtirFilme = gerenciadorUsuario.procurar(idUsuario);
        for (Filme filme : usuarioDescurtirFilme.getFilmesCurtidos()) {
            if (filme.getId() == idFilme) {
                usuarioDescurtirFilme.deletarFilme(filme);
            }
        }
        throw new RuntimeException("Usuário não havia curtido esse filme");
    }

    //Listar filme por usuário
    public List<Filme> listarFilme(int idUsuario) {
        Usuario listaUsuario = gerenciadorUsuario.procurar(idUsuario);
        return listaUsuario.getFilmesCurtidos();
    }

    //Serie
    //Curtir serie
    public Usuario curtirSerie(int idSerie, int idUsuario) {
        Usuario usuarioCurtirSerie = gerenciadorUsuario.procurar(idUsuario);
        Serie serieCurtida = repositorioSerie.procurar(idSerie);
        usuarioCurtirSerie.salvarSerie(serieCurtida);
        return usuarioCurtirSerie;
    }

    //Descurtir serie
    public Usuario descurtirSerie(int idSerie, int idUsuario) {
        Usuario usuarioDescurtirSerie = gerenciadorUsuario.procurar(idUsuario);
        for (Serie serie : usuarioDescurtirSerie.getSeriesCurtidas()) {
            if (serie.getId() == idSerie) {
                usuarioDescurtirSerie.deletarSerie(serie);
            }
        }
        throw new RuntimeException("Usuário não havia curtido essa série");
    }

    //Listar serie por usuário
    public List<Serie> listarSerie(int idUsuario) {
        Usuario listaUsuario = gerenciadorUsuario.procurar(idUsuario);
        return listaUsuario.getSeriesCurtidas();
    }

    //Jogo
    //Curtir jogo
    public Usuario curtirJogo(int idJogo, int idUsuario) {
        Usuario usuarioCurtirJogo = gerenciadorUsuario.procurar(idUsuario);
        Jogo jogoCurtida = acervoJogo.procurar(idJogo);
        usuarioCurtirJogo.salvarJogo(jogoCurtida);
        return usuarioCurtirJogo;
    }

    //Descurtir jogo
    public Usuario descurtirJogo(int idJogo, int idUsuario) {
        Usuario usuarioDescurtirJogo = gerenciadorUsuario.procurar(idUsuario);
        for (Jogo jogo : usuarioDescurtirJogo.getJogosCurtidos()) {
            if (jogo.getId() == idJogo) {
                usuarioDescurtirJogo.deletarJogo(jogo);
            }
        }
        throw new RuntimeException("Usuário não havia curtido esse jogo");
    }

    //Listar jogo por usuário
    public List<Jogo> listarJogo(int idUsuario) {
        Usuario listaUsuario = gerenciadorUsuario.procurar(idUsuario);
        return listaUsuario.getJogosCurtidos();
    }

    //Esporte
    //Curtir esporte
    public Usuario curtirEsporte(int idEsporte, int idUsuario) {
        Usuario usuarioCurtirEsporte = gerenciadorUsuario.procurar(idUsuario);
        Esporte esporteCurtido = listaEsporte.procurar(idEsporte);
        usuarioCurtirEsporte.salvarEsporte(esporteCurtido);
        return usuarioCurtirEsporte;
    }

    //Descurtir esporte
    public Usuario descurtirEsporte(int idEsporte, int idUsuario) {
        Usuario usuarioDescurtirEsporte = gerenciadorUsuario.procurar(idUsuario);
        for (Esporte esporte : usuarioDescurtirEsporte.getEsportesCurtidos()) {
            if (esporte.getId() == idEsporte) {
                usuarioDescurtirEsporte.deletarEsporte(esporte);
            }
        }
        throw new RuntimeException("Usuário não havia curtido esse esporte");
    }

    //Listar esporte por usuário
    public List<Esporte> listarEsporte(int idUsuario) {
        Usuario listaUsuario = gerenciadorUsuario.procurar(idUsuario);
        return listaUsuario.getEsportesCurtidos();
    }

    //Curiosidade
    //Definir Curiosidade
    public Usuario definirCuriosidade(int idCuriosidade, int idUsuario) {
        Usuario usuarioCurtirCuriosidade = gerenciadorUsuario.procurar(idUsuario);
        Curiosidade CuriosidadeDefinida = acervoCuriosidade.procurar(idCuriosidade);
        usuarioCurtirCuriosidade.salvarCuriosidade(CuriosidadeDefinida);
        return usuarioCurtirCuriosidade;
    }

    //Descurtir Curiosidade
    public Usuario descurtirCuriosidade(int idCuriosidade, int idUsuario) {
        Usuario usuarioDescurtirCuriosidade = gerenciadorUsuario.procurar(idUsuario);
        for (Curiosidade Curiosidade : usuarioDescurtirCuriosidade.getCuriosidades()) {
            if (Curiosidade.getId() == idCuriosidade) {
                usuarioDescurtirCuriosidade.deletarCuriosidade(Curiosidade);
            }
        }
        throw new RuntimeException("Usuário não havia definido essa curiosidade");
    }

    //Listar Curiosidade por usuário
    public List<Curiosidade> listarCuriosidade(int idUsuario) {
        Usuario listaUsuario = gerenciadorUsuario.procurar(idUsuario);
        return listaUsuario.getCuriosidades();
    }

}
