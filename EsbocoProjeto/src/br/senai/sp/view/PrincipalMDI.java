/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sp.view;

import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 * @author Marcos
 */
public class PrincipalMDI extends JFrame {

    public JDesktopPane getjDesktopPane() {
        return jDesktopPane;
    }

    public JMenuBar getMenuSistema() {
        return menuSistema;
    }

    public StatusBar getStatusBar() {
        return statusBar;
    }

    private JDesktopPane jDesktopPane;
    private final JMenuBar menuSistema;
    private final StatusBar statusBar;
   
    public PrincipalMDI(){
        
        this.statusBar = new StatusBar();
        this.menuSistema = new JMenuBar();
        this.jDesktopPane = new JDesktopPane();
        
        JMenu cadastroMenu = new JMenu("Cadastro");
        JMenu operacaoMenu = new JMenu("Operação");
        JMenu sistemaMenu = new JMenu("Sistema");
        
        JMenuItem produtoMI = new JMenuItem("Produto");
        JMenuItem marcaMI= new JMenuItem("Marca");
        JMenuItem departamentosMI= new JMenuItem("Departamentos"); 
         
        JMenuItem aquisicaoMI = new JMenuItem("Aquisição");
        JMenuItem saidaMI= new JMenuItem("Saida");
        
        JMenuItem ajudaMI= new JMenuItem("Ajuda");
        JMenuItem sobreMI= new JMenuItem("Sobre");
        JMenuItem sairMI= new JMenuItem("Sair");
       
        cadastroMenu.add(departamentosMI);
        cadastroMenu.add(marcaMI);
        cadastroMenu.addSeparator();
        cadastroMenu.add(produtoMI);

        operacaoMenu.add(aquisicaoMI);
        operacaoMenu.add(saidaMI);

        sistemaMenu.add(ajudaMI);
        sistemaMenu.add(sobreMI);
        sistemaMenu.addSeparator();
        sistemaMenu.add(sairMI);

        menuSistema.add(cadastroMenu);
        menuSistema.add(operacaoMenu);
        menuSistema.add(sistemaMenu);
        
        produtoMI.addActionListener((ActionEvent ev) -> {
           jDesktopPane.add(new Produto().getFrame());
        });
        marcaMI.addActionListener((ActionEvent ev) -> {
            Marca marca = new Marca();
            jDesktopPane.add(marca.getFrame());
        });
        sobreMI.addActionListener((ActionEvent ev) -> {
                // https://brunoagt.wordpress.com/2011/03/28/javax-swing-joptionpane-conhecendo-e-utilizando-a-classe-joptionpane/
            int option = JOptionPane.INFORMATION_MESSAGE + JOptionPane.OK_OPTION;
            JOptionPane.showMessageDialog(null, "Sistema de Controle de Suprimentos\nVersão: 1.0\n2020", "Sobre", option);
        });
        sairMI.addActionListener((ActionEvent ev) -> {
            System.exit(0);
        });
       
    }
    
}
