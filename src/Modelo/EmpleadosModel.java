
package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class EmpleadosModel {
    Coneccion nuevaConexion;
    Connection MyConexion;
    ResultSet rst;

    public ResultSet ListarDatos(){
        
        try{
            MyConexion = nuevaConexion.Conectar();
            Statement sentencia = MyConexion.createStatement();
            rst = sentencia.executeQuery("Select * from Empleados");
            return rst;
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se pudo listar empleado");
         
            return rst;
        }
    }

    
    
}
