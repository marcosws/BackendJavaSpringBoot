/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esbocotreeview;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Marcos
 */
public class TelaTreeView extends JFrame {
    
    private JPanel panel;

    public JPanel getPanel() {
        return panel;
    }
    
    
    public TelaTreeView(){
        
       this.setTitle("TreeView");
        
       panel = new JPanel();
       panel.setLayout(null);
       JLabel titulo = new JLabel("Tree View");
       titulo.setBounds(20, 20, 500, 20);
       
       DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Projeto");
       DefaultMutableTreeNode item1 = new DefaultMutableTreeNode("Item 1");
       DefaultMutableTreeNode item2 = new DefaultMutableTreeNode("Item 2");
       DefaultMutableTreeNode item3 = new DefaultMutableTreeNode("Item 3");
       DefaultMutableTreeNode item4 = new DefaultMutableTreeNode("Item 4");
       DefaultMutableTreeNode item5 = new DefaultMutableTreeNode("Item 5");
       DefaultMutableTreeNode item6 = new DefaultMutableTreeNode("Item 6");
       
       raiz.add(item1);
       raiz.add(item2);
       raiz.add(item3);
       raiz.add(item4);
       raiz.add(item5);
       raiz.add(item6);
       
       DefaultMutableTreeNode raiz2 = new DefaultMutableTreeNode("Projeto2");
       DefaultMutableTreeNode item11 = new DefaultMutableTreeNode("Item 1.1");
       raiz2.add(item11);
      
       
       JTree tree = new JTree(raiz);

       
       
       //tree.setBounds(20, 40, 100, 100);
       
       JScrollPane jScrollPane = new JScrollPane(tree);
       jScrollPane.setBounds(20, 40, 200, 100);
       
       
       
       panel.add(titulo);
       panel.add(jScrollPane);
        
    }
    
}
