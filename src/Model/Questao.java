/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author Rodrigo Golfeto
 */
public class Questao {
    
    private String descricao;
    private Alternativa alts[];
    private int totalAlternativas = 0;
    private Alternativa alternativaEscolhida;
    private Date inicio;
    private Date fim;
    
    
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
    
    public Alternativa getAlternativaEscolhida() {
        return alternativaEscolhida;
    }

    public void setAlternativaEscolhida(Alternativa alternativaEscolhida) {
        this.alternativaEscolhida = alternativaEscolhida;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }
}
