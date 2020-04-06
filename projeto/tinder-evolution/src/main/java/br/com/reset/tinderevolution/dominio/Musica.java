package br.com.reset.tinderevolution.dominio;

import java.time.LocalDate;

// Cadastro de Música
public class Musica {

    private int id;
    private String nome;
    private String artista;
    private EstiloMusical estiloMusical;
    private LocalDate lancamento;

    // Construtor
    public Musica(int id, String nome, String artista, EstiloMusical estiloMusical, LocalDate lancamento) {
        this.id = id;
        this.nome = nome;
        this.artista = artista;
        this.estiloMusical = estiloMusical;
        this.lancamento = lancamento;
    }

    public Musica(String nome, String artista, EstiloMusical estiloMusical, LocalDate lancamento) {
        this.nome = nome;
        this.artista = artista;
        this.estiloMusical = estiloMusical;
        this.lancamento = lancamento;
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

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public EstiloMusical getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(EstiloMusical estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    //toString
    @Override
    public String toString() {
        return "Musica{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", artista='" + artista + '\'' +
                ", estiloMusical=" + estiloMusical +
                ", lancamento=" + lancamento +
                '}';
    }
}
