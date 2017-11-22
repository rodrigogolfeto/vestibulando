/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.UsuarioController.setDataAtual;
import Model.AbstractFactory;
import Model.Alternativa;
import Model.Categoria;
import Model.Questao;
import Model.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;

/**
 *
 * @author Rodrigo Golfeto
 */
public class TelaListarQuestaoController extends AbstractFactory {

    private static AbstractFactory dao = new AbstractFactory();
    private static ArrayList<Questao> listaQuestao;

    public ArrayList<Questao> listarQuestao() {
        dao.conectar();

        String sql = "SELECT que_id,que_descricao,cat_id,cat_nome FROM questao,categoria WHERE que_cat_id=cat_id";
        String sql_alternativa = "";
        int controla_alternativa = 0;
        boolean resposta_alternativa = false;

        try {
            ResultSet resultado = dao.connection.prepareStatement(sql).executeQuery();

            listaQuestao = new ArrayList();

            Questao questao;
            Categoria categoria;
            Alternativa alts[] = new Alternativa[5];

            while (resultado.next()) {

                //criar objetos de categoria
                categoria = new Categoria(resultado.getInt("cat_id"), resultado.getString("cat_nome"));

                //criar vetor de objetos de alternativas
                sql_alternativa = "SELECT alt_id,alt_descricao,alt_correta FROM alternativa WHERE alt_que_id='" + resultado.getInt("que_id") + "'";
                ResultSet resultado_alternativa = dao.connection.prepareStatement(sql_alternativa).executeQuery();
                controla_alternativa = 0;
                while (resultado_alternativa.next()) {
                    resposta_alternativa = resultado_alternativa.getString("alt_correta").equals("S");
                    alts[controla_alternativa] = new Alternativa(resultado_alternativa.getInt("alt_id"), resultado_alternativa.getString("alt_descricao"), resposta_alternativa);
                    controla_alternativa++;
                }

                //criar objeto de questoes
                questao = new Questao(resultado.getInt("que_id"), resultado.getString("que_descricao"), alts, categoria);

                //resultado.getInt("que_id");
                listaQuestao.add(questao);
            }

        } catch (SQLException ex) {
            System.out.println("Erro no SQL!");
        }
        try {
            dao.connection.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao fechar conexão!");
        }

        return listaQuestao;
    }
}
