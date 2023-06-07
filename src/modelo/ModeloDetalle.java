
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
public class ModeloDetalle  extends Detalles{
   ConexionPG cpg = new ConexionPG();
    public int conta = 0;
    String sql;
    public boolean crearFacturadetalles() {
         sql = "INSERT INTO `detalle`(`codigoproduc`, `encabezado_id`, `subtotalpro`, `cantidad`) VALUES " + "('" + getCodigoproducto() + "','" + getEncabezado_id() + "','" + getSubtotalpro() + "','" + getCantidad() + "')";
         
         System.out.println(sql);
         return cpg.accionBD(sql);
    }
    
    
    public List<Detalles> listarDETALLES( int idenca) {
        List<Detalles> listadetalles = new ArrayList<Detalles>();
       
          sql = "SELECT `iddetalle`, `codigoproduc`, `encabezado_id`, `subtotalpro`, `cantidad` FROM `detalle` WHERE encabezado_id="+idenca+"";   
        try {   
            ResultSet rs = cpg.consultaBD(sql);
            if (rs != null) {
                while (rs.next()) {
                    Detalles detalle = new Detalles();
                    detalle.setIddetalle(rs.getInt(1));
                    detalle.setCodigoproducto(rs.getInt(2));
                    detalle.setEncabezado_id(rs.getInt(3));
                    detalle.setSubtotalpro(rs.getDouble(4));
                    detalle.setCantidad(rs.getInt(5));
                    listadetalles.add(detalle);                   
                }
            }

            return listadetalles;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no ejecuta el array list");
            return null;
        }
    }
    
    
}
