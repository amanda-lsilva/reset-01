package br.com.reset.tinderevolution.controller;

import br.com.reset.tinderevolution.dominio.Jogo;
import br.com.reset.tinderevolution.gerenciador.JogoGerenciador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("jogos")
public class JogoController {

    @Autowired
    private JogoGerenciador gerenciador;

    @GetMapping
    public List<Jogo> listar() {
        return gerenciador.listar();
    }

    @GetMapping("{id}")
    public Jogo procurar(@PathVariable("id") int id) {
        return gerenciador.procurar(id);
    }

    @PostMapping
    public Jogo salvar(@RequestBody Jogo jogo) {
        return gerenciador.salvar(jogo);
    }

    @PutMapping("{id}")
    public Jogo editar(@PathVariable("id") int id, @RequestBody Jogo jogo) {
        return gerenciador.editar(id, jogo);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable("id") int id) {
        gerenciador.deletar(id);
    }
}