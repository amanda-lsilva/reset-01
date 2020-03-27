package tinderEvolution.gerenciador;

import tinderEvolution.acervo.AcervoJogos;
import tinderEvolution.dominio.Jogo;

import java.time.LocalDate;
import java.util.List;

// Regras de Negócio do Cadastro de Jogos
public class JogoGerenciador {
    private AcervoJogos acervo = new AcervoJogos();

    // Salvar Jogo
    public Jogo salvar(Jogo jogo) {

        List<Jogo> jogos = acervo.listar();

        // Validação se o jogo já existe com o mesmo nome e na mesma plataforma
        for (Jogo jogoExistente : jogos) {
            if (jogo.getNome().equals(jogoExistente.getNome()) && jogo.getPlataforma() == jogoExistente.getPlataforma()) {
                System.out.println("Jogo já existente nesta plataforma.");
                return jogoExistente;
            }
        }

        // Validação se todos os campos foram preenchidos
        if (jogo.getNome().isEmpty() || jogo.getCategoriaJogo() == null || jogo.getLancamento() == null || jogo.getPlataforma() == null) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }

        // Validação se a data de lançamento não é futura
        if (jogo.getLancamento().isAfter(LocalDate.now())) {
            System.out.println("Data de lançamento não pode ser uma data futura.");
            return null;
        }
        return acervo.salvar(jogo);
    }

    // Editar Jogo
    public Jogo editar(int id, Jogo jogoAtualizado) {
        Jogo jogoParaEditar = procurar(id);
        if (jogoParaEditar == null) {
            return null;
        } else {
            return acervo.editar(jogoParaEditar, jogoAtualizado);
        }
    }

    // Listar Jogo
    public List<Jogo> listar() {
        return acervo.listar();
    }

    // Procurar Jogo
    public Jogo procurar(int id) {
        if (id > 0) {
            return acervo.procurar(id);
        }
        return null;
    }

    // Deletar Jogo
    public boolean deletar(int id) {
        if (id > 0) {
            return acervo.deletar(id);
        }
        return false;
    }
}
