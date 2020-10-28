/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sp.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Marcos
 */
public class Produto {
    
    	private final JInternalFrame frame;

	public JInternalFrame getFrame() {
		return frame;
	}

	public Produto(){
		
            JPanel panel = new JPanel();
            panel.setLayout(null);

             JTextField txtNome = new JTextField();

            frame = new JInternalFrame("Produto", true, true, true, true);

            JButton botaoIncluir = new JButton("Incluir");
            JButton botaoAlterar = new JButton("Alterar");
            JButton botaoExcluir = new JButton("Excluir");
            JButton botaoConsultar = new JButton("Consultar");
            JButton botaoCancelar = new JButton("Cancelar");
            JButton botaoConfirmar = new JButton("Confirmar");
            
            botaoIncluir.addActionListener((ActionEvent ev) -> {
                int option = JOptionPane.INFORMATION_MESSAGE + JOptionPane.OK_OPTION;
                JOptionPane.showMessageDialog(null, "Botão Incluir", "Sobre", option);
                txtNome.setText("Um nome qualquer");
            });
            

            botaoIncluir.setBounds(20, 60, 100, 20);
            botaoAlterar.setBounds(120, 60, 100, 20);
            botaoExcluir.setBounds(220, 60, 100, 20);
            botaoConsultar.setBounds(320, 60, 100, 20);
            botaoCancelar.setBounds(420, 60, 100, 20);
            botaoConfirmar.setBounds(520, 60, 100, 20);
            botaoCancelar.setEnabled(false);
            botaoConfirmar.setEnabled(false);

            JLabel titulo = new JLabel("Cadastro de Produto");
            titulo.setFont(new Font("Arial",Font.BOLD,14));
            titulo.setBounds(20, 20, 500, 20);

            JLabel nome = new JLabel("Nome:");
            nome.setBounds(20, 80, 500, 20);

           
            txtNome.setBounds(20, 100, 500, 20);

            JLabel marca = new JLabel("Marca:");
            marca.setBounds(20, 140, 500, 20);

            JTextField txtMarca = new JTextField();
            txtMarca.setBounds(20, 160, 500, 20);

            String[] columns = new String[] {"Id", "Nome"};
            Object[][] data = new Object[][] {
                {1, "Bolacha" },
                {2, "Arroz" },
                {3, "Sal" }
            };

            JTable table = new JTable(data, columns);
            JScrollPane jScrollPane = new JScrollPane(table);
            jScrollPane.setBounds(20, 300, 500, 200);

            panel.add(titulo);
            panel.add(nome);
            panel.add(txtNome);
            panel.add(marca);
            panel.add(txtMarca);
            panel.add(botaoIncluir);
            panel.add(botaoAlterar);
            panel.add(botaoExcluir);
            panel.add(botaoConsultar);
            panel.add(botaoCancelar);
            panel.add(botaoConfirmar);
            panel.add(jScrollPane);


            frame.getContentPane().add(panel);
            frame.pack();
            frame.setBounds(0, 0, (int)PrincipalSize.getWidth(), (int)PrincipalSize.getHeight());
            frame.setVisible(true);
	
	}

    
}
