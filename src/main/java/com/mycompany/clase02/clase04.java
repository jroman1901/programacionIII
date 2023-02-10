/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase02;

import java.util.Scanner;

/**
 *
 * @author apioriente
 */
public class clase04 {
    
    public static void main(String Args[])
    {
        
            Scanner scaner = new Scanner(System.in);
            System.out.println("Ingrese la palabra");
            String texto = scaner.next();
            char [] arreglo = texto.toCharArray();
            int posicion=0;
            int total =0;
            
            while(posicion < arreglo.length)
            {
                switch(arreglo[posicion])
                {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    case 'L':
                    case 'N':
                    case 'R':
                    case 'S':
                    case 'T':
                    total = total+1;       
                    break;
                    case 'D':
                    case 'G':
                    total = total+2;  
                    break;
                    case 'B':
                    case 'C':
                    case 'M':
                    case 'P':
                    total = total+3;  
                    break;
                    case 'F':
                    case 'H':
                    case 'V':
                    case 'W':
                    case 'Y':
                    total = total+4;  
                    break;
                    case 'K':
                    total = total+5;  
                    break;
                    case 'J':
                    case 'X':
                    total = total+8;  
                    break;
                    case 'Q':
                    case 'Z':
                    total = total+10;  
                    break;
                    default:
                        break;
                        
                }
                posicion= posicion+1;
                
            }
            
            System.out.println(total);
            
            
    }

    
    
}
