/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

//import Model.Conta;
//import Model.Banco;
import Model.ContaCorrente;
import Model.Poupanca;

/**
 * @author FIC
 */
public class Principal {
    // psvm [tab] - sout [tab]
    public static void main(String[] args){
        
        ContaCorrente obj_cc = new ContaCorrente();
        obj_cc.setNumero(1);
        System.out.println("Numero: " + obj_cc.getNumero());
        
        Poupanca obj_cpp = new Poupanca();
        
        obj_cpp.setAniversario(38);
        System.out.println("Aniversário: " + obj_cpp.getAniversario());
        
        obj_cpp.setSaldo(300.12);
        obj_cc.setSaldo(300.11);
        
        System.out.println("Saldo CP .......: " + obj_cpp.getSaldo());
        System.out.println("Saldo CC .......: " + obj_cc.getSaldo());
        
        System.out.println("Saque: ====================== ");
        obj_cc.sacar(80);
        obj_cpp.sacar(90);
        System.out.println("Saldo CP .......: " + obj_cpp.getSaldo());
        System.out.println("Saldo CC .......: " + obj_cc.getSaldo());
        
        
        
        
        //Conta obj_conta = new Conta();
        //System.out.println(obj_conta.nome);
        
       // Banco obj_banco = new Banco();
       // obj_banco.setNome("caio");
       // System.out.println("Nome: " + obj_banco.getNome());
        
       // obj_banco.setSaldo(100.90);
       // System.out.println("Saldo anterior: : " + String.format("%.2f",obj_banco.getSaldo()));
       // obj_banco.sacar(60);
        
       // System.out.println("O Cliente " + obj_banco.getNome() + " possui " + String.format("%.2f",obj_banco.getSaldo()) + " de saldo na conta.");
        
       // obj_banco.depositar(100);
        
       // System.out.println("O Cliente " + obj_banco.getNome() + " possui " + String.format("%.2f",obj_banco.getSaldo()) + " de saldo na conta.");
         
 
    }
    
}
