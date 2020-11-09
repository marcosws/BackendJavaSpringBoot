/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * @author FIC
 */
public class ContaCorrente extends Banco{
    
    private double limite;

    public ContaCorrente(String nome){
        super(nome);
    }
    
    public ContaCorrente(String nome, String agencia, int numero){
        super(nome, agencia, numero);
    }
    
    public ContaCorrente(String nome, String agencia, int numero, double limite){
        super(nome, agencia, numero);
        this.setLimite(limite);
    }
    
    public double getLimite() {
        return limite;
    }

    public boolean setLimite(double valor) {
        if(valor >= 0){
            this.limite = valor;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean sacar(double valor) {
        if((valor > 0) && (valor <= (this.saldo + this.getLimite()))){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
        
        
    }
    
    
    
}
