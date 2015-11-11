
package modelo;

public class FormaPuntuacion {
    private int id;
    private String nombre;

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public FormaPuntuacion(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
