public class App {

    public static void main(String[] args) {

        Calculadora calculadoraDeIdades = new Calculadora();

        int somaDasIdades = calculadoraDeIdades.somar(33,54);
        System.out.println( "Soma das Idades = " + somaDasIdades);

        int subtracaoDasIdades = calculadoraDeIdades.subtrair(54,33);
        System.out.println( "Subtração das Idades = " + subtracaoDasIdades);

        int multiplicacaoDasIdades = calculadoraDeIdades.multiplicar(10, 15);
        System.out.println( "Multiplicação das Idades = " + multiplicacaoDasIdades);

        int divisaoDasIdades = calculadoraDeIdades.dividir(100, 10);
        System.out.println( "Divisão das Idades = " + divisaoDasIdades);
    }
}
