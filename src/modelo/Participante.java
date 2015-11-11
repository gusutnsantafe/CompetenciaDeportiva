
package modelo;

 import java.util.*;

public class Participante {
    
    private int id;
    private String correo;
    private String nombre;
    private String imagen;

    /*public Participante(int id, String correo, String nombre, String imagen, ArrayList<HistorialParticipante> HistP) {
        this.id = id;
        this.correo = correo;
        this.nombre = nombre;
        this.imagen = imagen;
        this.HistP = HistP;
    }*/

    public void setId(int id) {
        this.id = id;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setHistP(ArrayList<HistorialParticipante> HistP) {
        this.HistP = HistP;
    }
 
    ArrayList<HistorialParticipante> HistP;

    public int getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public ArrayList<HistorialParticipante> getHistP() {
        return HistP;
    }

   
   
}
