
package modelo;

import java.util.ArrayList;

public class TablaPosicionesParticipante {
    
private int id;
private int puntos;
private int partidosGanados;
private int partidosPerdidos;
private int partidosEmpatados;
private int tantoEnContra;
private int tantoAFavor;

    public void setId(int id) {
        this.id = id;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public void setTantoEnContra(int tantoEnContra) {
        this.tantoEnContra = tantoEnContra;
    }

    public void setTantoAFavor(int tantoAFavor) {
        this.tantoAFavor = tantoAFavor;
    }

    public int getId() {
        return id;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public int getTantoEnContra() {
        return tantoEnContra;
    }

    public int getTantoAFavor() {
        return tantoAFavor;
    }

    public TablaPosicionesParticipante(int id, int puntos, int partidosGanados, int partidosPerdidos,
                                       int partidosEmpatados, int tantoEnContra, int tantoAFavor) {
        this.id = id;
        this.puntos = puntos;
        this.partidosGanados = partidosGanados;
        this.partidosPerdidos = partidosPerdidos;
        this.partidosEmpatados = partidosEmpatados;
        this.tantoEnContra = tantoEnContra;
        this.tantoAFavor = tantoAFavor;
    }
      
}
