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
public class TelaConfiguracaoController {
    
    public static void salvarAlteracoes(String nome, String email, String login, String senha, String confirmarSenha){
        //verificações de texto | validações
        if(validaNome(nome)){
            if(validaEmail(email)){
                if(validaLogin(login)){
                    if(validaSenha(senha,confirmarSenha)){
                        //salva
                        System.out.println("Salva alterações");
                    }else{
                        throw new UsuarioException("Senha inválida!");
                    }
                }else{
                    throw new UsuarioException("Login inválido!");
                } 
            }else{
                throw new UsuarioException("E-mail inválido!");
            }
        }else{
            throw new UsuarioException("Nome inválido!");
        }
    }
    
    private static boolean validaNome(String nome){
        //verificar se nome é válido
        if(!nome.equals("")){
            return true;
        }else{
            return false;
        }
    }
    
    private static boolean validaEmail(String email){
        //verificar se email é válido
        String sql = "usu_email='"+email+"' AND usu_id!='"+UsuarioController.getUsuarioLogado().getCid()+"'";
        return UsuarioController.verificarDuplicidade(sql);
    }
    
    private static boolean validaLogin(String login){
        String sql = "usu_login='"+login+"' AND usu_id!='"+UsuarioController.getUsuarioLogado().getCid()+"'";
        return UsuarioController.verificarDuplicidade(sql);
    }
    
    private static boolean validaSenha(String senha, String confirmarSenha){
        //verifica se é igual
        if(senha.equals(confirmarSenha)){
            //verifica tamanho da senha que deve ser maior igual que 6 caracteres
            if(senha.length()>=6){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
