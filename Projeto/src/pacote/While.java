/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

/**
 *
 * @author FIC
 */
public class While {
    
    public static void main(String[] args){
        
        System.out.println("primeiro while: ");
        
        int it = 0;
        while(it < 5){
            System.out.println(++it);
        }
        
        System.out.println("\nSegundo while: ");
        
        it = 69;
        while(it >= 65){
            String st = "O número " + it + " equivale ao caractere ";
            st = st + (char)it;
            System.out.println(st);
            it--;
        }
    
    }
  
    
}
