package br.com.reset.tinderevolution.dominio;

import java.time.LocalDate;

// Cadastro de Jogo
public class Jogo {

    private int id;
    private String nome;
    private String publisher;
    private CategoriaJogo categoriaJogo;
    private LocalDate lancamento;
    private PlataformaJogo plataforma;

    // Construtor
    public Jogo(String nome, String publisher, CategoriaJogo categoriaJogo, LocalDate lancamento, PlataformaJogo plataforma) {
        this.nome = nome;
        this.publisher = publisher;
        this.categoriaJogo = categoriaJogo;
        this.lancamento = lancamento;
        this.plataforma = plataforma;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public CategoriaJogo getCategoriaJogo() {
        return categoriaJogo;
    }

    public void setCategoriaJogo(CategoriaJogo categoriaJogo) {
        this.categoriaJogo = categoriaJogo;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    public PlataformaJogo getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(PlataformaJogo plataforma) {
        this.plataforma = plataforma;
    }

    // toString
    @Override
    public String toString() {
        return "Jogo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", publisher='" + publisher + '\'' +
                ", categoriaJogo=" + categoriaJogo +
                ", lancamento=" + lancamento +
                ", plataforma=" + plataforma +
                '}';
    }
}
