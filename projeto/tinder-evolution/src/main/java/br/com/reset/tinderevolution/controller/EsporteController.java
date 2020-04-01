package br.com.reset.tinderevolution.controller;

import br.com.reset.tinderevolution.dominio.Esporte;
import br.com.reset.tinderevolution.gerenciador.EsporteGerenciador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("esportes")
public class EsporteController {

    @Autowired
    private EsporteGerenciador gerenciador;

    @GetMapping
    public List<Esporte> listar() {
        return gerenciador.listar();
    }

    @GetMapping("{id}")
    public Esporte procurar(@PathVariable("id") int id) {
        return gerenciador.procurar(id);
    }

    @PostMapping
    public Esporte salvar(@RequestBody Esporte esporte) {
        return gerenciador.salvar(esporte);
    }

    @PutMapping("{id}")
    public Esporte editar(@PathVariable("id") int id, @RequestBody Esporte esporte) {
        return gerenciador.editar(id, esporte);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable("id") int id) {
        gerenciador.deletar(id);
    }
}
