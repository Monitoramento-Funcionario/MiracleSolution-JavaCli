package view;

import com.github.britooo.looca.api.group.sistema.Sistema;
import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Computador;
import model.Monitoramento;
import model.Slack;
import model.Usuario;

public class Home {

    private Integer idUsuario;
    private String nomeUsuario;

    public Home(Integer idUsuario) {
        Monitoramento monitoramento = new Monitoramento();
        Usuario usuario = new Usuario();
        Slack slk = new Slack();
        Sistema sistema = new Sistema();

//        info user
        nomeUsuario = usuario.getUserLocalDataForId(idUsuario).getNomeUsuario();

        this.idUsuario = idUsuario;
//      iniciando munitoramento
        monitoramento.setTimeOut(idUsuario);
        slk.sendAlerta(nomeUsuario, new Computador().getIpComputadorLocalData());
        menu(nomeUsuario);
    }

    private void menu(String nomeUsuario) {
        System.err.println("=".repeat(30) + "Miracle-Solutions"
                + "=".repeat(30));
        System.err.printf("\nOla, %s\n", nomeUsuario);
        System.out.println("\nEsta maquina esta sendo monitorado!!");

        System.err.println("=".repeat(77));
    }
}
