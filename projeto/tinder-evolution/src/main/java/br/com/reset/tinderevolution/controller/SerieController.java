package br.com.reset.tinderevolution.controller;

import br.com.reset.tinderevolution.dominio.Serie;
import br.com.reset.tinderevolution.gerenciador.SerieGerenciador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("series")
public class SerieController {

    @Autowired
    private SerieGerenciador gerenciador;

    @GetMapping
    public List<Serie> listar() {
        return gerenciador.listar();
    }

    @GetMapping("{id}")
    public Serie procurar(@PathVariable("id") int id) {
        return gerenciador.procurar(id);
    }

    @PostMapping
    public Serie salvar(@RequestBody Serie serie) {
        return gerenciador.salvar(serie);
    }

    @PutMapping("{id}")
    public Serie editar(@PathVariable("id") int id, @RequestBody Serie serie) {
        return gerenciador.editar(id, serie);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable("id") int id) {
        gerenciador.deletar(id);
    }
}

