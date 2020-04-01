package br.com.reset.tinderevolution.dominio;

import java.time.LocalDate;

// Cadastro de Série
public class Serie {

    private int id;
    private String nome;
    private String diretor;
    private CategoriaSerie categoriaSerie;
    private LocalDate lancamento;
    private String sinopse;
    private int temporada;
    private int episodio;

    // Construtor
    public Serie(String nome, String diretor, CategoriaSerie categoriaSerie, LocalDate lancamento, String sinopse, int temporada, int episodio) {
        this.nome = nome;
        this.diretor = diretor;
        this.categoriaSerie = categoriaSerie;
        this.lancamento = lancamento;
        this.sinopse = sinopse;
        this.temporada = temporada;
        this.episodio = episodio;
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

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public CategoriaSerie getCategoriaSerie() {
        return categoriaSerie;
    }

    public void setCategoriaSerie(CategoriaSerie categoriaSerie) {
        this.categoriaSerie = categoriaSerie;
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

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    // toString
    @Override
    public String toString() {
        return "Serie{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", diretor='" + diretor + '\'' +
                ", categoriaSerie=" + categoriaSerie +
                ", lancamento=" + lancamento +
                ", sinopse='" + sinopse + '\'' +
                ", temporada=" + temporada +
                ", episodio=" + episodio +
                '}';
    }
}

