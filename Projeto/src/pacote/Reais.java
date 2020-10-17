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
public class Reais {
    
    public static void main(String[] args){
        String str1, str2 = "Conteudo da variavel sh: ";
        //char ch = 'B';
        {
            char sh = 'A';
            str1 = str2 + sh + "\n";
        }
        {
            char sh = 66;
            str1 = str1 + str2 + sh + "\n";
        }
        {
            char sh = '\u0043';
            str1 = str1 + str2 + sh + "\n";
        }
        JOptionPane.showMessageDialog(null, str1);
        System.out.println(str1);
    }
    
}
