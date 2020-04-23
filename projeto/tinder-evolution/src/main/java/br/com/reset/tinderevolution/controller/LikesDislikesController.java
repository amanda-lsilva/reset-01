package br.com.reset.tinderevolution.controller;

import br.com.reset.tinderevolution.dominio.*;
import br.com.reset.tinderevolution.gerenciador.LikeDislikeGerenciador;
import br.com.reset.tinderevolution.gerenciador.MatchesGerenciador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("likes")
public class LikesDislikesController {

    @Autowired
    private LikeDislikeGerenciador gerenciadorLikeDislike;
    private MatchesGerenciador gerenciadorMatches;

    //Musica
    @GetMapping ("/musica/{id-usuario}")
    public List<Musica> listarMusicasCurtidas(@PathVariable("id-usuario") int id) {
        return gerenciadorLikeDislike.listarMusica(id);
    }

    @PostMapping("/musica/{id-musica}/avaliador/{id-avaliador}")
    public Usuario curtirMusica(@PathVariable("id-musica") int id, @PathVariable("id-avaliador") int idAvaliador) {
        return gerenciadorLikeDislike.curtirMusica(id, idAvaliador);
    }

    @DeleteMapping("/musica/{id-musica}/avaliador/{id-avaliador}")
    public Usuario descurtirMusica(@PathVariable("id-musica") int id, @PathVariable("id-avaliador") int idAvaliador){
        return gerenciadorLikeDislike.descurtirMusica(id, idAvaliador);
    }

    //Filme
    @GetMapping ("/filme/{id-usuario}")
    public List<Filme> listarFilmesCurtidos(@PathVariable("id-usuario") int id) {
        return gerenciadorLikeDislike.listarFilme(id);
    }

    @PostMapping("/filme/{id-filme}/avaliador/{id-avaliador}")
    public Usuario curtirFilme(@PathVariable("id-filme") int id, @PathVariable("id-avaliador") int idAvaliador) {
        return gerenciadorLikeDislike.curtirFilme(id, idAvaliador);
    }

    @DeleteMapping("/filme/{id-filme}/avaliador/{id-avaliador}")
    public Usuario descurtirFilme(@PathVariable("id-filme") int id, @PathVariable("id-avaliador") int idAvaliador){
        return gerenciadorLikeDislike.descurtirFilme(id, idAvaliador);
    }

    //Serie
    @GetMapping ("/serie/{id-usuario}")
    public List<Serie> listarSeriesCurtidas(@PathVariable("id-usuario") int id) {
        return gerenciadorLikeDislike.listarSerie(id);
    }

    @PostMapping("/serie/{id-serie}/avaliador/{id-avaliador}")
    public Usuario curtirSerie(@PathVariable("id-serie") int id, @PathVariable("id-avaliador") int idAvaliador) {
        return gerenciadorLikeDislike.curtirSerie(id, idAvaliador);
    }

    @DeleteMapping("/serie/{id-serie}/avaliador/{id-avaliador}")
    public Usuario descurtirSerie(@PathVariable("id-serie") int id, @PathVariable("id-avaliador") int idAvaliador){
        return gerenciadorLikeDislike.descurtirSerie(id, idAvaliador);
    }

    //Jogo
    @GetMapping ("/jogo/{id-usuario}")
    public List<Jogo> listarJogosCurtidos(@PathVariable("id-usuario") int id) {
        return gerenciadorLikeDislike.listarJogo(id);
    }

    @PostMapping("/jogo/{id-jogo}/avaliador/{id-avaliador}")
    public Usuario curtirJogo(@PathVariable("id-jogo") int id, @PathVariable("id-avaliador") int idAvaliador) {
        return gerenciadorLikeDislike.curtirJogo(id, idAvaliador);
    }

    @DeleteMapping("/jogo/{id-jogo}/avaliador/{id-avaliador}")
    public Usuario descurtirJogo(@PathVariable("id-jogo") int id, @PathVariable("id-avaliador") int idAvaliador){
        return gerenciadorLikeDislike.descurtirJogo(id, idAvaliador);
    }

    //Esporte
    @GetMapping ("/esporte/{id-usuario}")
    public List<Esporte> listarEsportesCurtidos(@PathVariable("id-usuario") int id) {
        return gerenciadorLikeDislike.listarEsporte(id);
    }

    @PostMapping("/esporte/{id-esporte}/avaliador/{id-avaliador}")
    public Usuario curtirEsporte(@PathVariable("id-esporte") int id, @PathVariable("id-avaliador") int idAvaliador) {
        return gerenciadorLikeDislike.curtirEsporte(id, idAvaliador);
    }

    @DeleteMapping("/esporte/{id-esporte}/avaliador/{id-avaliador}")
    public Usuario descurtirEsporte(@PathVariable("id-esporte") int id, @PathVariable("id-avaliador") int idAvaliador){
        return gerenciadorLikeDislike.descurtirEsporte(id, idAvaliador);
    }

    //Curiosidade
    @GetMapping ("/curiosidade/{id-usuario}")
    public List<Curiosidade> listarCuriosidades(@PathVariable("id-usuario") int id) {
        return gerenciadorLikeDislike.listarCuriosidade(id);
    }

    @PostMapping("/curiosidade/{id-curiosidade}/avaliador/{id-avaliador}")
    public Usuario curtirCuriosidade(@PathVariable("id-curiosidade") int id, @PathVariable("id-avaliador") int idAvaliador) {
        return gerenciadorLikeDislike.definirCuriosidade(id, idAvaliador);
    }

    @DeleteMapping("/curiosidade/{id-curiosidade}/avaliador/{id-avaliador}")
    public Usuario descurtirCuriosidade(@PathVariable("id-curiosidade") int id, @PathVariable("id-avaliador") int idAvaliador){
        return gerenciadorLikeDislike.descurtirCuriosidade(id, idAvaliador);
    }

}
