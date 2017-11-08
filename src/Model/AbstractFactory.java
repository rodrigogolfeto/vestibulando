/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rodrigo Golfeto
 */
public class AbstractFactory {
    
    private String user = "root";
    private String senha = "";
    private String serverDb = "jdbc:mysql://localhost/vestibulando";
    public Connection connection;
    
    public boolean conectar(){
        try {
            connection = DriverManager.getConnection(serverDb,user,senha);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AbstractFactory.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }    
}
