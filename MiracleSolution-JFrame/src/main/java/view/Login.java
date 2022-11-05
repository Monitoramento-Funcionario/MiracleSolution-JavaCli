/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import view.Home;
import java.util.List;
import java.util.Scanner;
import model.Computador;
import model.Usuario;


/**
 *
 * @author thiag
 */
public class Login {

    private Integer idUsuario;

    public Login() {
        System.out.println("Miracle Solutions");
    }

    public void login() {
        Scanner sc1 = new Scanner(System.in);
        Usuario usuario = new Usuario();
        System.err.println("=".repeat(30) + "Miracle-Solutions" + "=".repeat(30));
        System.out.println("Digite seu email:");
        String inputEmail = sc1.nextLine();
        System.out.println("Digite sua senha:");
        String inputSenha = sc1.nextLine();
        System.err.println("=".repeat(76));

        List<Usuario> dadosUsuario
                = usuario.getAuthLogin(inputEmail, inputSenha);

        if (dadosUsuario.isEmpty()) {
            System.out.println("Email ou Senha Inválidos"); 
        } else {
            System.out.println("Aguarde alguns segundos!");
            Computador computador = new Computador();

            idUsuario = dadosUsuario.get(0).getIdUsuario();

            computador.setRegisterComputador(idUsuario);

            Home home = new Home(idUsuario);
        }

    }

}
