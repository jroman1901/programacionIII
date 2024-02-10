/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Paciente;

/**
 *
 * @author alumno
 */
public class Controller {

    public void Guardar(Paciente paciente) {
        Conexion c = new Conexion();
        try {
            c.guardarPaciente(paciente);
            JOptionPane.showMessageDialog(null, "Datos registrados correctamente");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No es posible guardar la información por:" + ex.getMessage());

        }
    }

    public void Consultar(DefaultTableModel model) {
        try {
            Conexion c = new Conexion();
            c.listar(model);
        } catch (Exception ex) {

        }

    }

    public boolean Editar(Paciente p, int id_paciente) {
       Conexion c = new Conexion();
       if(c.EditarPaciente(p,id_paciente))
       {
           return true;
       }
       else
       {
           return false;
       }
       
    }

    public boolean Eliminar(int id) {
        Conexion c = new Conexion();
        if (c.eliminarPaciente(id)) {
            return true;

        } else {

            return false;
        }

    }

}
