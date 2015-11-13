
package modelo;
    
import DAO.CompetenciaDaoJDBC;

public class Estado {
        private int id;
        private String nombre;

    public Estado(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
}
