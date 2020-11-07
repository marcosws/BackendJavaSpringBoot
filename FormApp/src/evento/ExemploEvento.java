/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evento;


import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author Marcos
 */
public class ExemploEvento implements ActionListener {
    
    private JButton botao1;
    private JButton botao2;
    private JFrame frame;
    private GridLayout gridLayout;

public void janela(){
    
        gridLayout = new GridLayout(2,2);
    
        frame = new JFrame();
        frame.setLayout(gridLayout);
        botao1 = new JButton();
        botao2 = new JButton();

        //REGISTRA O EVENTO
        botao1.addActionListener(this);
        botao2.addActionListener(this);
    
        frame.getContentPane().add(botao1);
        frame.getContentPane().add(botao2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
                
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
            
        if(evento.getSource().equals(botao1)){
            botao1.setText("Botão foi clicado! ret: " + evento.getSource().equals(botao1));
            botao1.setFont(new Font("SansSerif", Font.BOLD, 20));
        }
        else if(evento.getSource().equals(botao2)){
            botao2.setText("Botão foi clicado! ret: " + evento.getSource().equals(botao2));
            botao2.setFont(new Font("SansSerif", Font.BOLD, 20));
        }
        
    }
        
    public static void main(String[] args) {
        ExemploEvento captura = new ExemploEvento();
        captura.janela();
    }
    
}
