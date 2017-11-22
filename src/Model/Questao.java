/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

public class Questao {

    private int id;
    private String descricao;
    private Alternativa alts[];
    private Categoria categoria;
    private Alternativa alternativaEscolhida;
    private Date dataInicial;
    private int totalAlternativas = 0;

    public Questao() {
        this.alts = new Alternativa[5];
        dataInicial = new Date();
    }

    public Questao(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Questao(String descricao, Alternativa[] alts) {
        this.descricao = descricao;
        this.alts = new Alternativa[5];
        dataInicial = new Date();
    }

    public Questao(int id, String descricao, Alternativa[] alts) {
        this.id = id;
        this.descricao = descricao;
        this.alts = new Alternativa[5];
        dataInicial = new Date();
    }

    public Questao(int id, String descricao, Alternativa[] alts, Categoria categoria) {
        this.id = id;
        this.descricao = descricao;
        this.alts = alts;
        this.categoria = categoria;
    }

    public Questao(int id, String descricao, Alternativa[] alts, Categoria categoria, Alternativa alternativaEscolhida, Date dataInicial) {
        this.id = id;
        this.descricao = descricao;
        this.alts = alts;
        this.categoria = categoria;
        this.alternativaEscolhida = alternativaEscolhida;
        this.dataInicial = dataInicial;
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

    public Alternativa[] getAlts() {
        return alts;
    }

    public void setAlts(Alternativa[] alts) {
        this.alts = alts;
    }

    public void adicionarAlternativa(int id, String descricao, boolean resultado) {
        alts[totalAlternativas] = new Alternativa();
        alts[totalAlternativas].setId(id);
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

    public int getTotalAlternativas() {
        return totalAlternativas;
    }

    public void setTotalAlternativas(int totalAlternativas) {
        this.totalAlternativas = totalAlternativas;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
