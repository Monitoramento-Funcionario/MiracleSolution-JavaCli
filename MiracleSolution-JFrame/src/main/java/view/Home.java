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
    Timer timer = new Timer();

    TimerTask foco = new TimerTask() {
        @Override
        public void run() {
            System.err.println("Ao trabalho e mantenha o foco!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.err.println("Descanse um pouco, logo logo voltará ao trabalho.");
        }
    };

    private void menu(String nomeUsuario) {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        do {
            System.err.println("=".repeat(30) + "Miracle-Solutions"
                    + "=".repeat(30));
            System.err.printf("\nOla, %s\n", nomeUsuario);
            System.err.printf(
                    "\n(1) - Acessar Pesquisa\n"
                    + "\n(2) - %s Wired Mode"
                    + "\n(3) - Apontar Hora"
                    + "\n(0) - Fechar\n", WiredMode
            );
            System.err.printf("\nStatus apontamento de horas: Restam, "
                    + "%d Dias\n", 2);
            System.err.println("=".repeat(77));
            Integer resposta = sc.nextInt();

            switch (resposta) {
                case 0:
                    exit = false;
                    break;
                case 1:
                    System.out.println("Pesquisa");
                    exit = false;
                    pesquisaSatisfacao();
                    break;
                case 2:
                    System.out.println("Wired Mode");
                    ativarWiredMode();
                    break;
                case 3:
                    System.out.println("Hora");
                    break;
            }
        } while (exit);
    }

    private void ativarWiredMode() {

        if (this.WiredMode == true) {
            this.WiredMode = false;
            foco.run();
            timer.scheduleAtFixedRate(foco, 10000, 10000);
        } else {
            timer.cancel();
            this.WiredMode = true;
        }
    }

    private void pesquisaSatisfacao() {
        pesquisaSatisfacao.getIdPesquisaSatisfacao(idUsuario);
        if (pesquisaSatisfacao.getIdPesquisa() != null) {
            System.out.println("Você já realizou a pesquisa este mês. "
                    + "Tente novamente no próximo mês!");
        } else {
            Pesquisa pesquisa = new Pesquisa(idUsuario);
            System.out.println("ainda não fez");
            menu(nomeUsuario);
        }
    }
}
