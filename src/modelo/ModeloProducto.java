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
public class ModeloProducto extends Producto {
    ConexionPG cpg = new ConexionPG();
    int conta = 0;
    String sql;

    public ModeloProducto() {
    }
    public List<Producto> listarProductos( String nombrepro) {
        List<Producto> listaProductos = new ArrayList<Producto>();
        if (nombrepro.equals("")) {
          sql = "SELECT `idproducto`, `nombrepro`, `preciopro`, `categoriapro`, `stock`, `fotopro`, `descripcionpro` FROM `productos`";   
        }else{  
        sql = "SELECT `idproducto`, `nombrepro`, `preciopro`, `categoriapro`, `stock`, `fotopro`, `descripcionpro` FROM `productos` WHERE idproducto='" + nombrepro + "'";    
        }
        try {
            
            ResultSet rs = cpg.consultaBD(sql);
            if (rs != null) {
                while (rs.next()) {
                    Producto producto = new Producto();
                    producto.setIdproducto(rs.getInt(1));
                    producto.setNombrepro(rs.getString(2));
                    producto.setPreciopro(rs.getDouble(3));
                    producto.setCategoriapro(rs.getString(4));
                    producto.setStock(rs.getInt(5));
//                    producto.setFotopro(rs.getByte(6));
                    producto.setDescripcionpro(rs.getString(7));
                    listaProductos.add(producto);
//                    System.out.println(producto.toString());
                }
            }
//              System.out.println(listaProductos);
            return listaProductos;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloProducto.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no ejecuta el array list");
            return null;
        }
    }
    public boolean eliminarproducto(String ideliminar){
         boolean eliminado=true;
         try {
              sql="DELETE FROM `productos` WHERE idproducto ="+ideliminar; 
            cpg.accionBD(sql);
            eliminado=true;         
         } catch (Exception e) {
            eliminado=false;  
         }
         return eliminado;
         
     } 
     public boolean crearProducto() {
        
         sql = "INSERT INTO `productos`(`nombrepro`, `preciopro`, `categoriapro`, `stock`, `fotopro`,`descripcionpro`) VALUES "
                 + "('" +getNombrepro() + "','" +getPreciopro()  + "','" +getCategoriapro()  + "','" +getStock()  + "','" +1+ "','" +getDescripcionpro()+ "')"; 
         
        return cpg.accionBD(sql);
    }
     public boolean updateProducto() { 
         sql = "UPDATE productos SET nombrepro='"
                +getNombrepro()+"', preciopro='"
                +getPreciopro()+"', categoriapro='"
                +getCategoriapro()+"', stock='"
                +getStock()+"', descripcionpro='"
                +getDescripcionpro()+"' WHERE idproducto='"+getIdproducto()+"'";

        return cpg.accionBD(sql);
    }
    
    
}
