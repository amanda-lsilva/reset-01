package Exercício3;

public class Aluno {

    String nome;
    float nota;

    Aluno(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
    }

    boolean aprovado (){
        return nota >= 7.0;
    }
}
