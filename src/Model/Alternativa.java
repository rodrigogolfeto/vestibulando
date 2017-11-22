/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Rodrigo Golfeto
 */
public class Alternativa {

    private int id;
    private String descricao;
    private boolean resultado;

    public Alternativa() {
    }

    public Alternativa(String descricao, boolean resultado) {
        this.descricao = descricao;
        this.resultado = resultado;
    }

    public Alternativa(int id, String descricao, boolean resultado) {
        this.id = id;
        this.descricao = descricao;
        this.resultado = resultado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Alternativa{" + "descricao=" + descricao + ", resultado=" + resultado + '}';
    }
}
