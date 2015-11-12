
package modelo;

import java.util.*;

public class Competencia {
    
    private int id;
    private String nombre;
    private String reglamento;
   
    private int cantidadMaximaDeSets;
    private String tantosPorAusenciaDeRival;
    private int puntosPorPresentacion;
    private int puntosPorVictoria;
    private int empatePermitido;
    private String puntosPorPermitido;
    
    private Estado estado;
    private FormaPuntuacion formaPuntuacion;
    private Modalidad modalidad;
    private Fixture fixture;
    private Deporte deporte;
    private ArrayList<Disponibilidad> disponibilidad;
    private ArrayList<TablaPosicionesParticipante> tablaPosicionesParticipante;

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setReglamento(String reglamento) {
        this.reglamento = reglamento;
    }

    public void setCantidadMaximaDeSets(int cantidadMaximaDeSets) {
        this.cantidadMaximaDeSets = cantidadMaximaDeSets;
    }

    public void setTantosPorAusenciaDeRival(String tantosPorAusenciaDeRival) {
        this.tantosPorAusenciaDeRival = tantosPorAusenciaDeRival;
    }

    public void setPuntosPorPresentacion(int puntosPorPresentacion) {
        this.puntosPorPresentacion = puntosPorPresentacion;
    }

    public void setPuntosPorVictoria(int puntosPorVictoria) {
        this.puntosPorVictoria = puntosPorVictoria;
    }

    public void setEmpatePermitido(int empatePermitido) {
        this.empatePermitido = empatePermitido;
    }

    public void setPuntosPorPermitido(String puntosPorPermitido) {
        this.puntosPorPermitido = puntosPorPermitido;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setFormaPuntuacion(FormaPuntuacion formaPuntuacion) {
        this.formaPuntuacion = formaPuntuacion;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    public void setFixture(Fixture fixture) {
        this.fixture = fixture;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    public void addDisponibilidad(Disponibilidad unaDisponibilidad) {
        disponibilidad.add(unaDisponibilidad);
    } 
    
    public void addTablaPosicionesParticipante(TablaPosicionesParticipante unaTabla) {
        tablaPosicionesParticipante.add(unaTabla);
    }    
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getReglamento() {
        return reglamento;
    }

    public int getCantidadMaximaDeSets() {
        return cantidadMaximaDeSets;
    }

    public String getTantosPorAusenciaDeRival() {
        return tantosPorAusenciaDeRival;
    }

    public int getPuntosPorPresentacion() {
        return puntosPorPresentacion;
    }

    public int getPuntosPorVictoria() {
        return puntosPorVictoria;
    }

    public int getEmpatePermitido() {
        return empatePermitido;
    }

    public String getPuntosPorPermitido() {
        return puntosPorPermitido;
    }

    public Estado getEstado() {
        return estado;
    }

    public FormaPuntuacion getFormaPuntuacion() {
        return formaPuntuacion;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public Fixture getFixture() {
        return fixture;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public ArrayList<Disponibilidad> getDisponibilidad() {
        return disponibilidad;
    } 
    
    public ArrayList<TablaPosicionesParticipante> getTablaPosicionesParticipante() {
        return tablaPosicionesParticipante;
    }     
    public Competencia(int id, String nombre, String reglamento, int cantidadMaximaDeSets, String tantosPorAusenciaDeRival, int puntosPorPresentacion, int puntosPorVictoria, int empatePermitido, String puntosPorPermitido, Estado estado, FormaPuntuacion formaPuntuacion, Modalidad modalidad, Fixture fixture, Deporte deporte) {
        this.id = id;
        this.nombre = nombre;
        this.reglamento = reglamento;
        this.cantidadMaximaDeSets = cantidadMaximaDeSets;
        this.tantosPorAusenciaDeRival = tantosPorAusenciaDeRival;
        this.puntosPorPresentacion = puntosPorPresentacion;
        this.puntosPorVictoria = puntosPorVictoria;
        this.empatePermitido = empatePermitido;
        this.puntosPorPermitido = puntosPorPermitido;
        
        this.estado = estado;
        this.formaPuntuacion = formaPuntuacion;
        this.modalidad = modalidad;
        this.fixture = fixture;
        this.deporte = deporte;
        this.disponibilidad = new ArrayList<>();
        this.tablaPosicionesParticipante = new ArrayList<>();
    }
    
}
