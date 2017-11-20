/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Rodrigo Golfeto
 */
public class Questao {
    
    private String descricao;
    private Alternativa alts[];
    private int totalAlternativas = 0;
    
    
    public Questao(){
        this.alts = new Alternativa[5];
    }
    
    public Questao(String descricao, Alternativa[] alts) {
        this.descricao = descricao;
        this.alts = new Alternativa[5];
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Alternativa[] getAlts() {
        return alts;
    }

    public void setAlts(Alternativa[] alts) {
        this.alts = alts;
    }
    
    public void adicionarAlternativa(String descricao,boolean resultado){
        alts[totalAlternativas] = new Alternativa();
        alts[totalAlternativas].setDescricao(descricao);
        alts[totalAlternativas].setResultado(resultado);
        totalAlternativas++;
    }
    
    
    
}
