package tinderEvolution.dominio;

import java.time.LocalDate;
import java.time.Period;

// Cadastro de Usuário
public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    private String bio;
    private double latitude;
    private double longitude;

    // Construtor
    public Usuario(String nome, String email, String telefone, LocalDate dataNascimento, String bio, double latitude, double longitude) {
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

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    // Cálculo da Idade
    public double idadeAtual(LocalDate dataNascimento) {
        Period p = Period.between(dataNascimento, LocalDate.now());
        int idade = p.getYears();
        return idade;
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
                '}';

    }

}
