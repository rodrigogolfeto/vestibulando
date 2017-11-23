/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.TelaResultadoController.getAcertos;
import static Controller.TelaResultadoController.getErros;
import static Controller.TelaResultadoController.getTempoSimulado;
import Model.AbstractFactory;
import Model.Alternativa;
import Model.Categoria;
import Model.Questao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rodrigo Golfeto
 */
public class TelaFormularioQuestaoController extends AbstractFactory {

    private static AbstractFactory dao = new AbstractFactory();
    private static ArrayList<Categoria> listaCategoria;
    private static Questao questao;
    private static String operacao;
    private static int cidAlterar;

    public ArrayList<Categoria> buscarCategorias() {
        dao.conectar();
        listaCategoria = new ArrayList();

        String sql = "SELECT * FROM categoria";
        try {
            ResultSet resultado = dao.connection.prepareStatement(sql).executeQuery();
            while (resultado.next()) {
                listaCategoria.add(new Categoria(resultado.getInt("cat_id"), resultado.getString("cat_nome")));
            }
        } catch (SQLException ex) {
            System.out.println("Erro no SQL!");
        }
        try {
            dao.connection.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao fechar conexão!");
        }
        return listaCategoria;
    }

    @SuppressWarnings("empty-statement")
    public boolean salvarFormulario(int id, String categoria, String descricao, String altA, String altB, String altC, String altD, String altE, String alt) {

        //selecionar a categoria
        String sql_categoria = "SELECT * FROM categoria WHERE cat_nome='" + categoria + "'";

        try {
            dao.conectar();
            ResultSet resultado_categoria = dao.connection.prepareStatement(sql_categoria).executeQuery();
            while (resultado_categoria.next());
            resultado_categoria.last();

            String aMarcado = "N";
            String bMarcado = "N";
            String cMarcado = "N";
            String dMarcado = "N";
            String eMarcado = "N";

            switch (TelaFormularioQuestaoController.getOperacao()) {
                case "novo":

                    //CADASTRAR
                    //inserir a questao
                    String sql_questao = "INSERT INTO questao SET que_cat_id='" + resultado_categoria.getInt("cat_id") + "',que_descricao='" + descricao + "'";
                    PreparedStatement resultado_questao = dao.connection.prepareStatement(sql_questao, Statement.RETURN_GENERATED_KEYS);
                    resultado_questao.executeUpdate();
                    ResultSet r = resultado_questao.getGeneratedKeys();
                    int idQuestao = 0;
                    if (r.next()) {
                        idQuestao = r.getInt(1);
                    }

                    switch (alt) {
                        case "A":
                            aMarcado = "S";
                            break;
                        case "B":
                            bMarcado = "S";
                            break;
                        case "C":
                            cMarcado = "S";
                            break;
                        case "D":
                            dMarcado = "S";
                            break;
                        case "E":
                            eMarcado = "S";
                            break;
                    }

                    //inserir as alternativas
                    String sql_alternativa_a = "INSERT INTO alternativa SET alt_que_id='" + idQuestao + "',alt_descricao='" + altA + "',alt_correta='" + aMarcado + "'";
                    String sql_alternativa_b = "INSERT INTO alternativa SET alt_que_id='" + idQuestao + "',alt_descricao='" + altB + "',alt_correta='" + bMarcado + "'";
                    String sql_alternativa_c = "INSERT INTO alternativa SET alt_que_id='" + idQuestao + "',alt_descricao='" + altC + "',alt_correta='" + cMarcado + "'";
                    String sql_alternativa_d = "INSERT INTO alternativa SET alt_que_id='" + idQuestao + "',alt_descricao='" + altD + "',alt_correta='" + dMarcado + "'";
                    String sql_alternativa_e = "INSERT INTO alternativa SET alt_que_id='" + idQuestao + "',alt_descricao='" + altE + "',alt_correta='" + eMarcado + "'";

                    PreparedStatement resultado_alternativa_a = dao.connection.prepareStatement(sql_alternativa_a, Statement.RETURN_GENERATED_KEYS);
                    resultado_alternativa_a.executeUpdate();

                    PreparedStatement resultado_alternativa_b = dao.connection.prepareStatement(sql_alternativa_b, Statement.RETURN_GENERATED_KEYS);
                    resultado_alternativa_b.executeUpdate();

                    PreparedStatement resultado_alternativa_c = dao.connection.prepareStatement(sql_alternativa_c, Statement.RETURN_GENERATED_KEYS);
                    resultado_alternativa_c.executeUpdate();

                    PreparedStatement resultado_alternativa_d = dao.connection.prepareStatement(sql_alternativa_d, Statement.RETURN_GENERATED_KEYS);
                    resultado_alternativa_d.executeUpdate();

                    PreparedStatement resultado_alternativa_e = dao.connection.prepareStatement(sql_alternativa_e, Statement.RETURN_GENERATED_KEYS);
                    resultado_alternativa_e.executeUpdate();

                    break;
                case "editar":
                    //ALTERAR

                    //alterar a questao
                    String sql_alterar_questao = "UPDATE questao SET que_cat_id='" + resultado_categoria.getInt("cat_id") + "',que_descricao='" + descricao + "' WHERE que_id='" + getCidAlterar() + "'";
                    PreparedStatement resultado_alterar_questao = dao.connection.prepareStatement(sql_alterar_questao, Statement.RETURN_GENERATED_KEYS);
                    resultado_alterar_questao.executeUpdate();

                    switch (alt) {
                        case "A":
                            aMarcado = "S";
                            break;
                        case "B":
                            bMarcado = "S";
                            break;
                        case "C":
                            cMarcado = "S";
                            break;
                        case "D":
                            dMarcado = "S";
                            break;
                        case "E":
                            eMarcado = "S";
                            break;
                    }
                    
                    //DELETAR ALTERNATIVAS DA QUESTAO
                    String sql_excluir_alternativa = "DELETE FROM alternativa WHERE alt_que_id='"+getCidAlterar()+"'";
                    PreparedStatement resultado_excluir_alternativa = dao.connection.prepareStatement(sql_excluir_alternativa, Statement.RETURN_GENERATED_KEYS);
                    resultado_excluir_alternativa.executeUpdate();
                    
                    //inserir as alternativas
                    String sql_alterar_alternativa_a = "INSERT INTO alternativa SET alt_que_id='" + getCidAlterar() + "',alt_descricao='" + altA + "',alt_correta='" + aMarcado + "'";
                    String sql_alterar_alternativa_b = "INSERT INTO alternativa SET alt_que_id='" + getCidAlterar() + "',alt_descricao='" + altB + "',alt_correta='" + bMarcado + "'";
                    String sql_alterar_alternativa_c = "INSERT INTO alternativa SET alt_que_id='" + getCidAlterar() + "',alt_descricao='" + altC + "',alt_correta='" + cMarcado + "'";
                    String sql_alterar_alternativa_d = "INSERT INTO alternativa SET alt_que_id='" + getCidAlterar() + "',alt_descricao='" + altD + "',alt_correta='" + dMarcado + "'";
                    String sql_alterar_alternativa_e = "INSERT INTO alternativa SET alt_que_id='" + getCidAlterar() + "',alt_descricao='" + altE + "',alt_correta='" + eMarcado + "'";

                    PreparedStatement resultado_alterar_alternativa_a = dao.connection.prepareStatement(sql_alterar_alternativa_a, Statement.RETURN_GENERATED_KEYS);
                    resultado_alterar_alternativa_a.executeUpdate();

                    PreparedStatement resultado_alterar_alternativa_b = dao.connection.prepareStatement(sql_alterar_alternativa_b, Statement.RETURN_GENERATED_KEYS);
                    resultado_alterar_alternativa_b.executeUpdate();

                    PreparedStatement resultado_alterar_alternativa_c = dao.connection.prepareStatement(sql_alterar_alternativa_c, Statement.RETURN_GENERATED_KEYS);
                    resultado_alterar_alternativa_c.executeUpdate();

                    PreparedStatement resultado_alterar_alternativa_d = dao.connection.prepareStatement(sql_alterar_alternativa_d, Statement.RETURN_GENERATED_KEYS);
                    resultado_alterar_alternativa_d.executeUpdate();

                    PreparedStatement resultado_alterar_alternativa_e = dao.connection.prepareStatement(sql_alterar_alternativa_e, Statement.RETURN_GENERATED_KEYS);
                    resultado_alterar_alternativa_e.executeUpdate();

                    break;
            }

        } catch (SQLException ex) {
            Logger.getLogger(TelaResultadoController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    public String validacaoFormulario(String categoria, String descricao, String altA, String altB, String altC, String altD, String altE, String alt) {
        if (categoria.equals("Selecione uma opção")) {
            return "Selecione uma categoria.";
        } else if (descricao.equals("")) {
            return "Informe a descrição da questão.";
        } else if (altA.equals("")) {
            return "Informe uma  possível resposta para a alternativa A.";
        } else if (altB.equals("")) {
            return "Informe uma  possível resposta para a alternativa B.";
        } else if (altC.equals("")) {
            return "Informe uma  possível resposta para a alternativa C.";
        } else if (altD.equals("")) {
            return "Informe uma  possível resposta para a alternativa D.";
        } else if (altE.equals("")) {
            return "Informe uma  possível resposta para a alternativa E.";
        } else if (alt == null) {
            return "Informe a alternativa verdadeira";
        }
        return "";
    }

    @SuppressWarnings("empty-statement")
    public static Questao buscarQuestao(int cid) {
        Questao questaoBusca = new Questao();

        int i = 0;
        String sql = "SELECT * FROM questao,categoria WHERE que_cat_id=cat_id AND que_id='" + cid + "' LIMIT 1";
        try {
            dao.conectar();
            ResultSet resultado = dao.connection.prepareStatement(sql).executeQuery();
            while (resultado.next());
            resultado.last();

            questaoBusca.setId(resultado.getInt("que_id"));
            questaoBusca.setCategoria(new Categoria(resultado.getInt("cat_id"), resultado.getString("cat_nome")));
            questaoBusca.setDescricao(resultado.getString("que_descricao"));

            Alternativa alts[] = new Alternativa[5];

            String sql2 = "SELECT * FROM alternativa WHERE alt_que_id='" + resultado.getInt("que_id") + "' LIMIT 5";
            ResultSet resultado2 = dao.connection.prepareStatement(sql2).executeQuery();
            while (resultado2.next()) {
                boolean sn = resultado2.getString("alt_correta").equals("S");
                int id = resultado2.getInt("alt_id");
                alts[i] = new Alternativa(id, resultado2.getString("alt_descricao"), sn);
                i++;
            }

            questaoBusca.setAlts(alts);

        } catch (SQLException ex) {
            System.out.println("Erro no SQL de Busca!");
        }
        try {
            dao.connection.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao fechar conexão!");
        }

        return questaoBusca;
    }

    public static String getOperacao() {
        return operacao;
    }

    public static void setOperacao(String operacao) {
        TelaFormularioQuestaoController.operacao = operacao;
    }

    public static int getCidAlterar() {
        return cidAlterar;
    }

    public static void setCidAlterar(int cidAlterar) {
        TelaFormularioQuestaoController.cidAlterar = cidAlterar;
    }
}
