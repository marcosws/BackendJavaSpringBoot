/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esbocotreeview;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author Marcos
 */
public class FullTreeView extends JFrame{
    
    public FullTreeView (){
        
       // this.setLayout(new GridLayout(1,0));
        this.setTitle("TreeView");
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        
        JButton bt1 = new JButton("Botão 1");
        JButton bt2 = new JButton("Botão 2");
        JButton bt3 = new JButton("Botão 3");
        
        panel1.add(bt1);
        panel2.add(bt2);
        panel3.add(bt3);
        
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        JSplitPane splitContent = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        splitPane.setLeftComponent(panel1);
        splitContent.setTopComponent(panel2);
        splitContent.setBottomComponent(panel3);
        splitPane.setRightComponent(splitContent);

        Dimension minimumSize = new Dimension(100, 50);
        bt1.setMinimumSize(minimumSize);
        bt2.setMinimumSize(minimumSize);
        splitPane.setDividerLocation(200); 
        
        splitContent.setDividerLocation(400);
        splitPane.setPreferredSize(new Dimension(700, 500));
        
        
        
        this.add(splitPane);
        
    }
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(() -> {
            FullTreeView fullTreeView = new FullTreeView();
            fullTreeView.setMinimumSize(new Dimension(700,500));
            fullTreeView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fullTreeView.setVisible(true);
        });
    }
    
}
