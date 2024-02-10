/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.clase_01;
import javax.swing.UIManager;
import modelo.Conexion;
import vista.Formulario;

/**
 *
 * @author alumno
 */
public class main {
    
    public static void main(String args[]) {
        try {
            Formulario p = new Formulario();
            p.setBounds(100, 50, 800, 600);
            p.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
