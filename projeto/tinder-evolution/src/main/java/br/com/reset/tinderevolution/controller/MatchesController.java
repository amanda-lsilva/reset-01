package br.com.reset.tinderevolution.controller;

import br.com.reset.tinderevolution.dominio.Musica;
import br.com.reset.tinderevolution.dominio.Usuario;
import br.com.reset.tinderevolution.gerenciador.LikeDislike;
import br.com.reset.tinderevolution.gerenciador.Matches;
import br.com.reset.tinderevolution.gerenciador.UsuarioGerenciador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("matches")
public class MatchesController {

    @Autowired
    private Matches gerenciadorMatches;

    //Listar Matches
    @GetMapping("{id-usuario}")
    public List<Usuario> listarMatches(@PathVariable("id-usuario") int id) {
        return gerenciadorMatches.listarMatchesUsuario(id);
    }

    @PostMapping("/{id-avaliado}/avaliador/{id-avaliador}")
    public Usuario curtirUsuario(@PathVariable("id-avaliado") int id, @PathVariable("id-avaliador") int idAvaliador) {
        return gerenciadorMatches.likeUsuario(id, idAvaliador);
    }

    @DeleteMapping("/{id-avaliado}/avaliador/{id-avaliador}")
    public Usuario descurtirUsuario(@PathVariable("id-avaliado") int id, @PathVariable("id-avaliador") int idAvaliador){
        return gerenciadorMatches.dislikeUsuario(id, idAvaliador);
    }
}
