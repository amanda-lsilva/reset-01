package br.com.reset.tinderevolution.controller;

import br.com.reset.tinderevolution.dominio.Filme;
import br.com.reset.tinderevolution.gerenciador.FilmeGerenciador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("filmes")
public class FilmeController {

    @Autowired
    private FilmeGerenciador gerenciador;

    @GetMapping
    public List<Filme> listar() {
        return gerenciador.listar();
    }

    @GetMapping("{id}")
    public Filme procurar(@PathVariable("id") int id) {
        return gerenciador.procurar(id);
    }

    @PostMapping
    public Filme salvar(@RequestBody Filme filme) {
        return gerenciador.salvar(filme);
    }

    @PutMapping("{id}")
    public Filme editar(@PathVariable("id") int id, @RequestBody Filme filme) {
        return gerenciador.editar(id, filme);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable("id") int id) {
        gerenciador.deletar(id);
    }
}

