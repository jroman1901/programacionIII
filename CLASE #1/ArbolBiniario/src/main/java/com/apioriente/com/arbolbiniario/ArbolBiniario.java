/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.apioriente.com.arbolbiniario;

/**
 *
 * @author apioriente
 */
public class ArbolBiniario {

    public static void main(String[] args) {
      
        Arbol arbol = new Arbol();
        arbol.Insertar(50);
        arbol.Insertar(30);
        arbol.Insertar(70);
        arbol.Insertar(20);
        arbol.Insertar(40);
        arbol.Insertar(60);
        arbol.Insertar(80);

        System.out.println("Recorrido en preorden:");
        System.out.println("");
        arbol.postOrden();


        
        
    }
}
