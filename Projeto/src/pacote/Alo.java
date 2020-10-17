package pacote;

import javax.swing.JOptionPane;

public class Alo {
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog("Digite uma mensagem");
        JOptionPane.showMessageDialog(null, nome  + ", seja bem vindo!");
        System.exit(0);
    }
}