Tinder Evolution

Vamos construir uma aplicação como o Tinder, porém baseada em gostos em comum, incluindo músicas, filmes, séries, jogos, esportes, entre outros. Essa aplicação deverá ter as seguintes funcionalidades:

Funcionalidades

Usuário

Cadastrar usuário
Listar usuário
Pesquisar usuário
Deletar usuário
Editar usuário
Dados de um usuário:
Id
Nome
Email
Telefone
Data de Nascimento
Bio
Localização:
Latitude
Longitude

Músicas

Cadastrar música
Listar música
Pesquisar música
Deletar música
Editar música
Dados de uma música:
Id
Nome
Autor
Data de Lançamento
Estilo

Filmes

Cadastrar filme
Listar filme
Pesquisar filme
Deletar filme
Editar filme
Dados de um filme:
Id
Nome
Diretor
Data de Lançamento
Categoria
Sinopse

Séries

Cadastrar série
Listar série
Pesquisar série
Deletar série
Editar série
Dados de uma série:
Id
Nome
Diretor
Data de Lançamento
Número de temporadas
Número de episódios
Categoria
Sinopse

Jogos

Cadastrar jogo
Listar jogo
Pesquisar jogo
Deletar jogo
Editar jogo
Dados de um jogo:
Id
Nome
Publisher
Data de Lançamento
Categoria
Plataforma

Esportes

Cadastrar esporte
Listar esporte
Pesquisar esporte
Deletar esporte
Editar esporte
Dados de um esporte:
Id
Nome

Curiosidades

Cadastrar curiosidade
Listar curiosidade
Pesquisar curiosidade
Deletar curiosidade
Editar curiosidade
Dados de uma curiosidade:
Id
Descrição
Categoria

Regras

Usuário

O e-mail não pode repetir

O usuário deve ter mais de 18 anos de idade

Todos os campos são obrigatórios

Música

Não pode existir duas músicas com o mesmo nome

A data de lançamento não pode ser uma data futura

Os estilos aceitos são { funk | pagode | rock | indie | sertanejo | metal }

Todos os campos são obrigatórios

Filme
Não pode existir dois filmes com o mesmo nome
A data de lançamento não pode ser uma data futura
As categorias aceitas são { drama | comédia | suspense | terror | ação | musical }
Todos os campos são obrigatórios
Série
Não pode existir duas séries com o mesmo nome
A data de lançamento não pode ser uma data futura
As categorias aceitas são { drama | comédia | suspense | terror | ação | sitcom }
Deve possuir ao menos 1 temporada
Deve possuir ao menos 1 episódio por temporada
Todos os campos são obrigatórios
Jogo
Não pode existir dois jogos com o mesmo nome na mesma plataforma
A data de lançamento não pode ser uma data futura
As categorias aceitas são { drama | comédia | suspense | terror | ação | musical }
As plataformas aceitas são { xbox | ps4 | pc | snes }
Todos os campos, exceto publisher, são obrigatórios
Esporte
Não pode existir dois esportes com o mesmo nome
Todos os campos são obrigatórios
Curiosidade
Não pode existir duas curiosidades com a mesma descrição
As categorias aceitas são { comportamento | evento | aparência | alimentação }
Todos os campos são obrigatórios
Endpoints
Usuários
GET /usuarios (listar)
GET /usuarios/{id} (pesquisar)
POST /usuarios (cadastrar) *
PUT /usuarios/{id} (editar) *
DELETE /usuarios/{id} (deletar)
* payload

{
  "nome": "Robson Rosa",
  "email": "robsonrosa@cwi.com.br",
  "telefone": "51981938496",
  "dataNascimento": "2020-02-15",
  "bio": "bio",
  "latitude": 1,
  "longitude": 1,
}
Músicas
GET /musicas (listar)
GET /musicas/{id} (pesquisar)
POST /musicas (cadastrar) *
PUT /musicas/{id} (editar) *
DELETE /musicas/{id} (deletar)
* payload

{
  "nome": "Chlorine",
  "artista": "Twenty One Pilots",
  "lancamento": "2019-01-22",
  "estiloMusical": "INDIE"
}
Filmes
GET /filmes (listar)
GET /filmes/{id} (pesquisar)
POST /filmes (cadastrar) *
PUT /filmes/{id} (editar) *
DELETE /filmes/{id} (deletar)
* payload

{
  "nome": "Fight Club",
  "diretor": "David Fincher",
  "sinopse": "Um homem deprimido que sofre de insônia conhece um estranho vendedor chamado Tyler Durden e se vê morando em uma casa suja depois que seu perfeito apartamento é destruído. A dupla forma um clube com regras rígidas onde homens lutam. A parceria perfeita é comprometida quando uma mulher, Marla, atrai a atenção de Tyler.",
  "lancamento": "1999-09-10",
  "categoria": "DRAMA"
}
Séries
GET /series (listar)
GET /series/{id} (pesquisar)
POST /series (cadastrar) *
PUT /series/{id} (editar) *
DELETE /series/{id} (deletar)
* payload

{
  "nome": "Brooklyn Nine-Nine",
  "diretor": "Fremulon",
  "sinopse": "Ambientada na 99ª Delegacia de Polícia de Nova York, no Brooklyn, a série acompanha as maluquices do imaturo detetive Jake Peralta e a relação que ele tem com o novo capitão, Ray Holt.",
  "lancamento": "2013-09-17",
  "categoria": "COMEDIA"
}
Jogos
GET /jogos (listar)
GET /jogos/{id} (pesquisar)
POST /jogos (cadastrar) *
PUT /jogos/{id} (editar) *
DELETE /jogos/{id} (deletar)
* payload

{
  "nome": "Killer Instinct",
  "publisher": "Rareware",
  "lancamento": "1995-08-30",
  "categoria": "LUTA",
  "platafora": "SNES"
}
Esportes
GET /esportes (listar)
GET /esportes/{id} (pesquisar)
POST /esportes (cadastrar) *
PUT /esportes/{id} (editar) *
DELETE /esportes/{id} (deletar)
* payload

{
  "nome": "Volei"
}
Curiosidades
GET /curiosidades (listar)
GET /curiosidades/{id} (pesquisar)
POST /curiosidades (cadastrar) *
PUT /curiosidades/{id} (editar) *
DELETE /curiosidades/{id} (deletar)
* payload

{
  "nome": "Vegan",
  "categoria": "ALIMENTACAO"
}

Funcionalidades
Foto
Cadastrar foto de um usuário
Curtidas
Um usuário poderá curtir uma música
Um usuário poderá curtir um filme
Um usuário poderá curtir uma série
Um usuário poderá curtir um jogo
Um usuário poderá curtir um esporte
Um usuário poderá definir uma curiosidade
Listas
Listar músicas curtidas de determinado usuário
Listar filmes curtidos de determinado usuário
Listar séries curtidas de determinado usuário
Listar jogos curtidos de determinado usuário
Listar esportes curtidos de determinado usuário
Listar curiosidades determinado usuário
Match
Permitir que um usuário dê "like" em outro usuário
Permitir que um usuário dê "dislike" em outro usuário
Quando dois usuários derem "like" entre si, deverá ser criado um match
Listar os matches de um determinado usuário (usuários que deram match entre si)
Obter o usuário com mais características em comum que já não tenha um match ou dislike
Regras
Foto
Adicionar um campo novo no usuário que será a url da foto do mesmo
Deve ser possível cadastrar um usuário sem foto
Ao listar os usuários, a foto deve ser retornada
Avaliações
Se um mesmo usuário curtir o mesmo item mais de uma vez, nada acontece
O usuário poderá descurtir um item
Listas
Ao listar os usuários, devem ser retornados itens curtidos daquele usuário
Curiosidade
Pode existir duas curiosidades com a mesma descrição
Endpoints
Listas
GET /usuarios
GET /usuarios/{id}
{
  "nome": "Robson Rosa",
  "email": "robsonrosa@cwi.com.br",
  "telefone": "51981938496",
  "dataNascimento": "2020-02-15",
  "bio": "bio",
  "latitude": 1,
  "longitude": 1,
  "musicasCurtidas": [],
  "filmesCurtidos": [],
  "seriesCurtidas": [],
  "jogosCurtidos": [],
  "esportesCurtidos": [],
  "curiosidades": []
}
Likes
POST /likes/musica/{id-musica}/avaliador/{id-avaliador} (like música)

POST /likes/filme/{id-filme}/avaliador/{id-avaliador} (like filme)

POST /likes/serie/{id-serie}/avaliador/{id-avaliador} (like série)

POST /likes/jogo/{id-jogo}/avaliador/{id-avaliador} (like jogo)

POST /likes/esporte/{id-esporte}/avaliador/{id-avaliador} (like esporte)

DELETE /likes/musica/{id-musica}/avaliador/{id-avaliador} (dislike música)

DELETE /likes/filme/{id-filme}/avaliador/{id-avaliador} (dislike filme)

DELETE /likes/serie/{id-serie}/avaliador/{id-avaliador} (dislike série)

DELETE /likes/jogo/{id-jogo}/avaliador/{id-avaliador} (dislike jogo)

DELETE /likes/esporte/{id-esporte}/avaliador/{id-avaliador} (dislike esporte)

Match
POST /matches/{id-avaliado}/avaliador/{id-avaliador}/like (like)
POST /matches/{id-avaliado}/avaliador/{id-avaliador}/dislike (dislike)
DELETE /matches/{id-avaliado}/avaliador/{id-avaliador}/like (desfazer like)
DELETE /matches/{id-avaliado}/avaliador/{id-avaliador}/dislike (desfazer dislike)
GET /matches/{id} (listar matches)
GET /matches/{id}/best (mais características em comum)
