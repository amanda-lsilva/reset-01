package exercicio1;

public class App {

    public static void main(String[] args) {

        Aluno amanda = new Aluno("Amanda", 8.5);
        Turma turma = new Turma("Turma 101", 101);

        turma.obterNome();
        turma.obterQuantidadeDeAlunos();

        amanda.obterNota();

        System.out.println(amanda.nome);

    }
}
