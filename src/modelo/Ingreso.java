
package modelo;


public class Ingreso {
    
    private int id;
    private String hora;
    private String fecha;
    private String ipConexion;

    public void setId(int id) {
        this.id = id;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setIpConexion(String ipConexion) {
        this.ipConexion = ipConexion;
    }

    public int getId() {
        return id;
    }

    public String getHora() {
        return hora;
    }

    public String getFecha() {
        return fecha;
    }

    public String getIpConexion() {
        return ipConexion;
    }

    public Ingreso(int id, String hora, String fecha, String ipConexion) {
        this.id = id;
        this.hora = hora;
        this.fecha = fecha;
        this.ipConexion = ipConexion;
    }
}
