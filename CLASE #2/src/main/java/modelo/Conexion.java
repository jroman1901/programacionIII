/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author alumno
 */
public class Conexion {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    Connection conn = null;
    Statement stmt = null;
    String base = "umg";
    String DB_URL = "jdbc:mysql://localhost:3306/" + base + "?useSSL=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "1234";

    public Conexion() {

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Conectarse al controlador de la base de datos correctamente");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


  public void guardarPaciente(Paciente paciente)
 {
        try
        {
          if (conn!=null) 
            {
            PreparedStatement st = conn.prepareStatement("insert into pacientes (nombre,direccion,telefono) values (?,?,?)");
            st.setString(1,paciente.getNombre());
            st.setString(2, paciente.getDireccion());     
            st.setString(3, paciente.getTelefono());    
            // apasamos parametros al a base de datos
            st.execute();
            // ejecutamos la instrucción
            }
            else
            {   // mostramos que no esta conectamos nosotro decidimos que hacer con este apartado
                System.out.println("no esta conectado");
            
            }
           
        } catch (SQLException ex) 
        {
            // en caso de error mostramos el mensaje de error.
              JOptionPane.showMessageDialog(null,"Error al realizar la actualización por"+ex.getMessage());
        }
 
    }  
 public boolean EditarPaciente(Paciente p, int id_paciente)
 {
     boolean res=false;
     try
     {
         if(conn!=null)
         {
                PreparedStatement st = conn.prepareStatement("update pacientes set nombre=?,direccion=?,telefono=? where id="+id_paciente);
                st.setString(1,p.getNombre());
                st.setString(2, p.getDireccion());     
                st.setString(3, p.getTelefono());    
                st.executeUpdate();
                st.close();     
             res=true;
         } 
         else
         {
             res=false;
         }
                      
         
     }
     catch(Exception ex)
     {
         System.out.println("Error al actualizar el paciente"+ex.getMessage());
         res=false;
     }
     return res;
 }
  
   
 
  public void listar(DefaultTableModel tableModel) throws SQLException
  {
      // declaramos las variables para la carga de datos
        ResultSet resultado = null;
        //Declaramos un tablemodel para la carga de datos en una tabla en memoria
        tableModel.setRowCount(0);
        // valor count 0
        tableModel.setColumnCount(0);
        // valor count tanto a nivel de fila como de columna
        // preparamos la consulta a la base de datos y lo hacemos a traves de la variable
        // global con en el metodo prepareStatement ( y la consulta empieza con el comando select 
       // el dato * significa que son todos los datos y el siguiente comando el la tabla.
        
        PreparedStatement st = conn.prepareStatement("select * from pacientes");
        // siempre controlamos los errores
        try {
            // cargamos el resultado a la base de daots
            resultado = st.executeQuery();
            // si el resultao es nullo
            if(resultado != null)
            {
                // definirmos el numero de columnas que tiene tiene la data que se carga en resultado
                int numeroColumna = resultado.getMetaData().getColumnCount();
                // hacemos un ciclo for para cargar el nombre de las columnas en el jTable
                // utilizamos un ciclo for para agregar el nombre que aparece en la tabla de datos 
                for(int j = 1;j <= numeroColumna;j++)
                {
                    // cargamos el resultado de la consulta
                    tableModel.addColumn(resultado.getMetaData().getColumnName(j));
                }
                // este while sirve para cargar los datos de las filas es decir los registros
                while(resultado.next())
                {
                    // cargamos los datos a un vector de tipo string
                    String []datos = new String[numeroColumna];
                    // rellenamos los datos a traves de un ciclo for
                    for(int i = 1;i <= numeroColumna;i++)
                    {
                           // asignamos la información al vector
                        datos[i-1] = (String) resultado.getString(i);
                    }
                    tableModel.addRow(datos);
                }
            }
        }catch(SQLException e)
        {
              JOptionPane.showMessageDialog(null,"Error al realizar la actualización por"+e.getMessage());
        }

    finally  // para operaciones de finalización si se ejecutan o no.
     {
         try
         {
             /*
             st.Close cierra la conexión a la consulta
             con.Close cerramos la conexión a la base de datos
             Cerramos la conexión a la base de datos
             */
             st.close();
             conn.close();
             
             if(resultado != null)
             {
                resultado.close();
             }
         }
         catch (Exception e)
         {
               JOptionPane.showMessageDialog(null,"Error al realizar la actualización por"+e.getMessage());
         }
     }
 
 
  }
    
 public boolean eliminarPaciente(int id)
 {
     boolean respuesta = false;
     try
     {
         if(conn!=null)
         {
                         PreparedStatement st = conn.prepareStatement("delete  from pacientes where id="+id+"");
                         st.execute();
                         respuesta = true;
                         
         }              
         else
         {
               System.out.println("Error no es posible realizar la operacion");
                 JOptionPane.showMessageDialog(null,"Error no es posible realizar la operacion");
             
         }
        return respuesta;
         
     }
     catch(Exception ex)
     {
         System.out.println("Error al realizar la actualización por"+ex.getMessage());
          JOptionPane.showMessageDialog(null,"Error al realizar la actualización por"+ex.getMessage());
         return respuesta;
     }
 }
     

   
    
    
}
