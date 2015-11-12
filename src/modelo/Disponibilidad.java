
package modelo;

import java.util.*;

public class Disponibilidad {

   private int id;
   private String cantidad;
   private LugarRealizacion lg;

    public void setId(int id) {
        this.id = id;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setLg(LugarRealizacion lg) {
        this.lg = lg;
    }

    public int getId() {
        return id;
    }

    public String getCantidad() {
        return cantidad;
    }

    public LugarRealizacion getLg() {
        return lg;
    }

    public Disponibilidad(int id, String cantidad, LugarRealizacion lg) {
        this.id = id;
        this.cantidad = cantidad;
        this.lg = lg;
    }

}
