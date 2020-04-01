package exercicio4;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class AgendaEventos {

    public static void main(String[] args) {

        Evento casamento = new Evento("Casamento","Igreja", LocalDateTime.of(2020, 10,1,7,30));

        Duration faltaDias = Duration.between(LocalDateTime.now(), casamento.dataHora);
        long dias = faltaDias.toDays();

        String dataFormatada = casamento.dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yy"));
        System.out.println(dataFormatada + " - " + casamento.descricao + " (" + casamento.local + ") - Faltam " + dias + " dias");

        }
}
