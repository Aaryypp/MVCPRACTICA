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
public class Encabezado {
    private int codigoenca;
    private String idpersona;
    private Date fechafac;
    private Double total;
    private String estado;
    

    public Encabezado() {
    }

    public int getCodigoenca() {
        return codigoenca;
    }

    public void setCodigoenca(int codigoenca) {
        this.codigoenca = codigoenca;
    }

    public String getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(String idpersona) {
        this.idpersona = idpersona;
    }

    public Date getFechafac() {
        return fechafac;
    }

    public void setFechafac(Date fechafac) {
        this.fechafac = fechafac;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
}
