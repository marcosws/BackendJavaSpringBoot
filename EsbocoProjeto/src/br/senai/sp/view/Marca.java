/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sp.view;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;

/**
 *
 * @author Marcos
 */
public class Marca {
    
    	private final JInternalFrame frame;
	
	public JInternalFrame getFrame() {
		return frame;
	}

	public Marca(){
		
            frame = new JInternalFrame("Marca", true, true, true, true);
            frame.getContentPane().add(new JLabel("Marca Em construção ..."));
            frame.pack();
            frame.setBounds(0, 0, (int)PrincipalSize.getWidth(), (int)PrincipalSize.getHeight());
            frame.setVisible(true);
            
	}
    
}
