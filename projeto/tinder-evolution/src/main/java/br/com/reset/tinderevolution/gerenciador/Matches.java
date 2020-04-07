package br.com.reset.tinderevolution.gerenciador;

import br.com.reset.tinderevolution.dominio.Musica;
import br.com.reset.tinderevolution.dominio.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Matches {

    UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();
    List<Usuario> matches = new ArrayList<>();

    //Curtir Usuário
    public Usuario likeUsuario(int idUsuarioLike, int idUsuario) {
        Usuario usuario = usuarioGerenciador.procurar(idUsuario);
        Usuario usuarioLike = usuarioGerenciador.procurar(idUsuarioLike);
        usuario.salvarUsuario(usuarioLike);
        return usuario;
    }

    //Descurtir Usuário
    public Usuario dislikeUsuario(int idUsuarioLike, int idUsuario) {
        Usuario usuario = usuarioGerenciador.procurar(idUsuario);
        for (Usuario usuarioLike : usuario.getUsuariosCurtidos()) {
            if (usuarioLike.getId() == idUsuarioLike) {
                usuario.deletarUsuario(usuarioLike);
            }
        }
        throw new RuntimeException("Usuário não havia curtido esse usuário");
    }

    //Listar likes por usuário
    public List<Usuario> listarLikes(int idUsuario) {
        Usuario listaUsuario = usuarioGerenciador.procurar(idUsuario);
        return listaUsuario.getUsuariosCurtidos();
    }

    //Criar Matches
    public void salvarMatches(int idUsuarioUm, int idUsuarioDois) {
        Usuario usuarioUm = usuarioGerenciador.procurar(idUsuarioUm);
        Usuario usuarioDois = usuarioGerenciador.procurar(idUsuarioDois);
        for (Usuario usuarioLike : usuarioUm.getUsuariosCurtidos()) {
            if (usuarioLike.getId() == idUsuarioDois) {
                matches.add(usuarioDois);
            }
        }

    }

    public List<Usuario> listarMatches(int idUsuario){
        Usuario listaUsuarioMatches = usuarioGerenciador.procurar(idUsuario);
        return matches;
    }
}
