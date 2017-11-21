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
public class Usuario {

    private int cid;
    private String nome;
    private String email;
    private String username;
    private String senha;
    private String administrador;

    public Usuario() {
    }

    public Usuario(int cid, String nome, String email, String username, String senha) {
        this.cid = cid;
        this.nome = nome;
        this.email = email;
        this.username = username;
        this.senha = senha;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

    public String mesTextual(int mes) {
        String txt = "";
        switch (mes) {
            case 1:
                txt = "Jan";
                break;
            case 2:
                txt = "Fev";
                break;
            case 3:
                txt = "Mar";
                break;
            case 4:
                txt = "Abr";
                break;
            case 5:
                txt = "Mai";
                break;
            case 6:
                txt = "Jun";
                break;
            case 7:
                txt = "Jul";
                break;
            case 8:
                txt = "Ago";
                break;
            case 9:
                txt = "Set";
                break;
            case 10:
                txt = "Out";
                break;
            case 11:
                txt = "Nov";
                break;
            case 12:
                txt = "Dez";
                break;
        }
        return txt;
    }
}
