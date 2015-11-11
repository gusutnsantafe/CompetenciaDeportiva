
package modelo;

import java.util.ArrayList;

public class Resultado {
    
    private int id;
    private int resultadoP1;
    private int resultadoP2;
    private int presentadoP1;
    private int presentadoP2;
    private int ganoParticipanteP;
         
    ArrayList <HistorialResultado> HistorialResultado;

    public int getId() {
        return id;
    }

    public int getResultadoP1() {
        return resultadoP1;
    }

    public int getResultadoP2() {
        return resultadoP2;
    }

    public int getPresentadoP1() {
        return presentadoP1;
    }

    public int getPresentadoP2() {
        return presentadoP2;
    }

    public int getGanoParticipanteP() {
        return ganoParticipanteP;
    }

    public ArrayList<HistorialResultado> getHistorialResultado() {
        return HistorialResultado;
    }

    public Resultado(int id, int resultadoP1, int resultadoP2, int presentadoP1, int presentadoP2, int ganoParticipanteP, ArrayList<HistorialResultado> HistorialResultado) {
        this.id = id;
        this.resultadoP1 = resultadoP1;
        this.resultadoP2 = resultadoP2;
        this.presentadoP1 = presentadoP1;
        this.presentadoP2 = presentadoP2;
        this.ganoParticipanteP = ganoParticipanteP;
        this.HistorialResultado = HistorialResultado;
    }
}
