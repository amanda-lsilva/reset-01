package Exercício3;

public class App {
    public static void main(String[] args) {
    Aluno amanda = new Aluno("Amanda",8.3f);

        System.out.println("Nome do Aluno: " + amanda.nome);
        System.out.println("Nota do Aluno: " + amanda.nota);

    boolean Aprovado = amanda.aprovado();

    if (Aprovado){
        System.out.println("Aprovado");
    } else
        System.out.println("Reprovado");
    }
}
