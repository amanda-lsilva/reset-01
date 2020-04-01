package br.com.reset.tinderevolution.controller;

import br.com.reset.tinderevolution.dominio.Musica;
import br.com.reset.tinderevolution.gerenciador.MusicaGerenciador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("musicas")
public class MusicaController {

    @Autowired
    private MusicaGerenciador gerenciador;

    @GetMapping
    public List<Musica> listar() {
        return gerenciador.listar();
    }

    @GetMapping("{id}")
    public Musica procurar(@PathVariable("id") int id) {
        return gerenciador.procurar(id);
    }

    @PostMapping
    public Musica salvar(@RequestBody Musica musica) {
        return gerenciador.salvar(musica);
    }

    @PutMapping("{id}")
    public Musica editar(@PathVariable("id") int id, @RequestBody Musica musica){
        return gerenciador.editar(id, musica);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable("id") int id){
        gerenciador.deletar(id);
    }
}
