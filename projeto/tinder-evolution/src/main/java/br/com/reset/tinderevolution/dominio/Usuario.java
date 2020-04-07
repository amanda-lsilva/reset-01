package br.com.reset.tinderevolution.dominio;

import br.com.reset.tinderevolution.gerenciador.UsuarioGerenciador;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

// Cadastro de Usuário
public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    private String bio;
    private Double latitude;
    private Double longitude;
    private List<Musica> musicasCurtidas = new ArrayList<>();

    // Construtor

//    public Usuario(int id, String nome, String email, String telefone, LocalDate dataNascimento, String bio, Double latitude, Double longitude) {
//        this.id = id;
//        this.nome = nome;
//        this.email = email;
//        this.telefone = telefone;
//        this.dataNascimento = dataNascimento;
//        this.bio = bio;
//        this.latitude = latitude;
//        this.longitude = longitude;
//    }

    public Usuario(String nome, String email, String telefone, LocalDate dataNascimento, String bio, Double latitude, Double longitude) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.bio = bio;
        this.latitude = latitude;
        this.longitude = longitude;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    // Cálculo da Idade
    public double idadeAtual(LocalDate dataNascimento) {
        Period p = Period.between(dataNascimento, LocalDate.now());
        int idade = p.getYears();
        return idade;
    }

    // Adiciona músicas curtidas
    public void salvarMusica(Musica musica) {
        musicasCurtidas.add(musica);
    }

    public List<Musica> listarMusicasCurtidas() {
        return musicasCurtidas;
    }

    //toString
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", bio='" + bio + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", músicas curtidas=" + musicasCurtidas +
                "}";

    }

}
