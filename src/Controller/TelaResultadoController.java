/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AbstractFactory;
import Model.Questao;
import Model.Simulado;
import View.TelaConfiguracao;
import View.TelaPrincipal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Rodrigo Golfeto
 */
public class TelaResultadoController extends AbstractFactory {

    private static AbstractFactory dao = new AbstractFactory();
    private static Simulado simulado;
    private static int acertos;
    private static int erros;
    private static String desempenho;
    private static int colorR;
    private static int colorG;
    private static int colorB;
    private static Date dataFinal;
    private static String tempoSimulado;
    private static int segundo;
    private static int minuto;

    public static synchronized void salvarSimulado() {

        dataFinal = new Date();

        int controlaAcertos = 0;
        int controlaErros = 0;

        for (int i = 0; i < 10; i++) {
            if (TelaQuestaoController.getQuestao()[i].getAlternativaEscolhida().isResultado()) {
                controlaAcertos++;
            } else {
                controlaErros++;
            }
        }
        setAcertos(controlaAcertos);
        setErros(controlaErros);

        if (controlaAcertos >= 0 && controlaAcertos <= 2) {
            setDesempenho("Péssimo");
            setColorR(219);
            setColorG(4);
            setColorB(60);
        } else if (controlaAcertos > 2 && controlaAcertos <= 4) {
            setDesempenho("Ruim");
            setColorR(219);
            setColorG(4);
            setColorB(60);
        } else if (controlaAcertos > 4 && controlaAcertos <= 6) {
            setDesempenho("Regular");
            setColorR(255);
            setColorG(115);
            setColorB(1);
        } else if (controlaAcertos > 6 && controlaAcertos <= 8) {
            setDesempenho("Bom");
            setColorR(4);
            setColorG(219);
            setColorB(75);
        } else if (controlaAcertos > 8 && controlaAcertos <= 10) {
            setDesempenho("Excelente");
            setColorR(4);
            setColorG(219);
            setColorB(75);
        }

        setSegundo(getIntervaloSegundo(TelaQuestaoController.getQuestao()[0].getDataInicial(), dataFinal));
        setMinuto(getIntervaloMinuto(TelaQuestaoController.getQuestao()[0].getDataInicial(), dataFinal));

        if (getMinuto() > 0) {
            setSegundo(getSegundo() - (60 * getMinuto()));
            setTempoSimulado(getMinuto() + "min : " + getSegundo() + "seg");
        } else {
            setTempoSimulado("0min : " + getSegundo() + "seg");
        }

        simulado = new Simulado(UsuarioController.getUsuarioLogado(), getMinuto() + "min : " + getSegundo() + "seg", getAcertos(), getErros());

        //criar simulado, persistencia no banco
        String sql = "INSERT INTO simulado SET "; 
        sql+= "sim_usu_id='"+UsuarioController.getUsuarioLogado().getCid()+"'";
        sql+= ",sim_tempo='"+getTempoSimulado()+"'";
        sql+= ",sim_acertos='"+getAcertos()+"'";
        sql+= ",sim_erros='"+getErros()+"'";
        
        
        try {
            dao.conectar();
            PreparedStatement rs = dao.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            rs.executeUpdate();
            ResultSet r = rs.getGeneratedKeys();
            int lastId = 0;
            if (r.next()) {
                lastId = r.getInt(1);
            }
            
            for(int i=0;i<10;i++){                
                sql = "INSERT INTO simulado_questao SET siq_sim_id='"+lastId+"',sig_que_id='"+TelaQuestaoController.getQuestao()[i].getId()+"',sig_alt_id='"+TelaQuestaoController.getQuestao()[i].getAlternativaEscolhida().getId()+"'";
                rs = dao.connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
                rs.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaResultadoController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void irParaTelaPrincipal(JFrame telaSimulado) {
        telaSimulado.dispose();
        TelaPrincipal.main(null);
    }

    public static void irParaTelaConfiguracao(JFrame telaSimulado) {
        telaSimulado.dispose();
        TelaConfiguracao.main(null);
    }

    public static long getIntervalo(java.util.Date inicio, java.util.Date fim) {
        if (fim.compareTo(inicio) < 0) {
            throw new RuntimeException("Data fim menor que data inicio");
        }
        return (fim.getTime() - inicio.getTime());
    }

    public static int getIntervaloSegundo(java.util.Date inicio, java.util.Date fim) {
        long intervalo = getIntervalo(inicio, fim);
        return (int) (intervalo / (1000));
    }

    public static int getIntervaloMinuto(java.util.Date inicio, java.util.Date fim) {
        long intervalo = getIntervalo(inicio, fim);
        return (int) (intervalo / (60 * 1000));
    }

    public static int getIntervaloHoras(java.util.Date inicio, java.util.Date fim) {
        long intervalo = getIntervalo(inicio, fim);
        return (int) (intervalo / (3600 * 1000));
    }

    public static int getAcertos() {
        return acertos;
    }

    public static void setAcertos(int acertos) {
        TelaResultadoController.acertos = acertos;
    }

    public static int getErros() {
        return erros;
    }

    public static void setErros(int erros) {
        TelaResultadoController.erros = erros;
    }

    public static String getDesempenho() {
        return desempenho;
    }

    public static void setDesempenho(String desempenho) {
        TelaResultadoController.desempenho = desempenho;
    }

    public static int getColorR() {
        return colorR;
    }

    public static void setColorR(int colorR) {
        TelaResultadoController.colorR = colorR;
    }

    public static int getColorG() {
        return colorG;
    }

    public static void setColorG(int colorG) {
        TelaResultadoController.colorG = colorG;
    }

    public static int getColorB() {
        return colorB;
    }

    public static void setColorB(int colorB) {
        TelaResultadoController.colorB = colorB;
    }

    public static String getTempoSimulado() {
        return tempoSimulado;
    }

    public static void setTempoSimulado(String tempoSimulado) {
        TelaResultadoController.tempoSimulado = tempoSimulado;
    }

    public static int getSegundo() {
        return segundo;
    }

    public static void setSegundo(int segundo) {
        TelaResultadoController.segundo = segundo;
    }

    public static int getMinuto() {
        return minuto;
    }

    public static void setMinuto(int minuto) {
        TelaResultadoController.minuto = minuto;
    }

}
