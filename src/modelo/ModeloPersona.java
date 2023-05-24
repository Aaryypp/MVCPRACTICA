
package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ModeloPersona extends Persona {

    ConexionPG cpg = new ConexionPG();
   
    int conta = 0;
    String sql;

    public ModeloPersona() {
    }

    public List<Persona> listarPersonas( String idper) {
        List<Persona> listaPersonas = new ArrayList<Persona>();
        if (idper.equals("")) {
          sql = "SELECT `idpersona`, `nombres`, `apellidos`, `fechanacimiento`, `telefono`, `sexo`, `sueldo`, `cupo`, `foto`, `correo` FROM `persona` ";   
        }else{
            
        sql = "SELECT `idpersona`, `nombres`, `apellidos`, `fechanacimiento`, `telefono`, `sexo`, `sueldo`, `cupo`, `foto`, `correo` FROM `persona` WHERE idpersona='" + idper + "'";    
        }
        
        try {
            
            ResultSet rs = cpg.consultaBD(sql);
            if (rs != null) {
                while (rs.next()) {
                    Persona persona = new Persona();
                    persona.setIdPersona(rs.getString(1));
                    persona.setNombrePersona(rs.getString(2));
                    persona.setApellidoPersona(rs.getString(3));
                    persona.setFechanacimineto(rs.getDate(4));
                    persona.setTelefono(rs.getString(5));
                    persona.setSexo(rs.getString(6));
                    persona.setSueldo(rs.getDouble(7));
                    persona.setCupo(rs.getString(8));
                    persona.setFoto(rs.getString(9));
                    persona.setCorreo(rs.getString(10));
                    listaPersonas.add(persona);
                    persona.toString();                    
                }
            }

            return listaPersonas;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no ejecuta el array list");
            return null;
        }
    }
    
      
        
     public boolean eliminarperso(String ideliminar){
         boolean eliminado=true;
         try {
              sql="DELETE FROM `persona` WHERE idpersona ="+ideliminar; 
            cpg.accionBD(sql);
            eliminado=true;         
         } catch (Exception e) {
            eliminado=false;  
         }
         return eliminado;
         
     } 
    public boolean crearPersona() {
        
         sql = "INSERT INTO `persona`(`idpersona`, `nombres`, `apellidos`, `fechanacimiento`, `telefono`, `sexo`, `sueldo`, `cupo`, `foto`, `correo`) VALUES "
                 + "('" + getIdPersona() + "','" + getNombrePersona() + "','" + getApellidoPersona() + "','" + getFechanacimineto() + "','" + getTelefono() + "',"
                 + "'" + getSexo() + "','" + getSueldo() + "','" + getCupo() + "','','" + getCorreo() + "')";       
        return cpg.accionBD(sql);
    }
    
    
     public boolean updatePersona() {
        sql = "UPDATE persona SET nombres='"
                +getNombrePersona()+"', apellidos='"
                +getApellidoPersona()+"', fechanacimiento='"
                +getFechanacimineto()+"', telefono='"
                +getTelefono()+"', sexo='"
                +getSexo()+"', sueldo='"
                +getSueldo()+"', cupo='"
                +getCupo()+"', foto='"             
                +getCorreo()+"' WHERE idpersona='"+getIdPersona()+"'";
        return cpg.accionBD(sql);
    }
 
}
