/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml;

/**
 *                    |-----------------------
  Eletrodomestico   ->   Ferro de Passar   |->   Liquidificador
  ---------------        ---------------        ---------------
  tensão                 termostato             velocidade
  cor 
  potencia
  ---------------
  ligar()
  desligar()
======================================================================
  Carro
  ----------------
  rodas
  cor 
  modelo 
  marca 
  ---------------
  andar();
  freiar();
=======================
  Caixa de Dialogo
  -----------------
  Label
  botao
  titulo
  -----------------
  abrir();
 * 
 * 
 * 
 * 
 * @author FIC
 */
public abstract class Eletrodomestico {
    
    private String tensao;
    private String cor;
    private String potencia;
            
    abstract void ligar();
    
    abstract void desligar();

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
