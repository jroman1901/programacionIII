/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apioriente.com.listasimple;

/**
 *
 * @author apioriente
 */
public class Nodo {

    public Nodo getSiguiente() {
        return siguiente;
    }

    public int getValor() {
        return valor;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    private int valor;
    private Nodo siguiente;
    
    public Nodo()
    {
        this.valor =0;
        this.siguiente=null;
    }
    
}
