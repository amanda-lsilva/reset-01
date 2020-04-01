package br.com.reset.tinderevolution.gerenciador;

import br.com.reset.tinderevolution.acervo.AcervoCuriosidade;
import br.com.reset.tinderevolution.dominio.Curiosidade;
import org.springframework.stereotype.Service;

import java.util.List;

// Regras de Negócio do Cadastro de Curiosidades
@Service
public class CuriosidadeGerenciador {

    private AcervoCuriosidade acervo = new AcervoCuriosidade();

    // Salvar Curiosidade
    public Curiosidade salvar(Curiosidade curiosidade) {

        List<Curiosidade> curiosidades = acervo.listar();

        // Validação se a curiosidade já existe com a mesma descrição
        for (Curiosidade curiosidadeExistente : curiosidades) {
            if (curiosidade.getDescricao().equals(curiosidadeExistente.getDescricao())) {
                System.out.println("Curiosidade já existente.");
                return curiosidadeExistente;
            }
        }

        // Validação se todos os campos foram preenchidos
        if (curiosidade.getDescricao().isEmpty() || curiosidade.getCategoriaCuriosidade() == null) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }

        return acervo.salvar(curiosidade);
    }

    // Editar Curiosidade
    public Curiosidade editar(int id, Curiosidade curiosidadeAtualizada) {
        Curiosidade curiosidadeParaEditar = procurar(id);
        if (curiosidadeParaEditar == null) {
            return null;
        }
        // Validação se todos os campos foram preenchidos
        if (curiosidadeAtualizada.getDescricao().isEmpty() || curiosidadeAtualizada.getCategoriaCuriosidade() == null) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }
        else {
            return acervo.editar(curiosidadeParaEditar, curiosidadeAtualizada);
        }
    }

    // Listar Curiosidade
    public List<Curiosidade> listar() {
        return acervo.listar();
    }

    // Procurar Curiosidade
    public Curiosidade procurar(int id) {
        if (id > 0) {
            return acervo.procurar(id);
        }
        return null;
    }

    // Deletar Curiosidade
    public boolean deletar(int id) {
        if (id > 0) {
            return acervo.deletar(id);
        }
        return false;
    }
}

