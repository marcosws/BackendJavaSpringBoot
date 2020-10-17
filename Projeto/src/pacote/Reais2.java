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
public class Reais2 {
    
    public static void main(String[] args){
        
        String sts = JOptionPane.showInputDialog("Digite um número");
        
        double db = Double.parseDouble(sts);
        float fl = Float.parseFloat(sts);
        long lg = Integer.parseInt(sts);
        int it = Integer.parseInt(sts);
        short sh = (short)Integer.parseInt(sts);
        byte bt = (byte)Integer.parseInt(sts);
        char ch = (char)Integer.parseInt(sts);
        String st = "Valores armazenados:" +
                "\n db = " + db + "\n fl = " + fl +
                "\n lg = " + lg + "\n it = " + it +
                "\n db = " + sh + "\n bt = " + bt + 
                "\n sh = " + ch;
        
        JOptionPane.showMessageDialog(null,st);
       
    }
}
