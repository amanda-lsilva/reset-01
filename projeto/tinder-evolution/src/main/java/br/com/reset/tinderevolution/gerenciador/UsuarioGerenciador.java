package br.com.reset.tinderevolution.gerenciador;

import br.com.reset.tinderevolution.acervo.BibliotecaMusical;
import br.com.reset.tinderevolution.acervo.ListaUsuario;
import br.com.reset.tinderevolution.dominio.Musica;
import br.com.reset.tinderevolution.dominio.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

// Regras de Negócio do Cadastro de Usuários
@Service
public class UsuarioGerenciador {

    private ListaUsuario lista = new ListaUsuario();
    private BibliotecaMusical biblioteca = new BibliotecaMusical();

    // Salvar Usuário
    public Usuario salvar(Usuario usuario) {

        List<Usuario> usuarios = lista.listar();

        // Validação se o e-mail já existe
        for (Usuario emailExistente : usuarios) {
            if (usuario.getEmail().equals(emailExistente.getEmail())) {
                System.out.println("Email já existente.");
                return emailExistente;
            }
        }

        // Validação idade maior que 18 anos.
        if (usuario.idadeAtual(usuario.getDataNascimento()) < 18) {
            System.out.println("Somente para maiores de 18 anos.");
            return null;
        }

        // Validação se todos os campos foram preenchidos
        if (usuario.getNome().isEmpty() || usuario.getEmail().isEmpty() || usuario.getTelefone().isEmpty() || usuario.getDataNascimento() == null || usuario.getBio().isEmpty() || usuario.getLongitude() == null || usuario.getLatitude() == null) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }

        System.out.println("Usuário criado com sucesso!");
        return lista.salvar(usuario);
    }

    // Editar Usuário
    public Usuario editar(int id, Usuario usuarioAtualizado) {
        Usuario usuarioParaEditar = procurar(id);
        if (usuarioParaEditar == null) {
            return null;
        }
        // Validação idade maior que 18 anos.
        if (usuarioAtualizado.idadeAtual(usuarioAtualizado.getDataNascimento()) < 18) {
            System.out.println("Somente para maiores de 18 anos.");
            return null;
        }
        // Validação se todos os campos foram preenchidos
        if (usuarioAtualizado.getNome().isEmpty() || usuarioAtualizado.getEmail().isEmpty() || usuarioAtualizado.getTelefone().isEmpty() || usuarioAtualizado.getDataNascimento() == null || usuarioAtualizado.getBio().isEmpty() || usuarioAtualizado.getLongitude() == null || usuarioAtualizado.getLatitude() == null) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        } else {
            return lista.editar(usuarioParaEditar, usuarioAtualizado);
        }
    }

    // Listar Usuário
    public List<Usuario> listar() {
        return lista.listar();
    }

    // Procurar Usuário
    public Usuario procurar(int id) {
        if (id > 0) {
            return lista.procurar(id);
        }
        return null;
    }

    // Deletar Usuário
    public boolean deletar(int id) {
        if (id > 0) {
            return lista.deletar(id);
        }
        return false;
    }

    public Usuario curtirMusica (int idMusica, int idUsuario){
        Usuario usuarioCurtir = procurar(idUsuario);
        Musica musicaCurtida = biblioteca.procurar(idMusica);
        usuarioCurtir.salvarMusica(musicaCurtida);
        return usuarioCurtir;
    }

    public List<Musica> listarMusica (int idUsuaio){
        Usuario listaUsuario = procurar(idUsuaio);
        return listaUsuario.listarMusicasCurtidas();
    }
}
