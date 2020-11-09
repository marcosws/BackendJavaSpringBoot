/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * @author FIC
 */
public abstract class Conta {
    
    // declaração de atributos
    private String nome;
    protected double saldo;
    
    public Conta(String nome){
        this.setNome(nome);
    }
    
    
    // métodos get e set
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        if(nome.length() > 3){
            this.nome = nome;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    // métodos
    public abstract boolean sacar(double valor);
    
    public boolean depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            return true;
        }
        else{
            return false;
        }
       // this.saldo = this.saldo + valor;
    }
        
    public void transferir(){
        
    }
    
}
