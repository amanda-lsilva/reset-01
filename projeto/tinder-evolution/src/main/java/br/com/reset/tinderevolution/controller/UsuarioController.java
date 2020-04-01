package br.com.reset.tinderevolution.controller;

import br.com.reset.tinderevolution.dominio.Usuario;
import br.com.reset.tinderevolution.gerenciador.UsuarioGerenciador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioGerenciador gerenciador;

    @GetMapping
    public List<Usuario> listar() {
        return gerenciador.listar();
    }

    @GetMapping("{id}")
    public Usuario procurar(@PathVariable("id") int id) {
        return gerenciador.procurar(id);
    }

    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario) {
        return gerenciador.salvar(usuario);
    }

    @PutMapping("{id}")
    public Usuario editar(@PathVariable("id") int id, @RequestBody Usuario usuario){
        return gerenciador.editar(id, usuario);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable("id") int id){
        gerenciador.deletar(id);
    }
}
