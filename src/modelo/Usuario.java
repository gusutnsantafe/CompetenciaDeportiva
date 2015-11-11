
package modelo;

import java.util.*;

public class Usuario {
  
 private int id;
 private String correo;
 private String contraseña;
 private String nroDoc;
 private String nombre;
 private String apellido;
 
 private String tipodoc; 
 private String localidad;
 ArrayList <Ingreso> ingreso;
 ArrayList <Competencia> LugaresCompetencia;

    public void setId(int id) {
        this.id = id;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setNroDoc(String nroDoc) {
        this.nroDoc = nroDoc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setIngreso(ArrayList<Ingreso> ingreso) {
        this.ingreso = ingreso;
    }

    public void setLugaresCompetencia(ArrayList<Competencia> LugaresCompetencia) {
        this.LugaresCompetencia = LugaresCompetencia;
    }

    public int getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNroDoc() {
        return nroDoc;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public String getLocalidad() {
        return localidad;
    }

    public ArrayList<Ingreso> getIngreso() {
        return ingreso;
    }

    public ArrayList<Competencia> getLugaresCompetencia() {
        return LugaresCompetencia;
    }

    public Usuario(int id, String correo, String contraseña, String nroDoc, String nombre, String apellido, String tipodoc, String localidad, ArrayList<Ingreso> ingreso, ArrayList<Competencia> LugaresCompetencia) {
        this.id = id;
        this.correo = correo;
        this.contraseña = contraseña;
        this.nroDoc = nroDoc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipodoc = tipodoc;
        this.localidad = localidad;
        this.ingreso = ingreso;
        this.LugaresCompetencia = LugaresCompetencia;
    }
}
