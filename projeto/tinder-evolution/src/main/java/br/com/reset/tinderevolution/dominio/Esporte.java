package br.com.reset.tinderevolution.dominio;

// Cadastro de Esporte
public class Esporte {

    private int id;
    private String nome;

    // Construtor
    public Esporte(String nome) {
        this.nome = nome;
    }

    // Getter e Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // toString
    @Override
    public String toString() {
        return "Esporte{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
