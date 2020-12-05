/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author FIC
 */
public class Teste {
    
    public static void main(String[] args) {
        
        
        try{
            System.out.println("OK");
            int m = 20 / 0;
            System.out.println(m);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
