/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nif;

/**
 *
 * @author Santos
 */
public class Nif_ {
    private long numero;
    private char letra;
    
    public Nif_(long numero){
        this.numero = numero;
        this.calculaLetra();
    }

    public long getNumero() {
        return this.numero;
    }
    public void calculaLetra(){
      //  int numero= (int) this.numero % 23;
        //this.letra = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(numero)+ " ";
        
        String letras= "TRWAGMYFPDXBNJZSQVHLCKE";
        int pos=(int) this.numero % 23;
        this.letra=letras.charAt(pos);
    }
    public void setNumero(long numero) {
        this.numero = numero;
        this.calculaLetra();
    }
    public String getNif_(){
        return this.numero + " " + this.letra;
    }
    
    
}