package br.com.reset.tinderevolution.console;

import br.com.reset.tinderevolution.dominio.Usuario;
import br.com.reset.tinderevolution.gerenciador.LikeDislike;
import br.com.reset.tinderevolution.gerenciador.Matches;
import br.com.reset.tinderevolution.gerenciador.UsuarioGerenciador;

import java.time.LocalDate;

public class TesteConsole {

    public static void main(String[] args) {

        UsuarioGerenciador gerenciadorUsuario = new UsuarioGerenciador();
        Matches matches = new Matches();
        LikeDislike like = new LikeDislike();

        Usuario amanda = new Usuario("Amanda", "amanda@reset.com.br", "51 995118960", LocalDate.of(1991, 10, 15), "Bio da Amanda", 1.0, 1.0);
        Usuario maria = new Usuario("Maria", "maria@reset.com.br", "51 995118960", LocalDate.of(1991, 10, 15), "Bio da Maria", 1.0, 1.0);
        Usuario joao = new Usuario("Joao", "joao@reset.com.br", "51 995118960", LocalDate.of(1991, 10, 15), "Bio da Amanda", 1.0, 1.0);
        Usuario jose = new Usuario("Jose", "jose@reset.com.br", "51 995118960", LocalDate.of(1991, 10, 15), "Bio da Maria", 1.0, 1.0);

        gerenciadorUsuario.salvar(amanda);
        gerenciadorUsuario.salvar(maria);
        gerenciadorUsuario.salvar(joao);
        gerenciadorUsuario.salvar(jose);
        System.out.println(amanda);
        System.out.println(maria);
        System.out.println(joao);
        System.out.println(jose);

        matches.likeUsuario(1,3);
        matches.likeUsuario(3,1);
        matches.likeUsuario(2,4);
        like.curtirMusica(1,2);
        like.curtirMusica(1,4);
        matches.criarBest(2);

        System.out.println(matches.listarLikes(1));
        System.out.println(amanda.listarMatches());
        System.out.println(joao.listarMatches());
        System.out.println(matches.listarMatchesUsuario(1));
        System.out.println("lista like jose");
        System.out.println(jose.listarUsuariosCurtidos());
        System.out.println(jose.listarMatches());
        matches.dislikeUsuario(3,1);
        System.out.println("dislike");
        System.out.println(amanda.listarMatches());
        System.out.println(matches.listarLikes(1));
        System.out.println(joao.listarMatches());
        System.out.println(matches.listarLikes(3));

        System.out.println(matches.listarBest(2));
    }
}

