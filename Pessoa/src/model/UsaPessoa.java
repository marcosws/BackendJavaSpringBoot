/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import triangulo.Triangulo;

/**
 *
 * @author fic
 */
public class UsaPessoa {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        
       System.out.println("UsaPessoa ...");
       Triangulo triangulo = new Triangulo();
       triangulo.setAltura(234);
       triangulo.setBase(12);
        
       System.out.println("Altura: " + triangulo.getAltura());
       System.out.println("Altura: " + triangulo.getBase());
       
    }
    
}
