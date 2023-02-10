/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase02;

import java.util.Scanner;

import java.util.Hashtable;
/**
 *
 * @author apioriente
 */
public class clase02 {
    
    public static void main(String[] args) {

        System.out.println("Ingrese la palabra");
        Scanner escaner = new Scanner(System.in);
        String entrada = escaner.nextLine();
        char [] arreglo;
        int total = 0;
        arreglo = entrada.toCharArray();
        
        Hashtable contenido = new Hashtable();
        contenido.put('A', 1);
        contenido.put('E', 1);
        contenido.put('I', 1);
        contenido.put('O', 1);
        contenido.put('U', 1);
        contenido.put('L', 1);
        contenido.put('N', 1);
        contenido.put('R', 1);
        contenido.put('S', 1);
        contenido.put('T', 1);
        contenido.put('D', 2);
        contenido.put('G', 2);  
        contenido.put('B', 3);
        contenido.put('C', 3);
        contenido.put('M', 3);
        contenido.put('P', 3);
        contenido.put('F', 4);
        contenido.put('H', 4);
        contenido.put('V', 4);
        contenido.put('W', 4);
        contenido.put('Y', 4);
        contenido.put('K', 5);
        contenido.put('J', 8);
        contenido.put('X', 8);
        contenido.put('Q', 10);
        contenido.put('Z', 10);
      
        for (char dato : arreglo) {
            total = total + Integer.parseInt(contenido.get(dato).toString());
        }

        System.out.println(total);

    }
    
}
