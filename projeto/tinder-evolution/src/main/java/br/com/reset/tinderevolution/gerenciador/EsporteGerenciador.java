package br.com.reset.tinderevolution.gerenciador;

import br.com.reset.tinderevolution.acervo.ListaEsporte;
import br.com.reset.tinderevolution.dominio.Esporte;
import org.springframework.stereotype.Service;

import java.util.List;

// Regras de Negócio do Cadastro de Esportes
@Service
public class EsporteGerenciador {

    private ListaEsporte lista = new ListaEsporte();

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
        }
        // Validação se todos os campos foram preenchidos
        if (esporteAtualizado.getNome().isEmpty()) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }
        else {
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
