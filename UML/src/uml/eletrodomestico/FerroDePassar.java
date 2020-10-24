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
    private String temperatura;

    public void ajustaTemperatura(String temperatura){
        this.setTemperatura(temperatura);
        System.out.println("Temperatura ajustada para:  " + this.getTemperatura());
    }
    
    /* Getter e Setter */
    public String getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
    
}
