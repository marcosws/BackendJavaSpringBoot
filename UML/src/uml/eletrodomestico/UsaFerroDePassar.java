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
public class UsaFerroDePassar {
    
       public static void main(String[] args) {
        
        FerroDePassar ferroDePassar = new FerroDePassar();
        
        ferroDePassar.setTensao("220v");
        ferroDePassar.setCor("Branco");
        ferroDePassar.setPotencia("3000w");
        ferroDePassar.setMarca("BlackDecker");
        ferroDePassar.setModelo("BK234");
        ferroDePassar.setTemperatura("5");
       
        System.out.println("Tensao........: " + ferroDePassar.getTensao());
        System.out.println("Cor...........: " + ferroDePassar.getCor());
        System.out.println("Potencia......: " + ferroDePassar.getPotencia());
        System.out.println("Marca.........: " + ferroDePassar.getMarca());
        System.out.println("Modelo........: " + ferroDePassar.getModelo());
        System.out.println("Temperatura...: " + ferroDePassar.getTemperatura());
        
        System.out.println("Usando o Metodo 'Ligar()':");
        ferroDePassar.ligar();
        
        System.out.println("Usando o Metodo Desligar():");
        ferroDePassar.desligar();
        
        System.out.println("Usando o Metodo ajustarTemeratura(\"10\"): ");
        ferroDePassar.ajustaTemperatura("10");
    }
    
}
