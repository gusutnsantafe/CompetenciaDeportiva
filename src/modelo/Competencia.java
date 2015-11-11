
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
    
    private String estado;
    private String formaPuntuacion;
    private String modalidad;
    private String fixture;
    private String deporte;

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

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFormaPuntuacion(String formaPuntuacion) {
        this.formaPuntuacion = formaPuntuacion;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public void setFixture(String fixture) {
        this.fixture = fixture;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
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

    public String getEstado() {
        return estado;
    }

    public String getFormaPuntuacion() {
        return formaPuntuacion;
    }

    public String getModalidad() {
        return modalidad;
    }

    public String getFixture() {
        return fixture;
    }

    public String getDeporte() {
        return deporte;
    }

    public Competencia(int id, String nombre, String reglamento, int cantidadMaximaDeSets, String tantosPorAusenciaDeRival, int puntosPorPresentacion, int puntosPorVictoria, int empatePermitido, String puntosPorPermitido, String estado, String formaPuntuacion, String modalidad, String fixture, String deporte) {
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
    }
    
}
