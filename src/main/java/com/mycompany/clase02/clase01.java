/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase02;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author apioriente
 */
public class clase01 {

    public static void main(String[] args) {
        System.out.println("Ingrese la palabra");
        Scanner escaner = new Scanner(System.in);
        String entrada = escaner.nextLine();
        char [] arreglo;
        int total = 0;
        arreglo = entrada.toCharArray();
        for(int i=0;i<arreglo.length;i++)
        {
            if((arreglo[i]=='A')||(arreglo[i]=='E') ||(arreglo[i]=='I')||(arreglo[i]=='O')||(arreglo[i]=='U')||(arreglo[i]=='L')||(arreglo[i]=='N')||(arreglo[i]=='R')||(arreglo[i]=='S')||(arreglo[i]=='T'))
            {
             total = total +1;
            }
            else if((arreglo[i]=='D')||(arreglo[i]=='G'))
            {
             total = total +2;
            }
            else if((arreglo[i]=='B')||(arreglo[i]=='C')||(arreglo[i]=='M')||(arreglo[i]=='P'))
            {
             total = total +3;
            }
            else if((arreglo[i]=='F')||(arreglo[i]=='H')||(arreglo[i]=='V')||(arreglo[i]=='W')||(arreglo[i]=='Y'))
            {
            total = total +4;
            }
            else if((arreglo[i]=='K'))
            {
            total = total +5;
            }
            else if((arreglo[i]=='J')||(arreglo[i]=='X'))
            {
            total = total +8;
                
            }
            else if((arreglo[i]=='Q')||(arreglo[i]=='Z'))
            {
            total = total +10;
                
            }
            
        }
        System.out.println(total);
        
        
        
    }
}
