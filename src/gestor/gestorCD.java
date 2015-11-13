package gestor;

import DAO.CompetenciaDaoJDBC;
import java.util.ArrayList;
import modelo.*;


public class gestorCD {
public void darDeAltaCD(String nombre, String reglamento, String nombreDeporte, String nombreModalidad,
                         Object matrizLugares[][], String nombreFormaPuntuacion, int cantMaximaDeSets,
                         int tantosPorAusenciaDeRival, int puntosPorPresentacion,
                         int puntosPorVictoria, boolean empatePermitido, int puntosPorEmpate) {
     
    Estado unEstado = new Estado(0, "Creada");
    CompetenciaDaoJDBC.persistirEstado(unEstado);
    FormaPuntuacion unaFormaPuntuacion = new FormaPuntuacion(0, nombreFormaPuntuacion);
    Modalidad unaModalidad = new Modalidad(0, nombreModalidad);
    Deporte unDeporte = new Deporte(0, nombreDeporte);
    // Disponibilidades
    ArrayList<Disponibilidad> listaDisponibilidades = new ArrayList();
    for (int i=0; i<matrizLugares.length; i++) {
        String unNombreLR = (String)matrizLugares[0][i];
        LugarRealizacion unLR = CompetenciaDaoJDBC.buscarLRPorNombre(unNombreLR);
        Disponibilidad unaDisponibilidad = new Disponibilidad(0, (Integer)matrizLugares[1][i], unLR);
        CompetenciaDaoJDBC.persistirDisponibilidad(unaDisponibilidad);
        listaDisponibilidades.add(unaDisponibilidad); }
    
    Competencia nuevaCD = null;
    if (nombreModalidad == "Puntuacion") {
        if (nombreFormaPuntuacion == "Liga") {
        nuevaCD = new Competencia(0, nombre, reglamento, unDeporte, unaModalidad, unEstado, listaDisponibilidades,
                                              unaFormaPuntuacion, 0, tantosPorAusenciaDeRival, puntosPorPresentacion,
                                              puntosPorVictoria, empatePermitido, puntosPorEmpate); }
        else if (nombreFormaPuntuacion == "Eliminacion simple" || nombreFormaPuntuacion == "Eliminacion doble") {
        nuevaCD = new Competencia(0, nombre, reglamento, unDeporte, unaModalidad, unEstado, listaDisponibilidades,
                                              unaFormaPuntuacion, 0, tantosPorAusenciaDeRival, 0,
                                              0, false, 0); } }
    if (nombreModalidad == "Sets") {
        if (nombreFormaPuntuacion == "Liga") {
        nuevaCD = new Competencia(0, nombre, reglamento, unDeporte, unaModalidad, unEstado, listaDisponibilidades,
                                              unaFormaPuntuacion, cantMaximaDeSets, 0, puntosPorPresentacion,
                                              puntosPorVictoria, empatePermitido, puntosPorEmpate); }
        else if (nombreFormaPuntuacion == "Eliminacion simple" || nombreFormaPuntuacion == "Eliminacion doble") {
        nuevaCD = new Competencia(0, nombre, reglamento, unDeporte, unaModalidad, unEstado, listaDisponibilidades,
                                              unaFormaPuntuacion, cantMaximaDeSets, 0, 0,
                                              0, false, 0); } }
    if (nombreModalidad == "Resultado final") {
        if (nombreFormaPuntuacion == "Liga") {
        nuevaCD = new Competencia(0, nombre, reglamento, unDeporte, unaModalidad, unEstado, listaDisponibilidades,
                                              unaFormaPuntuacion, 0, 0, puntosPorPresentacion,
                                              puntosPorVictoria, empatePermitido, puntosPorEmpate); }
        else if (nombreFormaPuntuacion == "Eliminacion simple" || nombreFormaPuntuacion == "Eliminacion doble") {
        nuevaCD = new Competencia(0, nombre, reglamento, unDeporte, unaModalidad, unEstado, listaDisponibilidades,
                                              unaFormaPuntuacion, 0, 0, 0,
                                              0, false, 0); } }
    
    for (int i=0; i<listaDisponibilidades.size(); i++) {
        CompetenciaDaoJDBC.asociarDisponibilidad(listaDisponibilidades.get(i), nuevaCD);
    }
 }
}