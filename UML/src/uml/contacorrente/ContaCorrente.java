/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml.contacorrente;

/**
 *
 * @author FIC
 */
public class ContaCorrente {
    
    String nome;
    float saldo;
    float limite;
    char tipo;
   
    public ContaCorrente(String nome, float saldo, float limite, char tipo){
        System.out.printf("Classe 1 Parâmetros: %s, %.2f, %.2f, %c \n", nome, saldo, limite, tipo);
    }
    
    public ContaCorrente(String nome, float saldo, char tipo){
        System.out.printf("Classe 2 Parâmetros: %s, %.2f, %c \n", nome, saldo, tipo);
    }
    
}
