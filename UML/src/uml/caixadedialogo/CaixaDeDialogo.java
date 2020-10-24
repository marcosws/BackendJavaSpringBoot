/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml.caixadedialogo;

import javax.swing.JOptionPane;

/**
 *      Caixa de Dialogo
        -----------------
        texto
        titulo
        -----------------
        abrir();
        * 
 * @author FIC
 */
public class CaixaDeDialogo {
    
    String texto;
    String titulo;
    
    public void abrir(){
        JOptionPane.showConfirmDialog(null,this.getTexto(), this.getTitulo(), JOptionPane.OK_OPTION);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    
    
}
