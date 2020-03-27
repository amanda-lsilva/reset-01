package tinderEvolution.gerenciador;

import tinderEvolution.acervo.ListaUsuario;
import tinderEvolution.dominio.Usuario;

import java.util.List;

// Regras de Negócio do Cadastro de Usuários
public class UsuarioGerenciador {

    private ListaUsuario lista = new ListaUsuario();

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
        // Falta validar latitude e longitude
        if (usuario.getNome().isEmpty() || usuario.getEmail().isEmpty() || usuario.getTelefone().isEmpty() || usuario.getDataNascimento() == null || usuario.getBio().isEmpty()) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }

        return lista.salvar(usuario);
    }

    // Editar Usuário
    public Usuario editar(int id, Usuario usuarioAtualizado) {
        Usuario usuarioParaEditar = procurar(id);
        if (usuarioParaEditar == null) {
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
}
