package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class ListaCompras {

    public static void main(String[] args) {

        Item massa = new Item("Massa", Segmento.ALIMENTACAO, 3.50, 2 );
        Item shampoo = new Item("Shampoo", Segmento.HIGIENE, 15.3, 1);
        Item sabao = new Item( "Sabão", Segmento.LIMPEZA, 2.1,5);

        List<Item> listaDeCompras = new ArrayList<>();
        listaDeCompras.add(massa);
        listaDeCompras.add(shampoo);
        listaDeCompras.add(sabao);

        for (Item item : listaDeCompras) {
            double valorTotal = item.getValor() * item.getQuantidade();
            System.out.println("[" + item.getSegmento() + "] " + item.getNome() + " (" + item.getQuantidade() + ") - " + item.getValor() + " | " + valorTotal);
        }

    }
}
