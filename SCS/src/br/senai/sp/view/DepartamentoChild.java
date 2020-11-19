/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sp.view;

import br.senai.sp.controller.ControllerDepartamento;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcos
 */
public class DepartamentoChild  implements ActionListener{

    private JInternalFrame frame;
    
    private JTextField txtId;
    private JTextField txtNome;
   
    private JTable tabelaJt;
    private String operacao;
    private DefaultTableModel model;

    public DefaultTableModel getModel() {
        return model;
    }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }
    
    JButton botaoIncluir;
    JButton botaoAlterar;
    JButton botaoExcluir;
    JButton botaoConsultar;
    JButton botaoCancelar;
    JButton botaoConfirmar;
    JButton botaoFechar;
    JLabel operacaoNome;

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(JTextField txtNome) {
        this.txtNome = txtNome;
    }

    public JInternalFrame getFrame() {
        return frame;
    }

    public JTable getTabelaJt() {
        return tabelaJt;
    }

    public void setTabelaJt(JTable tabelaJt) {
        this.tabelaJt = tabelaJt;
    }
    
    public DepartamentoChild(){
        
        JPanel panel = new JPanel();
        panel.setLayout(null);

        txtId = new JTextField();
        txtNome = new JTextField();
        frame = new JInternalFrame("Departamento", true, true, true, true);

        botaoIncluir = new JButton("Incluir");
        botaoAlterar = new JButton("Alterar");
        botaoExcluir = new JButton("Excluir");
        botaoConsultar = new JButton("Consultar");
        botaoCancelar = new JButton("Cancelar");
        botaoConfirmar = new JButton("Confirmar");
        botaoFechar = new JButton("Fechar");
        
        botaoIncluir.setBounds(20, 60, 100, 20);
        botaoAlterar.setBounds(120, 60, 100, 20);
        botaoExcluir.setBounds(220, 60, 100, 20);
        botaoConsultar.setBounds(320, 60, 100, 20);
        botaoCancelar.setBounds(420, 60, 100, 20);
        botaoConfirmar.setBounds(520, 60, 100, 20);
        botaoFechar.setBounds(620, 60, 100, 20);
        botaoCancelar.setEnabled(false);
        botaoConfirmar.setEnabled(false);

        JLabel titulo = new JLabel("Cadastro de Departamento");
        titulo.setFont(new Font("Arial",Font.BOLD,14));
        titulo.setBounds(20, 20, 500, 20);

        JLabel lbId = new JLabel("Id:");
        lbId.setBounds(20, 80, 500, 20);
        txtId.setBounds(20, 100, 100, 20);
        txtId.setEditable(false);

        JLabel lbNome = new JLabel("Nome:");
        lbNome.setBounds(20, 120, 500, 20);
        txtNome.setBounds(20, 140, 500, 20);
        
        operacaoNome = new JLabel("Selecione a Operação");
        operacaoNome.setFont(new Font("Arial",Font.BOLD,14));
        operacaoNome.setBounds(20, 220, 500, 20);
        
        JLabel lbProdutos = new JLabel("Produtos:");
        lbProdutos.setBounds(20, 260, 500, 20);
  
        model = new DefaultTableModel(); 
        model.addColumn("Id"); 
        model.addColumn("Nome"); 
       
        tabelaJt = new JTable(model){
            @Override // Deixa o JTable como somente leitura (Read Only)
            public boolean editCellAt(int row, int column, java.util.EventObject e) {
                return false;
            }
        };
        
        tabelaJt.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                
                int row = tabelaJt.getSelectedRow();
                txtId.setText(tabelaJt.getModel().getValueAt(row, 0).toString());
                txtNome.setText(tabelaJt.getModel().getValueAt(row, 1).toString());
        
            }
        });
        
        JScrollPane jScrollPane = new JScrollPane(tabelaJt);
        jScrollPane.setBounds(20, 280, 700, 200);
            
        panel.add(titulo);
        panel.add(lbId);
        panel.add(lbNome);
        panel.add(txtId);
        panel.add(txtNome);
        panel.add(botaoIncluir);
        panel.add(botaoAlterar);
        panel.add(botaoExcluir);
        panel.add(botaoConsultar);
        panel.add(botaoCancelar);
        panel.add(botaoConfirmar);
        panel.add(botaoFechar);
        panel.add(lbProdutos);
        panel.add(operacaoNome);
        panel.add(jScrollPane);
       
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setBounds(0, 0, (int)PrincipalSize.getWidth(), (int)PrincipalSize.getHeight());
        frame.setVisible(true);
        
    }
    
    public void adicionaActionListener() {
       
        botaoIncluir.addActionListener(this);
        botaoAlterar.addActionListener(this);
        botaoExcluir.addActionListener(this);
        botaoConsultar.addActionListener(this);
        botaoCancelar.addActionListener(this);
        botaoConfirmar.addActionListener(this);
        botaoFechar.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        
        if(evento.getSource().equals(botaoIncluir)){
            this.operacaoBotoesHabilita(false);
            operacao = Operacao.INCLUIR.getNomeOperacao();
            operacaoNome.setText("Incluir");
        }
        else if(evento.getSource().equals(botaoAlterar)){
            this.operacaoBotoesHabilita(false);
            operacao = Operacao.ALTERAR.getNomeOperacao();
            operacaoNome.setText("Alterar");
        }
        else if(evento.getSource().equals(botaoExcluir)){
            this.operacaoBotoesHabilita(false);
            operacao = Operacao.EXCLUIR.getNomeOperacao();
            operacaoNome.setText("Excluir");
        }
        else if(evento.getSource().equals(botaoConsultar)){
            this.operacaoBotoesHabilita(false);
            operacao = Operacao.CONSULTAR.getNomeOperacao();
            operacaoNome.setText("Consultar");
        }
        else if(evento.getSource().equals(botaoCancelar)){
            this.operacaoBotoesHabilita(true);
            operacaoNome.setText("Selecione a Operação");
        }
        else if(evento.getSource().equals(botaoConfirmar)){
            this.operacaoBotoesHabilita(true);
            operacaoNome.setText("Selecione a Operação");
            if(operacao.equals(Operacao.INCLUIR.getNomeOperacao())){
                ControllerDepartamento controllerDepartamento = new ControllerDepartamento();
                controllerDepartamento.incluir(this);
                this.limparCampos();
            }
            else if(operacao.equals(Operacao.ALTERAR.getNomeOperacao())){
                ControllerDepartamento controllerDepartamento = new ControllerDepartamento();
                controllerDepartamento.alterar(this);
                this.limparCampos();
            }
            else if(operacao.equals(Operacao.EXCLUIR.getNomeOperacao())){
                ControllerDepartamento controllerDepartamento = new ControllerDepartamento();
                controllerDepartamento.excluir(this);
                this.limparCampos();
            }
            else if(operacao.equals(Operacao.CONSULTAR.getNomeOperacao())){
                ControllerDepartamento controllerDepartamento = new ControllerDepartamento();
                controllerDepartamento.consultar(this);
            }
         
        }
        else if(evento.getSource().equals(botaoFechar)){
            this.getFrame().dispose();
        }
    }
    
    private void operacaoBotoesHabilita(boolean habilita){
        
        botaoIncluir.setEnabled(habilita);
        botaoAlterar.setEnabled(habilita);
        botaoExcluir.setEnabled(habilita);
        botaoConsultar.setEnabled(habilita);
        botaoCancelar.setEnabled(!habilita);
        botaoConfirmar.setEnabled(!habilita);
        
    }
    
    public void limparCampos(){
        
        txtId.setText("");
        txtNome.setText("");
        
    }
    public void limpaTabela(){
        
        int linhas = model.getRowCount();
        for(int i = linhas - 1; i >= 0; i--){
           model.removeRow(i); 
        }
        
    }
    
}
