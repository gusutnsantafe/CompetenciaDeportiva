
package modelo;

import java.sql.Time;
import java.util.Date;

public class HistorialParticipante {
    
    private int id;
    private String correoElectronico;
    private String nombre;
    private String imagen;
    private Date fecha;
    private Time hora;

    public void setId(int id) {
        this.id = id;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHora() {
        return hora;
    }

    public HistorialParticipante(int id, String correoElectronico, String nombre, String imagen, Date fecha, Time hora) {
        this.id = id;
        this.correoElectronico = correoElectronico;
        this.nombre = nombre;
        this.imagen = imagen;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    
    
}
