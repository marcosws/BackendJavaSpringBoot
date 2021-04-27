/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esbocotreeview;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Marcos
 */
public class EsbocoTreeView {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TelaTreeView telaTreeView = new TelaTreeView();
        telaTreeView.add(telaTreeView.getPanel(), BorderLayout.CENTER);
        telaTreeView.setMinimumSize(new Dimension(500,500));
        telaTreeView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaTreeView.setVisible(true);
        
    }
    
}
