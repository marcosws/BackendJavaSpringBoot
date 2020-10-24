/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * @author FIC
 */
public abstract class Banco extends Conta{
    
    private String agencia;
    private int numero;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public boolean setNumero(int numero) {
        if(numero > 0){
            this.numero = numero;
            return true;
        }
        else{
            return false;
        }
    }
}
