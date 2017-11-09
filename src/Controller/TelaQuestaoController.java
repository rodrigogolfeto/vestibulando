/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AbstractFactory;
import Model.Usuario;
import View.TelaPrincipal;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author Rodrigo Golfeto
 */
public class TelaQuestaoController extends AbstractFactory {
    
    private static AbstractFactory dao = new AbstractFactory();
        
    public static synchronized boolean montarQuestoes(String categoria){
        System.out.println("");
        /*
        dao.conectar();
        
        String sql = "SELECT * FROM usuario WHERE usu_login='"+login+"' AND usu_senha='"+senha+"' LIMIT 1";
        
        try {
            ResultSet resultado = dao.connection.prepareStatement(sql).executeQuery();
            
            while(resultado.next()){ }
            
            resultado.last();
            if(resultado.getRow()==0){
                return false;
            }else{                
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Erro no SQL!");
        }
        try {
            dao.connection.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao fechar conexão!");
        }
        */
        return false;
    }
    
    public void desistir(JFrame telaQuestao){
        telaQuestao.dispose();
        TelaPrincipal.main(null);
    }
    
}
