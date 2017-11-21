/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Questao;
import Model.AbstractFactory;
import View.TelaPrincipal;
import View.TelaResultado;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author Rodrigo Golfeto
 */
public class TelaQuestaoController extends AbstractFactory {
        
    private static AbstractFactory dao = new AbstractFactory();
    private static Questao questao[];
    
    public static synchronized void montarQuestoes(String categoria){
        int numCategoria;
        
        switch(categoria){
            case "CNT":
                numCategoria = 1;
                break;
            case "CHT":
                numCategoria = 2;
                break;
            case "LCT":
                numCategoria = 3;
                break;
            case "MT":
                numCategoria = 4;
                break;
            default:
                numCategoria = 0;
                break;
        }
        
        questao = new Questao[10];
        
        dao.conectar();
        
        String sql;
        
        if(numCategoria>0){
            sql = "SELECT * FROM questao WHERE que_cat_id='"+numCategoria+"' ORDER BY RAND() LIMIT 10";
        }else{
            sql = "SELECT * FROM questao ORDER BY RAND() LIMIT 10";
        }
        
        try {
            ResultSet resultado = dao.connection.prepareStatement(sql).executeQuery();
            int i=0;
            while(resultado.next()){
                
                questao[i] = new Questao();
                
                //Descricao da questao
                questao[i].setDescricao(resultado.getString("que_descricao"));
                
                //Alternativas
                String sql2 = "SELECT * FROM alternativa WHERE alt_que_id='"+resultado.getInt("que_id")+"' ORDER BY RAND() LIMIT 5";
                
                try {
                    ResultSet resultado2 = dao.connection.prepareStatement(sql2).executeQuery();
                    while(resultado2.next()){
                        boolean sn = resultado2.getString("alt_correta").equals("S");
                        questao[i].adicionarAlternativa(resultado2.getString("alt_descricao"),sn);
                    }
                } catch (SQLException ex) {
                    System.out.println("Erro no SQL de Alternativas!");
                }
                
                i++;
            }
        } catch (SQLException ex) {
            System.out.println("Erro no SQL!");
        }try {
            dao.connection.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao fechar conexão!");
        }
    }

    public static Questao[] getQuestao() {
        return questao;
    }

    public static void setQuestao(Questao[] questao) {
        TelaQuestaoController.questao = questao;
    }
    
    public void desistir(JFrame telaQuestao){
        telaQuestao.dispose();
        TelaPrincipal.main(null);
    }
    
    public static int validarSimulado() {
        for(int i=0;i<10;i++){
            if(questao[i].getAlternativaEscolhida()==null){
                return i;
            }
        }
        return -1;
    }
    
    public static void finalizarSimulado(JFrame telaQuestao){
        telaQuestao.dispose();
        TelaResultado.main(null);
    }
}
