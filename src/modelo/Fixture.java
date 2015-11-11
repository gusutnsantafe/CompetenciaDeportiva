
package modelo;

import java.util.*;

public class Fixture {
    private int id;
    ArrayList<Ronda> ronda;

    public Fixture(int id, ArrayList<Ronda> ronda) {
        this.id = id;
        this.ronda = ronda;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Ronda> getRonda() {
        return ronda;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRonda(ArrayList<Ronda> ronda) {
        this.ronda = ronda;
    }
    
    
}
