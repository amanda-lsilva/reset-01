package br.com.reset.aula04.rest;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("usuarios")
public class Controller {

    private static int contador = 1;
    public List<Usuario> usuarios = new ArrayList<>();

    @GetMapping
    public List<Usuario> listaUsuarios() {
        return usuarios;
    }

    @GetMapping("{id}")
    public Usuario listaUsuarios(@PathVariable("id") int id) {
        for (Usuario pessoa : usuarios) {
            if (pessoa.getId() == id) {
                return pessoa;
            }
        }
        return null;
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        usuario.setId(contador);
        usuarios.add(usuario);
        contador++;
        return usuario;
    }

    @PutMapping("{id}")
    public Usuario editarUsuario(@PathVariable("id") int id, @RequestBody Usuario usuario) {
        for (Usuario pessoa : usuarios) {
            if (pessoa.getId() == id) {
                pessoa.setNome(usuario.getNome());
                pessoa.setIdade(usuario.getIdade());
                return usuario;
            }
        }
        return null;
    }

    @DeleteMapping("{id}")
    public Usuario deletarUsuario(@PathVariable("id") int id) {
        for (Usuario pessoa : usuarios) {
            if (pessoa.getId() == id) {
                usuarios.remove(pessoa);
                return pessoa;
            }
        }
        return null;
    }
}
