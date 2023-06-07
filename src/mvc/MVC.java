package mvc;

import controlador.ControladorMenuPrinc;
import controlador.ControladorPersonas;
import java.sql.Connection;
import modelo.ConexionPG;
import modelo.ModeloPersona;
import vista.VistaMenuPrincipal;

import vista.VistaPersona;

public class MVC {

    
    public static void main(String[] args) {
         VistaMenuPrincipal  vistamenuPrincipal=new VistaMenuPrincipal();
         ControladorMenuPrinc ControladorPrin= new ControladorMenuPrinc(vistamenuPrincipal);
         ControladorPrin.iniciaControl();
         
        
        
        

        
    }
    
}
