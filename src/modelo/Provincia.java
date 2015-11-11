
package modelo;

import java.util.*;

public class Provincia {
   
    private int id;
    private String nombre;
    private String pais;

    public Provincia(int id_provincia, String nombre, String pais) {
        this.id = id_provincia;
        this.nombre = nombre;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setId_provincia(int id_provincia) {
        this.id = id_provincia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
    
}
