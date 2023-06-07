/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ariel
 */
public class Producto {
    private int idproducto;
    private String nombrepro;
    private Double preciopro; 
    private String categoriapro;
    private int stock;
    private Byte fotopro;
    private String descripcionpro;

    public Producto() {
    }

    public Producto(int idproducto, String nombrepro, Double preciopro, String categoriapro, int stock, Byte fotopro, String descripcionpro) {
        this.idproducto = idproducto;
        this.nombrepro = nombrepro;
        this.preciopro = preciopro;
        this.categoriapro = categoriapro;
        this.stock = stock;
        this.fotopro = fotopro;
        this.descripcionpro = descripcionpro;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombrepro() {
        return nombrepro;
    }

    public void setNombrepro(String nombrepro) {
        this.nombrepro = nombrepro;
    }

    public Double getPreciopro() {
        return preciopro;
    }

    public void setPreciopro(Double preciopro) {
        this.preciopro = preciopro;
    }

    public String getCategoriapro() {
        return categoriapro;
    }

    public void setCategoriapro(String categoriapro) {
        this.categoriapro = categoriapro;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Byte getFotopro() {
        return fotopro;
    }

    public void setFotopro(Byte fotopro) {
        this.fotopro = fotopro;
    }

    public String getDescripcionpro() {
        return descripcionpro;
    }

    public void setDescripcionpro(String descripcionpro) {
        this.descripcionpro = descripcionpro;
    }

    @Override
    public String toString() {
        return "Producto{" + "idproducto=" + idproducto + ", nombrepro=" + nombrepro + ", preciopro=" + preciopro + ", categoriapro=" + categoriapro + ", stock=" + stock + ", fotopro=" + fotopro + ", descripcionpro=" + descripcionpro + '}';
    }
    
    
    
}
