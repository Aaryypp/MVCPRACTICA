package modelo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.JOptionPane;


public class Persona {
    private String idPersona;
    private String nombrePersona;
    private String apellidoPersona;
    private Date fechanacimineto;
    private String telefono;
    private String sexo;
    private double sueldo;
    private String cupo;
    private String foto;
    private String correo;
    
    
    
    public Persona() {
    }

    public Persona(String idPersona, String nombrePersona, String apellidoPersona, Date fechanacimineto, String telefono, String sexo, double sueldo, String cupo, String foto, String correo) {
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.fechanacimineto = fechanacimineto;
        this.telefono = telefono;
        this.sexo = sexo;
        this.sueldo = sueldo;
        this.cupo = cupo;
        this.foto = foto;
        this.correo = correo;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public Date getFechanacimineto() {
        return fechanacimineto;
    }

    public void setFechanacimineto(Date fechanacimineto) {
        this.fechanacimineto = fechanacimineto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCupo() {
        return cupo;
    }

    public void setCupo(String cupo) {
        this.cupo = cupo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombrePersona=" + nombrePersona + ", apellidoPersona=" + apellidoPersona + ", fechanacimineto=" + fechanacimineto + ", telefono=" + telefono + ", sexo=" + sexo + ", sueldo=" + sueldo + ", cupo=" + cupo + ", foto=" + foto + ", correo=" + correo + '}';
    }
    
    public int getEdad(Date fecha_nac) {
        LocalDateTime date = Instant.ofEpochMilli(fecha_nac.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
        return (int) ChronoUnit.YEARS.between(date, LocalDateTime.now());
    }
  
    
//     Date cumple = calendario2.getDate();
//     LocalDate nac=cumple.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//     LocalDate hoy=LocalDate.now();
//     int edad=Period.between(nac, hoy).getYears();

    
    
    
    
}
