package controller;

import com.github.britooo.looca.api.core.Looca;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.ZoneId;

public class Log {

    public void write(Exception error, Integer idusuario, String ipMaquina) {
        final String workdir = "src\\main\\logs\\";

        String formattedDate = DateTimeFormatter.ofPattern("yyyy-MM-dd").withZone(ZoneId.of("GMT-3"))
                .format(Instant.now());
        String formattedDate2 = DateTimeFormatter.ofPattern("HH:mm:ss").withZone(ZoneId.of("GMT-3"))
                .format(Instant.now());
        String filename = workdir + "log-" + formattedDate + ".txt";

        Looca processo = new Looca();

        Double emUso = (double) processo.getMemoria().getEmUso();
        Double total = (double) processo.getMemoria().getTotal();

        Long porcentagem = Math.round((emUso / total) * 100);

        try ( FileOutputStream writer = new FileOutputStream(filename, true)) {
            StringBuilder body = new StringBuilder()
                    .append("ID do Usuário: " + idusuario)
                    .append("\n")
                    .append("IP da Máquina: " + ipMaquina)
                    .append("\n")
                    .append("Erros: ")
                    .append("\n")
                    .append(".".repeat(40))
                    .append("\n")
                    .append(error.getMessage())
                    .append("\n")
                    .append(error.getStackTrace())
                    .append("\n")
                    .append(".".repeat(40))
                    .append("\n")
                    .append("Horário: " + formattedDate2)
                    .append("\n")
                    .append("Últimos registros:")
                    .append("\n")
                    .append(".".repeat(40))
                    .append("\n")
                    .append("Último registro do Processador: " + Math.round(processo.getProcessador().getUso()) + "%")
                    .append("\n")
                    .append("Último registro da Memória RAM: " + porcentagem + "%")
                    .append("\n")
                    .append(".".repeat(40))
                    .append("\n")
                    .append("\n");

            writer.write(body.toString().getBytes());

        } catch (IOException ex) {
            System.out.println("Erro inesperado \n" + ex);
        }
    }
}