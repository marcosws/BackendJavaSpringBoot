/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sp.model.service;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class SaidaService {
    
    public int saidaEstoque(int qtdEstoque, int qtdSaida){
        
        if(qtdEstoque == 0){
            // produto fora de estoque
            int option = JOptionPane.ERROR_MESSAGE + JOptionPane.OK_OPTION;
            JOptionPane.showMessageDialog(null, "Produto fora de estoque", "Sobre", option);
             return 0;
        }
        else if(qtdSaida > qtdEstoque){
            int option = JOptionPane.ERROR_MESSAGE + JOptionPane.OK_OPTION;
            JOptionPane.showMessageDialog(null, "Quantidade de saida é maior que a quantidade disponivel no estoque", "Sobre", option);
             return qtdEstoque;
        }
        else{
            return qtdEstoque - qtdSaida;
        }
       
    }
    
}
