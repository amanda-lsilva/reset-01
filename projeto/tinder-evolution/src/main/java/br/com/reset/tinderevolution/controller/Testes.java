package br.com.reset.tinderevolution.controller;

import br.com.reset.tinderevolution.dominio.Musica;
import br.com.reset.tinderevolution.dominio.Usuario;
import br.com.reset.tinderevolution.gerenciador.UsuarioGerenciador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("likes")
public class Testes {

    @Autowired
    private UsuarioGerenciador gerenciadorUsuario;

    @GetMapping ("{id-usuario}")
    public List<Musica> listarMusicasCurtidas(@PathVariable("id-usuario") int id) {
        return gerenciadorUsuario.listarMusica(id);
    }

    @PostMapping("/musica/{id-musica}/avaliador/{id-avaliador}")
    public Usuario curtirMusica(@PathVariable("id-musica") int id, @PathVariable("id-avaliador") int idAvaliador) {
        return gerenciadorUsuario.curtirMusica(id, idAvaliador);
    }
}
