package br.com.reset.tinderevolution.gerenciador;

import br.com.reset.tinderevolution.dominio.Musica;
import br.com.reset.tinderevolution.dominio.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class Matches {

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
//        throw new RuntimeException("Usuário não havia curtido esse usuário");
        return null;
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
}
