/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sp.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.JFrame;

/**
 * @author Marcos
 */
public class ExecutaSistema {
    
    public static void main(String[] args) {
		
        java.awt.EventQueue.invokeLater(() -> {
                
            PrincipalMDI principalMdi = new PrincipalMDI();
            principalMdi.setTitle("Sistema de Controle de Suprimentos - Versão: 1.0");
            principalMdi.setJMenuBar(principalMdi.getMenuSistema());
            principalMdi.getContentPane().add(principalMdi.getStatusBar(), java.awt.BorderLayout.SOUTH);
            principalMdi.add(principalMdi.getjDesktopPane(), BorderLayout.CENTER);
            principalMdi.setMinimumSize(new Dimension(500, 500));
            principalMdi.pack();
            principalMdi.setExtendedState(Frame.MAXIMIZED_BOTH);
            principalMdi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            principalMdi.setVisible(true);
            Dimension dimension = principalMdi.getSize();
            PrincipalSize.setHeight(dimension.getHeight());
            PrincipalSize.setWidth(dimension.getWidth()); 
                
        });
    }
    
}
/*

Properties connectionProperties = new Properties();
SQLiteConfig config = new SQLiteConfig();
config.enforceForeignKeys(true);
connectionProperties = config.toProperties();
private final String connectionString = String.format("jdbc:sqlite:%s", absolute_path_to_sqlite_db);
Connection connection = DriverManager.getConnection(connectionString, connectionProperties);
*/