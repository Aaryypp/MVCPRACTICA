/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ariel
 */
public class ModeloEncabezado  extends Encabezado{
    ConexionPG cpg = new ConexionPG();
    public int conta = 0;
    String sql;
    public boolean crearFacturaenca() {
         sql = "INSERT INTO `encabezado`( `idpersona`, `fechafac`, `total`, `estado`) VALUES " + "('" +getIdpersona() + "','" + getFechafac() + "','" + getTotal() + "','" + getEstado() + "')";
         System.out.println(sql);
         return cpg.accionBD(sql);
    }
     public int contadorencabe(){
        sql = "SELECT codigoenca FROM encabezado;";
        ResultSet rs = cpg.consultaBD(sql);
        try {
            while (rs.next()) {
                conta = conta + 1;
            }
        } catch (Exception e) {
        }

        return conta;
    }
     public List<Encabezado> listaEncabezados() {
        List<Encabezado> listaEncabezados= new ArrayList<Encabezado>();
        
          sql = "SELECT `codigoenca`, `idpersona`, `fechafac`, `total`, `estado` FROM `encabezado` WHERE estado='ACTIVO'";   
        try {
            
            ResultSet rs = cpg.consultaBD(sql);
            if (rs != null) {
                while (rs.next()) {
                    Encabezado encabezado=new Encabezado();
                    
                    encabezado.setCodigoenca(rs.getInt(1));
                    encabezado.setIdpersona(rs.getString(2));
                    encabezado.setFechafac(rs.getDate(3));
                    encabezado.setTotal(rs.getDouble(4));
                    listaEncabezados.add(encabezado);
                                       
                }
            }

            return listaEncabezados;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no ejecuta el array list");
            return null;
        }
    }
     public boolean eliminarperso(int ideliminar){
         boolean eliminado=true;
         try {
            sql="UPDATE encabezado SET estado='INACTIVO' WHERE codigoenca="+ideliminar; 
            cpg.accionBD(sql);
            eliminado=true;         
         } catch (Exception e) {
            eliminado=false;  
         }
         return eliminado;
         
     } 


}
