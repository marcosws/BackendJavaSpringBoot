/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml.eletrodomestico;

/**
 *
 * @author FIC
 */
public class FerroDePassar extends Eletrodomestico { // 'FerroDePassar' herda a classe 'Eletrodomestico'
    
    /* Atributos */
    private String termostato;

    /* Getter e Setter */
    public String getTermostato() {
        return termostato;
    }
    public void setTermostato(String termostato) {
        this.termostato = termostato;
    }
    
}
