
package modelo;

import java.util.*;

public class Disponibilidad {

   private int id;
   private int cantidad;
   private LugarRealizacion lg;

    public void setId(int id) {
        this.id = id;
    }

    public void setCantidad(int unaCantidad) {
        this.cantidad = unaCantidad;
    }

    public void setLg(LugarRealizacion lg) {
        this.lg = lg;
    }

    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public LugarRealizacion getLg() {
        return lg;
    }

    public Disponibilidad(int id, int unaCantidad, LugarRealizacion lg) {
        this.id = id;
        this.cantidad = unaCantidad;
        this.lg = lg;
    }

}
