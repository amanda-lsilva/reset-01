package exercicio4;

import java.time.LocalDateTime;

public class Evento {

    String descricao;
    String local;
    LocalDateTime dataHora;

    public Evento(String descricao, String local, LocalDateTime dataHora) {
        this.descricao = descricao;
        this.local = local;
        this.dataHora = dataHora;
    }

}
