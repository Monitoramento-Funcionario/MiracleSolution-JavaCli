package view;

import java.util.Scanner;
import model.Computador;
import model.Monitoramento;
import model.Usuario;

public class Home {

    private Integer idUsuario;

    public Home(Integer idUsuario) {
        Monitoramento monitoramento = new Monitoramento();
        Usuario usuario = new Usuario();

//        info user
        String nome = usuario.getUserLocalDataForId(idUsuario).getNomeUsuario();

        this.idUsuario = idUsuario;

//        iniciando munitoramento
        monitoramento.setTimeOut(idUsuario);
        Menu(nome);
    }

    public void Menu(String nomeUsuario) {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;

        do {
            System.err.println("=".repeat(30) + "Miracle-Solutions" + "=".repeat(30));
            System.err.printf("\nOla, %s\n", nomeUsuario);
            System.err.println(
                    "\n(1) - Acessar Pesquisa\n"
                    + "\n(2) - Ativar Wired Mode"
                    + "\n(3) - Apontar Hora"
                    + "\n(0) - Fechar\n"
            );
            System.err.printf("\nStatus apontamento de horas: Restam, %d Dias\n", 2);
            System.err.println("=".repeat(76));
            Integer resposta = sc.nextInt();

            switch (resposta) {
                case 0:
                    exit = false;
                    break;
                case 1:
                    System.out.println("Pesquisa");
                    break;
                case 2:
                    System.out.println("Wired Mode");
                    break;
                case 3:
                    System.out.println("Hora");
                    break;
            }
        } while (exit);
    }
}
