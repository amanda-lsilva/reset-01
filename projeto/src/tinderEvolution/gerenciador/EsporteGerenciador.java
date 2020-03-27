package tinderEvolution.gerenciador;

import tinderEvolution.acervo.ListaEsportes;
import tinderEvolution.dominio.Esporte;

import java.time.LocalDate;
import java.util.List;

// Regras de Negócio do Cadastro de Esportes
public class EsporteGerenciador {

    private ListaEsportes lista = new ListaEsportes();

    // Salvar Esporte
    public Esporte salvar(Esporte esporte) {

        List<Esporte> esportes = lista.listar();

        // Validação se o esporte já existe com o mesmo nome
        for (Esporte esporteExistente : esportes) {
            if (esporte.getNome().equals(esporteExistente.getNome())) {
                System.out.println("Esporte já existente.");
                return esporteExistente;
            }
        }

        // Validação se todos os campos foram preenchidos
        if (esporte.getNome().isEmpty()) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }

        return lista.salvar(esporte);
    }

    // Editar Esporte
    public Esporte editar(int id, Esporte esporteAtualizado) {
        Esporte esporteParaEditar = procurar(id);
        if (esporteParaEditar == null) {
            return null;
        } else {
            return lista.editar(esporteParaEditar, esporteAtualizado);
        }
    }

    // Listar Esporte
    public List<Esporte> listar() {
        return lista.listar();
    }

    // Procurar Esporte
    public Esporte procurar(int id) {
        if (id > 0) {
            return lista.procurar(id);
        }
        return null;
    }

    // Deletar Esporte
    public boolean deletar(int id) {
        if (id > 0) {
            return lista.deletar(id);
        }
        return false;
    }

}
