/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sp.view.common;

import br.senai.sp.view.chid.DepartamentoChild;
import br.senai.sp.view.chid.MarcaChild;
import br.senai.sp.view.chid.SaidaChild;
import br.senai.sp.view.chid.ProdutoChild;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class PrincipalMDI extends JFrame implements ActionListener {

    public JDesktopPane getjDesktopPane() {
        return jDesktopPane;
    }

    public JMenuBar getMenuSistema() {
        return menuSistema;
    }

    public StatusBar getStatusBar() {
        return statusBar;
    }

    private final JDesktopPane jDesktopPane;
    private final JMenuBar menuSistema;
    private final StatusBar statusBar;
    
    private final JMenu cadastroMenu;
    private final JMenu operacaoMenu;
    private final JMenu sistemaMenu;
    private final JMenu ajudaMenu;
    
    private final JMenuItem marcaMenuItem;
    private final JMenuItem departamentoMenuItem;
    private final JMenuItem produtoMenuItem;
    
    private final JMenuItem compraMenuItem;
    private final JMenuItem saidaMenuItem;
    
    private final JMenuItem sairMenuItem;
    private final JMenuItem ajudaMenuItem;
    private final JMenuItem sobreMenuItem;
    
    
    public PrincipalMDI() {
        
        this.statusBar = new StatusBar();
        this.menuSistema = new JMenuBar();
        this.jDesktopPane = new JDesktopPane();
        
        cadastroMenu = new JMenu("Cadastro");
        operacaoMenu = new JMenu("Operação");
        sistemaMenu = new JMenu("Sistema");
        ajudaMenu = new JMenu("Ajuda");
        
        marcaMenuItem = new JMenuItem("Marca");
        departamentoMenuItem = new JMenuItem("Departamento");
        produtoMenuItem = new JMenuItem("Produto");
        saidaMenuItem = new JMenuItem("Saida");
        compraMenuItem = new JMenuItem("Compra");
        sairMenuItem = new JMenuItem("Sair");
        ajudaMenuItem = new JMenuItem("Ajuda");
        sobreMenuItem = new JMenuItem("Sobre");

        cadastroMenu.add(marcaMenuItem);
        cadastroMenu.add(departamentoMenuItem);
        cadastroMenu.addSeparator();
        cadastroMenu.add(produtoMenuItem);
        
        operacaoMenu.add(compraMenuItem);
        operacaoMenu.add(saidaMenuItem);
       
        sistemaMenu.add(sairMenuItem);
        
        ajudaMenu.add(ajudaMenuItem);
        ajudaMenu.add(sobreMenuItem);
        
        menuSistema.add(cadastroMenu);
        menuSistema.add(operacaoMenu);
        menuSistema.add(sistemaMenu);
        menuSistema.add(ajudaMenu);
        
    }

    public void adicionaActionListener() {
        
       marcaMenuItem.addActionListener(this);
       departamentoMenuItem.addActionListener(this);
       produtoMenuItem.addActionListener(this);
       
       saidaMenuItem.addActionListener(this);
       
       
       sobreMenuItem.addActionListener(this);
       sairMenuItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource().equals(marcaMenuItem)){
            MarcaChild marcaChild = new MarcaChild();
            marcaChild.adicionaActionListener();
            jDesktopPane.add(marcaChild.getFrame());
        }
        else if(evento.getSource().equals(departamentoMenuItem)){
            DepartamentoChild departamentoChild = new DepartamentoChild();
            departamentoChild.adicionaActionListener();
            jDesktopPane.add(departamentoChild.getFrame());
        }
        else if(evento.getSource().equals(produtoMenuItem)){
            ProdutoChild produtoChild = new ProdutoChild();
            produtoChild.adicionaActionListener();
            produtoChild.inicializa();
            jDesktopPane.add(produtoChild.getFrame());
        }
        else if(evento.getSource().equals(saidaMenuItem)){
         /*   
            SaidaChild saidaChild = new SaidaChild();
            saidaChild.adicionaActionListener();
            jDesktopPane.add(saidaChild.getFrame());
           */
        }
        else if(evento.getSource().equals(sairMenuItem)){
            System.exit(0);
        }
        else if(evento.getSource().equals(sobreMenuItem)){
            int option = JOptionPane.INFORMATION_MESSAGE + JOptionPane.OK_OPTION;
            JOptionPane.showMessageDialog(null, SgsConstantes.NOME_SISTEMA +  "\nVersão: " + SgsConstantes.VERSAO, "Sobre", option);
        }
    }
   
}
