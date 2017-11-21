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
public class Simulado {

    private int id;
    private Usuario usuario;
    private String tempo;
    private int acertos;
    private int erros;

    public Simulado() {
    }

    public Simulado(Usuario usuario, String tempo, int acertos, int erros) {
        this.usuario = usuario;
        this.tempo = tempo;
        this.acertos = acertos;
        this.erros = erros;
    }
    
    public Simulado(int id, Usuario usuario, String tempo, int acertos, int erros) {
        this.id = id;
        this.usuario = usuario;
        this.tempo = tempo;
        this.acertos = acertos;
        this.erros = erros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public int getAcertos() {
        return acertos;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    public int getErros() {
        return erros;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }

}
