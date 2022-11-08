package view;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Computador;
import model.Monitoramento;
import model.PesquisaSatisfacao;
import model.Usuario;

public class Home {

    private Integer idUsuario;
    private String nomeUsuario;
    private Boolean WiredMode;

    public Home(Integer idUsuario) {
        Monitoramento monitoramento = new Monitoramento();
        Usuario usuario = new Usuario();

//        info user
        nomeUsuario = usuario.getUserLocalDataForId(idUsuario).getNomeUsuario();

        this.idUsuario = idUsuario;
        WiredMode = false;
//        iniciando munitoramento
        monitoramento.setTimeOut(idUsuario);
        menu(nomeUsuario);
    }

    PesquisaSatisfacao pesquisaSatisfacao = new PesquisaSatisfacao();

    private void menu(String nomeUsuario) {
        Scanner sc = new Scanner(System.in);
        System.err.println("=".repeat(30) + "Miracle-Solutions"
                + "=".repeat(30));
        System.err.printf("\nOla, %s\n", nomeUsuario);
        System.out.println("Esta maquina esta sendo monitorado!!");

        System.err.println("=".repeat(78));
    }
}
