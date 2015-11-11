
package modelo;

import java.util.*;

public class LugarRealizacion {
    
    private int id;
    private String nombre;
    private String descripción;
    
    ArrayList<Deporte> deporte;

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public void setDeporte(ArrayList<Deporte> deporte) {
        this.deporte = deporte;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public ArrayList<Deporte> getDeporte() {
        return deporte;
    }

    public LugarRealizacion(int id, String nombre, String descripción, ArrayList<Deporte> deporte) {
        this.id = id;
        this.nombre = nombre;
        this.descripción = descripción;
        this.deporte = deporte;
    }
}
