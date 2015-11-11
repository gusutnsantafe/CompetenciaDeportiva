
package modelo;

import java.util.*;

public class Ronda {
    private int id;
    private int cantidad;
    private int r_perdedores; 
    private String fecha;
    
    ArrayList<Partido> partido;  

    public void setId(int id) {
        this.id = id;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setR_perdedores(int r_perdedores) {
        this.r_perdedores = r_perdedores;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setPartido(ArrayList<Partido> partido) {
        this.partido = partido;
    }

    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getR_perdedores() {
        return r_perdedores;
    }

    public String getFecha() {
        return fecha;
    }

    public ArrayList<Partido> getPartido() {
        return partido;
    }

    public Ronda(int id, int cantidad, int r_perdedores, String fecha, ArrayList<Partido> partido) {
        this.id = id;
        this.cantidad = cantidad;
        this.r_perdedores = r_perdedores;
        this.fecha = fecha;
        this.partido = partido;
    }
}
