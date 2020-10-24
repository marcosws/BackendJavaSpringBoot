/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml.caixadedialogo;

/**
 *
 * @author FIC
 */
public class UsaCaixaDeDialogo {
    
  
    public static void main(String[] args) {
        
       CaixaDeDialogo caixaDeDialogo = new CaixaDeDialogo(); 
       caixaDeDialogo.setTitulo("Aviso");
       caixaDeDialogo.setTexto("Esta é uma mensagem!");
       caixaDeDialogo.abrir();
       
    }
    
}
