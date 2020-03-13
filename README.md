Criar um simulador de combate de RPG, que permita simular um combate entre diversos personagens de diferentes classes, identificando quando um personagem morrer em combate.

Deve ser poss�vel criar as seguintes classes de personagens:

Guerreiros
B�rbaros
Magos
Feiticeiros
Druidas
Cl�rigos
Todos eles possuem as seguintes caracter�sticas:

Nome
Vida
Ataque
Defesa
Caracater�sticas espec�ficas

Os magos e feiticeiros possuem mana
Os druidas e cl�rigos possuem f�
Regras:

Todas as classes podem atacar qualquer outra classe de personagem
Para que um personagem realize um ataque, deve ser informado o personagem alvo
No caso de guerreiros e b�rbaros, al�m do alvo deve ser informada a arma utilizada
No caso de magos e feiticeiros, al�m do alvo deve ser informada a magia utilizada
No caso de druidas e cl�rigos, al�m do alvo deve ser informado o poder divino utilizado
Armas possuem nome e poder de ataque
Magias possuem nome, poder e custo de mana
Poderes divinos possuem nome, intensidade e custo de f�
Quando magias s�o utilizadas, a mana � reduzida de acordo com o custo da magia
Quando poderes divinos s�o utilizadas, a f� � reduzida de acordo com o custo do poder divino
O poder final do ataque � calculado da seguinte forma:
poder final de ataque = (poder da arma ou magia ou poder divino) * ataque do atacante
O dano final deve ser calculado da seguinte forma:
dano = poder final de ataque - defesa do alvo
O roteiro de combate fica por conta da criatividade do desenvolvedor
O combate deve possuir, ao menos, 1 personagem de cada classe e 2 ataques de cada personagem
Cada ataque dever� imprimir o resultado do ataque seguindo o formato:
Ramza atacou Ragnar com machado causando 45 de dano
Ragnar atacou Beatrice com bola de fogo causando 23 de dano
Ragnar atacou Ramza com bola de fogo causando 21 de dano
Ragnar atacou Ragnar com bola de fogo causando 18 de dano
Beatrice atacou Ragnar com arma espiritual causando 11 de dano
No final do combate dever� imprimir nome, vida, mana e f� de cada personagem
Regras B�nus:

Personagens mortos podem ser atacados normalmente
Ataques de personagens mortos devem ser ignorados
Quando um ataque resultar na morte do alvo, isso deve ser impresso no registro do ataque
Magos, feiticeitos, druidas e cl�rigos deve ter o ataque ignorado se n�o possuirem mana ou f� suficiente