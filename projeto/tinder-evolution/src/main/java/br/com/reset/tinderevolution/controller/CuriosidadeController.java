package br.com.reset.tinderevolution.controller;

import br.com.reset.tinderevolution.dominio.Curiosidade;
import br.com.reset.tinderevolution.gerenciador.CuriosidadeGerenciador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("curiosidades")
public class CuriosidadeController {

    @Autowired
    private CuriosidadeGerenciador gerenciador;

    @GetMapping
    public List<Curiosidade> listar() {
        return gerenciador.listar();
    }

    @GetMapping("{id}")
    public Curiosidade procurar(@PathVariable("id") int id) {
        return gerenciador.procurar(id);
    }

    @PostMapping
    public Curiosidade salvar(@RequestBody Curiosidade curiosidade) {
        return gerenciador.salvar(curiosidade);
    }

    @PutMapping("{id}")
    public Curiosidade editar(@PathVariable("id") int id, @RequestBody Curiosidade curiosidade) {
        return gerenciador.editar(id, curiosidade);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable("id") int id) {
        gerenciador.deletar(id);
    }
}

