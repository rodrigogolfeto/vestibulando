/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.TelaQuestao;
import javax.swing.JFrame;

/**
 *
 * @author Rodrigo Golfeto
 */
public class TelaPrincipalController {
    public void acessarQuestao(String categoria, JFrame telaPrincipal) {
        System.out.println("Abrir tela de questão pra categoria "+categoria);
        telaPrincipal.dispose();
        TelaQuestao.main(null);        
    }
}
