/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import javax.swing.JOptionPane;

/**
 * @author FIC
 */
public class ConvTextoNumeros {
    
    public static void main(String[] args){
        
        int it1 = 15635;
        long lg = it1;
        float fl = it1;
        short sh = (short)it1;
        double db = 24.75;
        
        int it2 = (int)db;
        int it3 = (int)Math.round(db);
        String st = "Valores armazenados:" +
                "\nit1 = " + it1 + "\nlg = " + lg +
                "\nfl = " + fl + "\nsh = " + sh +
                "\ndb = " + db + "\nit2 = " + it2 + 
                "\nit3 = " + it3;
        JOptionPane.showMessageDialog(null, st);
        
    }
    
}
