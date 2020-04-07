package br.com.reset.tinderevolution.dominio;

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
    private List<Filme> filmesCurtidos = new ArrayList<>();
    private List<Serie> seriesCurtidas = new ArrayList<>();
    private List<Jogo> jogosCurtidos = new ArrayList<>();
    private List<Esporte> esportesCurtidos = new ArrayList<>();
    private List<Curiosidade> curiosidades = new ArrayList<>();
    private List<Usuario> usuariosCurtidos = new ArrayList<>();

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

    public List<Musica> getMusicasCurtidas() {
        return musicasCurtidas;
    }

    public List<Filme> getFilmesCurtidos() {
        return filmesCurtidos;
    }

    public List<Serie> getSeriesCurtidas() {
        return seriesCurtidas;
    }

    public List<Jogo> getJogosCurtidos() {
        return jogosCurtidos;
    }


    public List<Esporte> getEsportesCurtidos() {
        return esportesCurtidos;
    }


    public List<Curiosidade> getCuriosidades() {
        return curiosidades;
    }

    public List<Usuario> getUsuariosCurtidos() {
        return usuariosCurtidos;
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

    //Deleta música curtida
    public void deletarMusica(Musica musica) {
        musicasCurtidas.remove(musica);
    }

    // Adiciona filmes curtidos
    public void salvarFilme(Filme filme) {
        filmesCurtidos.add(filme);
    }

    //Deleta filme curtido
    public void deletarFilme(Filme filme) {
        filmesCurtidos.remove(filme);
    }

    // Adiciona séries curtidas
    public void salvarSerie(Serie serie) {
        seriesCurtidas.add(serie);
    }

    //Deleta música curtida
    public void deletarSerie(Serie serie) {
        seriesCurtidas.remove(serie);
    }

    // Adiciona jogos curtidos
    public void salvarJogo(Jogo jogo) {
        jogosCurtidos.add(jogo);
    }

    //Deleta jogo curtido
    public void deletarJogo(Jogo jogo) {
        jogosCurtidos.remove(jogo);
    }

    // Adiciona esportes curtidos
    public void salvarEsporte(Esporte esporte) {
        esportesCurtidos.add(esporte);
    }

    //Deleta esporte curtido
    public void deletarEsporte(Esporte esporte) {
        esportesCurtidos.remove(esporte);
    }

    // Adiciona curiosidades definidas
    public void salvarCuriosidade(Curiosidade curiosidade) {
        curiosidades.add(curiosidade);
    }

    //Deleta curiosidade definida
    public void deletarCuriosidade(Curiosidade curiosidade) {
        curiosidades.remove(curiosidade);
    }

    // Adiciona usuários curtidos
    public void salvarUsuario(Usuario usuario) {
        usuariosCurtidos.add(usuario);
    }

    //Deleta usuário curtido
    public void deletarUsuario(Usuario usuario) {
        usuariosCurtidos.remove(usuario);
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
                ", filmes curtidos=" + filmesCurtidos +
                ", séries curtidas=" + seriesCurtidas +
                ", jogos curtidos=" + jogosCurtidos +
                ", esportes curtidos=" + esportesCurtidos +
                ", curiosidades definidas=" + curiosidades +
                "}";
    }
}
