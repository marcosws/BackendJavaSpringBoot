/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import basic.Agenda;

/**
 *
 * @author FIC
 */
public class Inserir {
    
    public Agenda inserirAgenda(String contato, String telefone){
        
        Agenda agenda = new Agenda(contato,telefone);
        return agenda;
    }
}
