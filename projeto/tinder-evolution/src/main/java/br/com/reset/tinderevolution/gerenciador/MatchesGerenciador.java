package br.com.reset.tinderevolution.gerenciador;

import br.com.reset.tinderevolution.dominio.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class MatchesGerenciador {

    UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();

    //Curtir Usuário
    public Usuario likeUsuario(int idUsuarioLike, int idUsuario) {
        Usuario usuario = usuarioGerenciador.procurar(idUsuario);
        Usuario usuarioLike = usuarioGerenciador.procurar(idUsuarioLike);
        usuario.salvarUsuario(usuarioLike);
        usuario.salvarMatch(usuarioLike);
        usuario.salvarMatch(usuario);
        return usuario;
    }

    //Descurtir Usuário
    public Usuario dislikeUsuario(int idUsuarioLike, int idUsuario) {
        Usuario usuario = usuarioGerenciador.procurar(idUsuario);
        Usuario usuarioMatch = usuarioGerenciador.procurar(idUsuarioLike);
        for (Iterator<Usuario> i = usuario.listarUsuariosCurtidos().iterator(); i.hasNext(); ) {
            Usuario usuarioLike = i.next();
            if (usuarioLike.getId() == idUsuarioLike) {
                i.remove();
            }
        }
        for (Iterator<Usuario> i = usuario.listarMatches().iterator(); i.hasNext(); ) {
            Usuario usuarioLike = i.next();
            if (usuarioLike.getId() == idUsuarioLike) {
                i.remove();
            }
        }
        for (Iterator<Usuario> i = usuarioMatch.listarUsuariosCurtidos().iterator(); i.hasNext(); ) {
            Usuario usuarioMatchDeletar = i.next();
            if (usuarioMatchDeletar.getId() == idUsuario) {
                i.remove();
            }
        }
        for (Iterator<Usuario> i = usuarioMatch.listarMatches().iterator(); i.hasNext(); ) {
            Usuario usuarioMatchDeletar = i.next();
            if (usuarioMatchDeletar.getId() == idUsuario) {
                i.remove();
            }
        }
        throw new RuntimeException("Usuário não havia curtido esse usuário");
    }

    //Listar likes por usuário
    public List<Usuario> listarLikes(int idUsuario) {
        Usuario usuario = usuarioGerenciador.procurar(idUsuario);
        return usuario.listarUsuariosCurtidos();
    }

    //Listar Matches
    public List<Usuario> listarMatchesUsuario(int id) {
        Usuario listaUsuario = usuarioGerenciador.procurar(id);
        return listaUsuario.listarMatches();
    }

    public Usuario criarBest(int id) {
        Usuario usuarioBest = null;
        int pontuacaoUsuarioBest = 0;
        Usuario usuario = usuarioGerenciador.procurar(id);
        for (Usuario usuarioBestAtual : usuarioGerenciador.listar()) {
            if (usuarioBestAtual.getId() == usuario.getId()) {
                continue;
            }
            for (Usuario usuarioAtualMatch : usuario.listarMatches()) {
                if (usuarioBestAtual.getId() == usuarioAtualMatch.getId()) {
                    continue;
                }
                int contadorMusica = 0;
                int contadorFilme = 0;
                int contadorSerie = 0;
                int contadorJogo = 0;
                int contadorEsporte = 0;
                for (Musica musicaCurtida : usuario.getMusicasCurtidas()) {
                    for (Musica musicaDoBest : usuarioBestAtual.getMusicasCurtidas()) {
                        if (musicaDoBest.getId() == musicaCurtida.getId()) {
                            contadorMusica++;
                        }
                    }
                }
                for (Filme filmeCurtido : usuario.getFilmesCurtidos()) {
                    for (Filme filmeDoBest : usuarioBestAtual.getFilmesCurtidos()) {
                        if (filmeDoBest.getId() == filmeCurtido.getId()) {
                            contadorFilme++;
                        }
                    }
                }
                for (Serie serieCurtida : usuario.getSeriesCurtidas()) {
                    for (Serie serieDoBest : usuarioBestAtual.getSeriesCurtidas()) {
                        if (serieDoBest.getId() == serieCurtida.getId()) {
                            contadorSerie++;
                        }
                    }
                }
                for (Jogo jogoCurtido : usuario.getJogosCurtidos()) {
                    for (Jogo jogoDoBest : usuarioBestAtual.getJogosCurtidos()) {
                        if (jogoDoBest.getId() == jogoCurtido.getId()) {
                            contadorJogo++;
                        }
                    }
                }
                for (Esporte esporteCurtido : usuario.getEsportesCurtidos()) {
                    for (Esporte esporteDoBest : usuarioBestAtual.getEsportesCurtidos()) {
                        if (esporteDoBest.getId() == esporteCurtido.getId()) {
                            contadorEsporte++;
                        }
                    }
                }
                int pontuacaoUsuarioAtual = contadorMusica + contadorFilme + contadorSerie + contadorJogo + contadorEsporte;
                if (usuarioBest == null) {
                    usuarioBest = usuarioBestAtual;
                    pontuacaoUsuarioBest = pontuacaoUsuarioAtual;
                }
                if (pontuacaoUsuarioAtual > pontuacaoUsuarioBest) {
                    usuarioBest = usuarioBestAtual;
                    pontuacaoUsuarioBest = pontuacaoUsuarioAtual;
                }
            }
        }
        return usuarioBest;
    }
}

