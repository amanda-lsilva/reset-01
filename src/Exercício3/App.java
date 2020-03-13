package Exercício3;

public class App {
    public static void main(String[] args) {
    Aluno amanda = new Aluno("Amanda",6.5f);

        System.out.println("Nome do Aluno: " + amanda.nome);
        System.out.println("Nota do Aluno: " + amanda.nota);

    if (amanda.aprovado()){
        System.out.println("Aprovado");
    } else
        System.out.println("Reprovado");
    }
}
