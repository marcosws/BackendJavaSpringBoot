/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml.eletrodomestico;

/**
 *
 * @author Marcos
 */
public class Eletrodomestico {
    
    
    /* atributos */
    private String tensao;
    private String cor;
    private String potencia;
    private String marca;
    private String modelo;
    private boolean ligado;
    
    
    /* Metodos ligar() e desligar()*/
    public void ligar(){
        System.out.println("Ligado");
        this.setLigado(true);
    }
     public void ligar(String nome){
        System.out.println(nome + ": Ligado");
        this.setLigado(true);
    }
    public void desligar(){
        System.out.println("Desligado");
        this.setLigado(false);
    }
    public void desligar(String nome){
        System.out.println(nome + ": Desligado");
        this.setLigado(false);
    }
    
    /* Getters e Setters */
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
    
}
