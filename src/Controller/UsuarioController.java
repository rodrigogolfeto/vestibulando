/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AbstractFactory;
import Model.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rodrigo Golfeto
 */
public class UsuarioController extends AbstractFactory {
    private static AbstractFactory dao = new AbstractFactory();
    private static Usuario usuarioLogado;
    
    
    public static synchronized boolean autenticarCredenciais(String login, String senha){
        
        dao.conectar();
        
        String sql = "SELECT * FROM usuario WHERE usu_login='"+login+"' AND usu_senha='"+senha+"' LIMIT 1";
        try {
            ResultSet resultado = dao.connection.prepareStatement(sql).executeQuery();
            
            while(resultado.next()){ }
            
            resultado.last();
            if(resultado.getRow()==0){
                return false;
                //System.out.println("ERRO");
            }else{
                usuarioLogado = new Usuario();
                usuarioLogado.setCid(resultado.getInt("usu_id"));
                usuarioLogado.setNome(resultado.getString("usu_nome"));
                usuarioLogado.setEmail(resultado.getString("usu_email"));
                usuarioLogado.setUsername(resultado.getString("usu_login"));
                
                return true;
                //telaLogin.dispose();
                //TelaPrincipal.main(null);
            }
        } catch (SQLException ex) {
            //Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro no SQL!");
        }
        try {
            dao.connection.close();
        } catch (SQLException ex) {
            //Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro ao fechar conexão!");
        }
        return false;
    }
    
    
    public static boolean verificarDuplicidade(String conteudo){
        dao.conectar();
        String sql = "SELECT * FROM usuario WHERE "+conteudo;
        ResultSet resultado;
        try {
            resultado = dao.connection.prepareStatement(sql).executeQuery();
            while(resultado.next()){ }

            resultado.last();
            if(resultado.getRow()==0){
                dao.connection.close();
                return true;
            }
            dao.connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static Usuario getUsuarioLogado(){
        return UsuarioController.usuarioLogado;
    }
    
}
