/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.TelaPrincipal;
import javax.swing.JFrame;

/**
 *
 * @author Rodrigo Golfeto
 */
public class TelaLoginController {
    
    public void acessar(String login, String senha, JFrame telaLogin) {
        if(UsuarioController.autenticarCredenciais(login, senha)){
            telaLogin.dispose();
            TelaPrincipal.main(null);
        }else{
            System.out.println("ERRO");
        }     
    }
}
