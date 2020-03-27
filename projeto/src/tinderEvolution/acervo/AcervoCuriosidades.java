package tinderEvolution.acervo;

import tinderEvolution.dominio.Curiosidade;

import java.util.ArrayList;
import java.util.List;

// Criação e Manutenção do Acervo de Curiosidades
public class AcervoCuriosidades {

    private static int contador = 1;
    private static final List<Curiosidade> curiosidades = new ArrayList<>();

    public Curiosidade salvar(Curiosidade curiosidade) {
        curiosidade.setId(contador++);
        curiosidades.add(curiosidade);
        return curiosidade;
    }

    public List<Curiosidade> listar() {
        return curiosidades;
    }

    public Curiosidade procurar(int id) {
        for (Curiosidade curiosidade : curiosidades) {
            if (curiosidade.getId() == id) {
                return curiosidade;
            }
        }
        return null;
    }

    public boolean deletar(int id) {
        Curiosidade curiosidadeParaDeletar = procurar(id);
        if (curiosidadeParaDeletar != null) {
            return curiosidades.remove(curiosidadeParaDeletar);
        }
        return false;
    }

    public Curiosidade editar(Curiosidade curiosidadeParaEditar, Curiosidade curiosidadeAtualizada) {
        curiosidadeParaEditar.setDescricao(curiosidadeAtualizada.getDescricao());

        return curiosidadeParaEditar;
    }
}

