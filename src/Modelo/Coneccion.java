
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Coneccion {
    Connection Conexion;
    
    public Connection Conectar(){
        
        try{
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        
        String nombre_servidor="168.234.74.80";
        String numero_puerto="1521";
        String sid="umg";
        String url="jdbc:oracle:thin:@"+nombre_servidor+":"+numero_puerto+":"+sid;
        
        String usuario = "HA16";
        String password = "Umg$2023";
        Conexion=DriverManager.getConnection(url,usuario,password);
       // return Conexion;
        JOptionPane.showMessageDialog(null,"Conexion Exitosa!!!");
          return Conexion;
          
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Fallo En La Conexion"+ e);
        
        }
        
        return Conexion;
    }
}
