/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import mvc.*;
import controlador.ControladorPersonas;
import modelo.ModeloDetalle;
import modelo.ModeloEncabezado;
import modelo.ModeloPersona;
import modelo.ModeloProducto;
import vista.VistaMenuPrincipal;
import vista.VistaPersona;
import vista.VistaProducto;
import vista.Vistafactura;

/**
 *
 * @author ariel
 */
public class ControladorMenuPrinc {
    VistaMenuPrincipal vistaPrincipal;
    Vistafactura vistafac;
    public ControladorMenuPrinc() {
    }

    public ControladorMenuPrinc (VistaMenuPrincipal vistaPrincipal){
        this.vistaPrincipal=vistaPrincipal;
        System.out.println(vistaPrincipal.isVisible());
        vistaPrincipal.setVisible(true);
        
    }
    public void iniciaControl(){
        vistaPrincipal.getMenuclientes().addActionListener(l->menuPersona());
        vistaPrincipal.getToolbarclie().addActionListener(l->menuPersona());
        vistaPrincipal.getMenuproductos().addActionListener(l->menuProducto());
        vistaPrincipal.getBOTONPRODUC().addActionListener(l->menuProducto());
        vistaPrincipal.getMenuFacturar().addActionListener(l->menuFactura());
        vistaPrincipal.getBTNFACTURAS().addActionListener(l->menuFactura());
        
    }
    public void menuPersona(){

       ModeloPersona modelo = new ModeloPersona();
        try {
            vistaPrincipal.getDskprincipal().add(vista);
        } catch (Exception e) {
            vista = new VistaPersona();
            vistaPrincipal.getDskprincipal().add(vista);
        }
        
        ControladorPersonas controlador = new ControladorPersonas(modelo, vista);
        controlador.iniciarControlador();
        
    }
     VistaPersona vista;
    public void menuProducto(){

       ModeloProducto modelo = new ModeloProducto();
        try {
            vistaPrincipal.getDskprincipal().add(vista2);
        } catch (Exception e) {
            vista2 = new VistaProducto();
            vistaPrincipal.getDskprincipal().add(vista2);
        }
        
        ControladorProducto controlador = new ControladorProducto(modelo, vista2);
        controlador.iniciarControlador();
        
    }
     VistaProducto vista2;
       public void menuFactura(){

       ModeloEncabezado modeloenca = new ModeloEncabezado();
       ModeloProducto modelopro=new ModeloProducto();
       ModeloPersona modeloper=new ModeloPersona();
       ModeloDetalle modelodeta=new ModeloDetalle();
       ControladorProducto contpro =new ControladorProducto();
      
       
        try {
            vistaPrincipal.getDskprincipal().add(vistafac);
        } catch (Exception e) {
            vistafac = new Vistafactura(); 
            
            vistaPrincipal.getDskprincipal().add(vistafac);
        }

        ControladorFactura controlador = new ControladorFactura(modeloenca,modelodeta,vistafac,contpro,modelopro,modelodeta,modeloper);
        controlador.iniciarControlador();
        
    }
     
     

}
    


