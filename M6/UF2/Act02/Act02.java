/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author KOKO
 */
public class Act02 {
    
    public static final String driver = "org.gjt.mm.mysql.Driver";
    public static final String url = "jdbc:mysql://localhost:3306/m6uf2bdd";
    public static final String usuario = "root";
    public static final String contraseña = "";
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        Connection conexion = null;
        conexion = conexionJDBC();
    }
    
    public static Connection conexionJDBC () throws SQLException, ClassNotFoundException{
        Connection conexion = null;
        
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url,usuario,contraseña);
            JOptionPane.showMessageDialog(null, "Conexion realizada");
        } catch (Exception e) {
            System.out.println("error");
        }
        
        return conexion;
    }
    
}
