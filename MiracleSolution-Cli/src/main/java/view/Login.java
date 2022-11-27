/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.io.IOException;
import view.Home;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Computador;
import model.Usuario;

/**
 *
 * @author thiag
 */
public class Login {

    private Integer idUsuario;

    public Login() {
        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario();

        System.err.println("=".repeat(30) + "Miracle-Solutions" + "=".repeat(30));

        System.out.println("Digite seu email:");
        String inputEmail = sc.nextLine();

        System.out.println("Digite sua senha:");
        String inputSenha = sc.nextLine();

        System.err.println("=".repeat(77));

        List<Usuario> dadosUsuario
                = usuario.getAuthLogin(inputEmail, inputSenha);
        sc.close();
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
