/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author ariel
 */
public class Detalles {
    private int iddetalle;
    private int codigoproducto;
    private  int encabezado_id;
    
    private Double subtotalpro;
    private int cantidad;

    public Detalles() {
    }

    public Detalles(int iddetalle, int codigoproducto, int encabezado_id, Double subtotalpro, int cantidad) {
        this.iddetalle = iddetalle;
        this.codigoproducto = codigoproducto;
        this.encabezado_id = encabezado_id;
        
        this.subtotalpro = subtotalpro;
        this.cantidad = cantidad;
    }

    public int getIddetalle() {
        return iddetalle;
    }

    public void setIddetalle(int iddetalle) {
        this.iddetalle = iddetalle;
    }

    public int getCodigoproducto() {
        return codigoproducto;
    }

    public void setCodigoproducto(int codigoproducto) {
        this.codigoproducto = codigoproducto;
    }

    public int getEncabezado_id() {
        return encabezado_id;
    }

    public void setEncabezado_id(int encabezado_id) {
        this.encabezado_id = encabezado_id;
    }

    public Double getSubtotalpro() {
        return subtotalpro;
    }

    public void setSubtotalpro(Double subtotalpro) {
        this.subtotalpro = subtotalpro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
   
}

