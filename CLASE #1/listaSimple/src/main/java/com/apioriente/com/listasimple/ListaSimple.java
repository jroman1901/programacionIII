/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.apioriente.com.listasimple;

/**
 *
 * @author apioriente
 */
public class ListaSimple {

    public static void main(String[] args) {
        
        Lista lista = new Lista();
        lista.AgregarInicio(12);
        lista.AgregarFinal(15);
        lista.AgregarFinal(15);
        lista.listar();
        lista.eliminar();
        lista.listar();
        
    }
}
