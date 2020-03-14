package aula02.exercicio01;

public class Main {

    public static void main(String[] args) {

        Aquatico navio = new Aquatico("Navio", "Água", 96, 45.6, 1000, "oleo");
        System.out.println(navio);

        Terrestre carro = new Terrestre("Carro", "Terra", 5, 120, 4, "gasolina" );
        System.out.println(carro);
    }
}

