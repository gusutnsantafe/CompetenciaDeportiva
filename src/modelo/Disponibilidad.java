
package modelo;

import java.util.*;

public class Disponibilidad {

   private int id;
   private String cantidad;
   
   ArrayList<LugarRealizacion> lg;

    public void setId(int id) {
        this.id = id;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setLg(ArrayList<LugarRealizacion> lg) {
        this.lg = lg;
    }

    public int getId() {
        return id;
    }

    public String getCantidad() {
        return cantidad;
    }

    public ArrayList<LugarRealizacion> getLg() {
        return lg;
    }

    public Disponibilidad(int id, String cantidad, ArrayList<LugarRealizacion> lg) {
        this.id = id;
        this.cantidad = cantidad;
        this.lg = lg;
    }

}
