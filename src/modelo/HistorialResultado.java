
package modelo;

import java.sql.Time;
import java.util.Date;


public class HistorialResultado {
    
    private int id;
    private String resultadoP1;
    private String resultadoP2;
    private Date fecha_modificacion;
    private Time hora_modificacion;
    private String presentadoP1;
    private String PresentadoP2;

    public void setId(int id) {
        this.id = id;
    }

    public void setResultadoP1(String resultadoP1) {
        this.resultadoP1 = resultadoP1;
    }

    public void setResultadoP2(String resultadoP2) {
        this.resultadoP2 = resultadoP2;
    }

    public void setFecha_modificacion(Date fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public void setHora_modificacion(Time hora_modificacion) {
        this.hora_modificacion = hora_modificacion;
    }

    public void setPresentadoP1(String presentadoP1) {
        this.presentadoP1 = presentadoP1;
    }

    public void setPresentadoP2(String PresentadoP2) {
        this.PresentadoP2 = PresentadoP2;
    }

    public int getId() {
        return id;
    }

    public String getResultadoP1() {
        return resultadoP1;
    }

    public String getResultadoP2() {
        return resultadoP2;
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }

    public Time getHora_modificacion() {
        return hora_modificacion;
    }

    public String getPresentadoP1() {
        return presentadoP1;
    }

    public String getPresentadoP2() {
        return PresentadoP2;
    }

    public HistorialResultado(int id, String resultadoP1, String resultadoP2, Date fecha_modificacion, Time hora_modificacion, String presentadoP1, String PresentadoP2) {
        this.id = id;
        this.resultadoP1 = resultadoP1;
        this.resultadoP2 = resultadoP2;
        this.fecha_modificacion = fecha_modificacion;
        this.hora_modificacion = hora_modificacion;
        this.presentadoP1 = presentadoP1;
        this.PresentadoP2 = PresentadoP2;
    }

}
