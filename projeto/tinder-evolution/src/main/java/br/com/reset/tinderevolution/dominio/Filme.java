package br.com.reset.tinderevolution.dominio;

import java.time.LocalDate;

// Cadastro de Filme
public class Filme {

    private int id;
    private String nome;
    private String diretor;
    private CategoriaFilme categoriaFilme;
    private LocalDate lancamento;
    private String sinopse;

    // Construtor
    public Filme(String nome, String diretor, CategoriaFilme categoriaFilme, LocalDate lancamento, String sinopse) {
        this.id = id;
        this.nome = nome;
        this.diretor = diretor;
        this.categoriaFilme = categoriaFilme;
        this.lancamento = lancamento;
        this.sinopse = sinopse;
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

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String artista) {
        this.diretor = diretor;
    }

    public CategoriaFilme getCategoriaFilme() {
        return categoriaFilme;
    }

    public void setCategoriaFilme(CategoriaFilme categoriaFilme) {
        this.categoriaFilme = categoriaFilme;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    // toString
    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", diretor='" + diretor + '\'' +
                ", categoriaFilme=" + categoriaFilme +
                ", lancamento=" + lancamento +
                ", sinopse='" + sinopse + '\'' +
                '}';
    }
}
