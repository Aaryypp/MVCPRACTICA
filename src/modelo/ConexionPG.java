
package modelo;
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import com.mysql.jdbc.PreparedStatement;
 
public class ConexionPG {

    public static String usuario = "root";
    public static String clave = "";
    public static String url = "jdbc:mysql://localhost:3306/mvc";
    public static Connection con = null;
    public static PreparedStatement ps;
    public static ResultSet rs;


    public ConexionPG(Connection con) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            com.mysql.cj.jdbc.Driver

        } catch (ClassNotFoundException e) {
       
        }
        try {
            con = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Connection OK");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("NO SE LOGRO OK");
        }
        
    }
    public  Connection conectar() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, usuario, clave);
        } catch (Exception e) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "¡No se pudo conectar a la base de datos!", "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
    

        return con;
    }

    public ConexionPG() {
    }

    public ResultSet consultaBD(String sql) {
        con = conectar();
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);

            return rs = ps.executeQuery();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }

    }
    public boolean accionBD(String sql) {
        con = conectar();
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            System.out.println("aqui sql");
            System.out.println(sql);
           
            if ( ps.executeUpdate(sql)==1) {
                ps.close();
                return true;
            } else{
                ps.close();
                return false;
            }
            
            
        } catch (Exception ex) {
            Logger.getLogger(ConexionPG.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no ejecuta sql para ingresar");
            return false;
        }
        

    }
   
    

}
