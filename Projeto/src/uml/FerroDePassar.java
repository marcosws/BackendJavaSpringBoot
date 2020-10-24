/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml;

/**
 *
 * @author FIC
 */
public class FerroDePassar extends Eletrodomestico {

    private String termostato;

    public String getTermostato() {
        return termostato;
    }

    public void setTermostato(String termostato) {
        this.termostato = termostato;
    }
    
    @Override
    void ligar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void desligar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
