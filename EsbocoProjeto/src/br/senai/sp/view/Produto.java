/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sp.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellEditor;

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
        JButton botaoFechar = new JButton("Fechar");
        
        JComboBox BoxMarca = new JComboBox();
        JComboBox BoxDepartamento = new JComboBox();
 
        BoxMarca.addItem("Knnor");
        BoxMarca.addItem("Colgate");
        BoxMarca.addItem("Oral B");
        
        BoxDepartamento.addItem("Higiene");
        BoxDepartamento.addItem("Limpeza");
        BoxDepartamento.addItem("Alimentos");
        

        botaoIncluir.addActionListener((ActionEvent ev) -> {
            int option = JOptionPane.INFORMATION_MESSAGE + JOptionPane.OK_OPTION;
            JOptionPane.showMessageDialog(null, "Botão Incluir", "Sobre", option);
            txtNome.setText("Um nome qualquer");
        });

        botaoFechar.addActionListener((ActionEvent ev) -> {
            this.getFrame().dispose();
        });

        botaoIncluir.setBounds(20, 60, 100, 20);
        botaoAlterar.setBounds(120, 60, 100, 20);
        botaoExcluir.setBounds(220, 60, 100, 20);
        botaoConsultar.setBounds(320, 60, 100, 20);
        botaoCancelar.setBounds(420, 60, 100, 20);
        botaoConfirmar.setBounds(520, 60, 100, 20);
        botaoFechar.setBounds(620, 60, 100, 20);
        botaoCancelar.setEnabled(false);
        botaoConfirmar.setEnabled(false);

        JLabel titulo = new JLabel("Cadastro de Produto");
        titulo.setFont(new Font("Arial",Font.BOLD,14));
        titulo.setBounds(20, 20, 500, 20);

        JLabel nome = new JLabel("Nome:");
        nome.setBounds(20, 80, 500, 20);
        txtNome.setBounds(20, 100, 500, 20);

        JLabel embalagem = new JLabel("Embalagem:");
        embalagem.setBounds(20, 120, 500, 20);
        JTextField txtEmbalagem = new JTextField();

        txtEmbalagem.setBounds(20, 140, 500, 20);
        
        JLabel departamento = new JLabel("Departamento:");
        departamento.setBounds(20, 160, 500, 20);
        BoxDepartamento.setBounds(20, 180 ,500, 20);
        
        JLabel marca = new JLabel("Marca:");
        marca.setBounds(20, 200, 500, 20);
        BoxMarca.setBounds(20, 220, 500, 20);

        JLabel produtos = new JLabel("Produtos:");
        produtos.setBounds(20, 260, 500, 20);

        String[] columns = new String[] {"Id", "Nome", "Embalagem", "Marca", "Fabricante", "Departamento"};
        Object[][] data = new Object[][] {
            {1, "Molho de Tomate", "Lata 200mg", "Knnor", "Unilever", "Alimentos" },
            {2, "Molho de Tomate", "Lata 200mg", "Knnor", "Unilever", "Alimentos" },
            {3, "Molho de Tomate", "Lata 200mg", "Knnor", "Unilever", "Alimentos" },
            {4, "Molho de Tomate", "Lata 200mg", "Knnor", "Unilever", "Alimentos" },
            {4, "Molho de Tomate", "Lata 200mg", "Knnor", "Unilever", "Alimentos" },
            {5, "Molho de Tomate", "Lata 200mg", "Knnor", "Unilever", "Alimentos" },
            {6, "Molho de Tomate", "Lata 200mg", "Knnor", "Unilever", "Alimentos" },
            {7, "Molho de Tomate", "Lata 200mg", "Knnor", "Unilever", "Alimentos" },
            {8, "Molho de Tomate", "Lata 200mg", "Knnor", "Unilever", "Alimentos" },
            {9, "Molho de Tomate", "Lata 200mg", "Knnor", "Unilever", "Alimentos" },
            {10, "Molho de Tomate", "Lata 200mg", "Knnor", "Unilever", "Alimentos" },
            {11, "Molho de Tomate", "Lata 200mg", "Knnor", "Unilever", "Alimentos" },
            {12, "Molho de Tomate", "Lata 200mg", "Knnor", "Unilever", "Alimentos" },
            {13, "Molho de Tomate", "Lata 200mg", "Knnor", "Unilever", "Alimentos" },
        };

        JTable table = new JTable(data, columns){
            @Override // Deixa o JTable como somente leitura (Read Only)
            public boolean editCellAt(int row, int column, java.util.EventObject e) {
                return false;
            }
        };
            
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                
                int row = table.getSelectedRow();
                int column = table.getSelectedColumn();
                String valor = table.getModel().getValueAt(row, column).toString();
                
                int option = JOptionPane.INFORMATION_MESSAGE + JOptionPane.OK_OPTION;
                JOptionPane.showMessageDialog(null, valor, "Sobre", option);

            }
        });
        
        
        
        JScrollPane jScrollPane = new JScrollPane(table);
        jScrollPane.setBounds(20, 280, 700, 200);
            
        panel.add(titulo);
        panel.add(nome);
        panel.add(txtNome);
        panel.add(embalagem);
        panel.add(produtos);
        panel.add(txtEmbalagem);
        panel.add(botaoIncluir);
        panel.add(botaoAlterar);
        panel.add(botaoExcluir);
        panel.add(botaoConsultar);
        panel.add(botaoCancelar);
        panel.add(botaoConfirmar);
        panel.add(botaoFechar);
        panel.add(jScrollPane);
        panel.add(BoxMarca);
        panel.add(BoxDepartamento);
        panel.add(marca);
        panel.add(departamento);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setBounds(0, 0, (int)PrincipalSize.getWidth(), (int)PrincipalSize.getHeight());
        frame.setVisible(true);

    }
}
