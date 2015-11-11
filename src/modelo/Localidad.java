
package modelo;

import java.util.*;

public class Localidad {
    
    private int id;
    private String nombre;
    private String coidgoPostal;
    
    ArrayList<Provincia> provincia;

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCoidgoPostal(String coidgoPostal) {
        this.coidgoPostal = coidgoPostal;
    }

    public void setProvincia(ArrayList<Provincia> provincia) {
        this.provincia = provincia;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCoidgoPostal() {
        return coidgoPostal;
    }

    public ArrayList<Provincia> getProvincia() {
        return provincia;
    }

    public Localidad(int id, String nombre, String coidgoPostal, ArrayList<Provincia> provincia) {
        this.id = id;
        this.nombre = nombre;
        this.coidgoPostal = coidgoPostal;
        this.provincia = provincia;
    }
      
}
