/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * @author FIC
 */
public class Poupanca extends Banco{
    
    private int aniversario;

    public Poupanca(String nome){
        super(nome);
    }
    
    public Poupanca(String nome, String agencia, int numero){
        super(nome, agencia, numero);
    }
    
    public Poupanca(String nome, String agencia, int numero, int aniversario){
        super(nome, agencia, numero);
        this.setAniversario(aniversario);
    }
    
    
    public int getAniversario() {
        return aniversario;
    }

    public void setAniversario(int aniversario) {
        this.aniversario = aniversario;
    }
    
    public void rendimento(){
        
    }

    @Override
    public boolean sacar(double valor){
        if((valor > 0) && (valor <= this.saldo)){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
