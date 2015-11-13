
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;

public class CompetenciaDaoJDBC {
    
   
    
    private static final String _SQL_INSERT_COMPETENCIA = "INSERT INTO "+ "competencia" +" "
            + "(id_competencia,id_estado,id_forma_Puntuacion,id_modalidad,id_deporte,id_disponibiliad,"
            + "id_usuario, id_tablaPosicionesParticipante,id_fixture,nombre,reglamento,"
            + "cantidad_maxima_de_sets,tanto_por_ausencia_rival,puntos_por_presentacion,puntos_por_victoria,"
            + "empate_permitido,puntos_por_empate) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
  
    private static final String _SQL_FIND_ALL_ESTADO="SELECT * FROM"+ "estado";
    private static final String _SQL_FIND_ALL_FORMA_PUNTUACION="SELECT * FROM"+ "forma_puntuacion";
    private static final String _SQL_FIND_ALL_MODALIDAD="SELECT * FROM"+ "modalidad";
    private static final String _SQL_INSERT_DISPONIBILIADAD="SELECT * FROM"+ "disponibilidad";
    private static final String _SQL_FIND_ALL_USUARIO="SELECT * FROM"+ "usuario";
    private static final String _SQL_FIND_ALL_TABLA_POSICIONES_PARTICIPANTE="SELECT * FROM"+ "tabla_posiciones";
    private static final String _SQL_FIND_ALL_DEPORTE = "SELECT * FROM " + "deporte";
    private static final String _SQL_FIND_ALL_FIXTURE="SELECT * FROM"+ "fixture";
    
    public static void persistirEstado(Estado unEstado){
        
        /* int unIdEstado = unEstado.getID(); */
        String unNombreEstado = unEstado.getNombre();
        String insertarEstado="INSERT INTO estado" + "VALUES (" + unNombreEstado + ")";
        
        Connection conn = null; 
        try{
            conn = DBConnection.get();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(insertarEstado);        
            rs.close();
   
        }catch (SQLException ex) {
            
            Logger.getLogger(participanteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            //no olvidar nunca cerrar todo!!!
            if(conn!=null)try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(participanteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }       
    }
    
    public static void persistirFormaPuntuacion(FormaPuntuacion unaFormaPuntuacion){
        
        /* int unIdFormaPuntuacion = unaFormaPuntuacion.getId(); */
        String unNombreFormaPuntuacion = unaFormaPuntuacion.getNombre();
        
        
        String insertarPuntuacion="INSERT INTO forma_puntuacion" + "VALUES (" + unNombreFormaPuntuacion + ")";
        
        Connection conn = null; 
        try{
            conn = DBConnection.get();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(insertarPuntuacion);        
            rs.close();
   
        }catch (SQLException ex) {
            
            Logger.getLogger(participanteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            //no olvidar nunca cerrar todo!!!
            if(conn!=null)try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(participanteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      
    }
    
    public static void persistirModalidad(Modalidad unaModalidad){
        
        /* int unIdModalidad = unaModalidad.getId(); */
        String unNombreModalidad = unaModalidad.getNombre();
        
        
        String insertarModalidad="INSERT INTO modalidad" + "VALUES (" + unNombreModalidad + ")";
        
        Connection conn = null; 
        try{
            conn = DBConnection.get();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(insertarModalidad);        
            rs.close();
   
        }catch (SQLException ex) {
            
            Logger.getLogger(participanteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            //no olvidar nunca cerrar todo!!!
            if(conn!=null)try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(participanteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      
    }
    
    public static void persistirDeporte(Deporte unDeporte){
        
        /* int unIdDeporte = unDeporte.getId(); */
        String unNombreDeporte = unDeporte.getNombre();
        
        
        String insertarDeporte="INSERT INTO deporte" + "VALUES (" + unNombreDeporte + ")";
        
        Connection conn = null; 
        try{
            conn = DBConnection.get();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(insertarDeporte);        
            rs.close();
   
        }catch (SQLException ex) {
            
            Logger.getLogger(participanteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            //no olvidar nunca cerrar todo!!!
            if(conn!=null)try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(participanteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
     public static void persistirDisponibilidad(Disponibilidad unaDisponibilidad){
        
        /* int unIdDisponibilidad = unaDisponibilidad.getId(); */
        int cantidad = unaDisponibilidad.getCantidad();
        LugarRealizacion lugar=unaDisponibilidad.getLg();
   
        String insertarDisponibilidad="INSERT INTO disponibilidad" + "VALUES (null, " + cantidad + ", " + lugar.getId() + ")";
        
        Connection conn = null; 
        try{
            conn = DBConnection.get();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(insertarDisponibilidad);        
            rs.close();
   
        }catch (SQLException ex) {
            
            Logger.getLogger(participanteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            //no olvidar nunca cerrar todo!!!
            if(conn!=null)try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(participanteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
   
    }
    
    public static void persistirCD(Competencia unaCompetencia){
        
     Estado estado = unaCompetencia.getEstado();
     FormaPuntuacion formaPuntuacion = unaCompetencia.getFormaPuntuacion();
     Modalidad modalidad = unaCompetencia.getModalidad();
     Deporte deporte = unaCompetencia.getDeporte();
     Usuario usuario = unaCompetencia.getUsuario();
     Fixture fixture = unaCompetencia.getFixture();
     /*
     ArrayList<Participante> listaParticipantes;
     ArrayList<Disponibilidad> disponibilidad;
     ArrayList<TablaPosicionesParticipante> tablaPosicionesParticipante;*/
        
        
        /* int unIdCompetencia = unaCompetencia.getId(); */
        String unNombreCompetencia = unaCompetencia.getNombre();
        String unReglamento=unaCompetencia.getReglamento();
        int unaCantidadMaximaDeSets=unaCompetencia.getCantidadMaximaDeSets();
        int unTantosPorAusenciaDeRival=unaCompetencia.getTantosPorAusenciaDeRival();
        int unPuntosPorPresentacion=unaCompetencia.getPuntosPorPresentacion();
        int unPuntosPorVictoria=unaCompetencia.getPuntosPorVictoria();
        boolean unEmpatePermitido=unaCompetencia.getEmpatePermitido();
        int unPuntosPorPermitido=unaCompetencia.getPuntosPorPermitido();
        
        String insertarCD="INSERT INTO "+ "competencia VALUES (" + 
                "," + estado.getID() + "," + formaPuntuacion.getId() +
                "," + modalidad.getId() + ","+ deporte.getId() + "," + usuario.getId() +
                "," + fixture.getId() + "," + unNombreCompetencia + "," + unReglamento + 
                "," + unaCantidadMaximaDeSets + "," + unTantosPorAusenciaDeRival + 
                "," + unPuntosPorPresentacion + "," + unPuntosPorVictoria + 
                "," + unEmpatePermitido + "," + unPuntosPorPermitido + ")";

        Connection conn = null; 
        try{
            conn = DBConnection.get();
            Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery(insertarCD);        
            
            rs.close();
   
        }catch (SQLException ex) {
            
            Logger.getLogger(participanteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            //no olvidar nunca cerrar todo!!!
            if(conn!=null)try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(participanteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      
    }
    
    public static void asociarDisponibilidad(Disponibilidad unaDisponibilidad, Competencia unaCompetencia){
        
        Connection conn = null; 
        
        String nombreCD = unaCompetencia.getNombre();
        String nombreLugarDeDisponibilidad = (unaDisponibilidad.getLg()).getNombre();
        String nombreCDispo = "SELECT id_competencia FROM competencia WHERE nombre = "+ nombreCD;         
        try{
            conn = DBConnection.get();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(nombreCDispo);
            int IDCD = rs.getInt("id_competencia");
            
            String buscarIDLR = "SELECT id_lugar FROM lugar WHERE nombre = " + nombreLugarDeDisponibilidad;
            rs = statement.executeQuery(buscarIDLR);
            int IDLR = rs.getInt("id_lugar");
            
            String buscarDisponibilidadDeLugar = "SELECT id_disponibilidad FROM disponibilidad WHERE id_lugar = " + IDLR;
            rs = statement.executeQuery(buscarDisponibilidadDeLugar);
            int IDDisponibilidad = rs.getInt("id_disponibilidad");
            
            String asociarDisponibilidad = "UPDATE disponibilidad SET id_competencia = " + IDCD + " WHERE id_disponibilidad = " + IDDisponibilidad;
            rs.close();
            
        }catch (SQLException ex) {
            
            Logger.getLogger(participanteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            //no olvidar nunca cerrar todo!!!
            if(conn!=null)try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(participanteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
  
        
    }
    
    public String estadoC(String e){
    
        return "SELECT id_estado FROM" + "estado" + "WHERE" + "nombre ="+ e ; 
    }
    
     public String formaPuntuacionC(String fp){
    
        return "SELECT id_forma_puntuacion FROM" + "forma_puntuacion" + "WHERE" + "nombre ="+ fp ; 
    }
    
    public String modalidadC(String m){
    
        return "SELECT id_modalidad FROM" + "deporte" + "WHERE" + "nombre ="+ m ; 
    }
        
    public String disponibilidadC(String dis){
    
        return "SELECT id_diponibilidad FROM" + "deporte" + "WHERE" + "nombre ="+ dis ; 
    }
    
     public String usuarioC(String u){
    
        return "SELECT id_usuario FROM" + "usuario" + "WHERE" + "nombre ="+ u ; 
    }
    
     public String deporteC(String d) {

     return "SELECT id_deporte FROM" + "deporte" + "WHERE" + "nombre ="+ d ;   
    }
    
     public String fixtureC(String f ) {

     return "SELECT id_fixture FROM" + "fixture" + "WHERE" + "nombre ="+ f ;   
    }
     
    public void insertarCompetencia(){
    
    
    
    }
     
    public static LugarRealizacion buscarLRPorNombre(String nombreLR){
     Connection conn = null;
     String _SQL_FIND_LUGAR_NOMBRE="SELECT* FROM" + " lugar" + "WHERE nombre = " + nombreLR;
     
      try{
            conn = DBConnection.get();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(_SQL_FIND_LUGAR_NOMBRE);
            // Se que tengo 1 solo Lugar por nombre
            int unIDLugar = rs.getInt("id_lugar");
            String unNombreLugar = rs.getString("lugar_realizacion");
            String unaDescripcion = rs.getString("descripcion");
            
            String _SQL_FIND_DEPORTES_LUGAR = "SELECT id_deporte FROM lugar_realiza_deporte WHERE id_lugar = " + unIDLugar;
            rs = statement.executeQuery(_SQL_FIND_DEPORTES_LUGAR);
            ArrayList<Integer> listaIDDeporte = new ArrayList();
            while (rs.next()) {
                listaIDDeporte.add(rs.getInt("id_deporte")); }
            
            ArrayList<Deporte> listaDeportes = new ArrayList(); 
            for (int i=0; i<listaIDDeporte.size(); i++) {
                String _SQL_FIND_DEPORTE_ID = "SELECT nombre FROM deporte WHERE id_lugar = " + (listaIDDeporte.get(i)).toString();
                rs = statement.executeQuery(_SQL_FIND_DEPORTE_ID);
                // Se que tengo 1 solo Deporte por ID
                String unNombreDeporte = rs.getString("nombre");
                Deporte unDeporte = new Deporte(listaIDDeporte.get(i), unNombreDeporte);
                listaDeportes.add(unDeporte); }
            LugarRealizacion unLR = new LugarRealizacion(unIDLugar, unNombreLugar, unaDescripcion, listaDeportes);
            rs.close();
            return unLR;
   
        }catch (SQLException ex) {
            
            Logger.getLogger(participanteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            //no olvidar nunca cerrar todo!!!
            if(conn!=null)try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(participanteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    
     public void consultaD(){
         
        Connection conn = null; 
         
        try{
            conn = DBConnection.get();
            Statement statement = conn.createStatement();
            //PreparedStatement: Ejecuta sentencias SQL con parámetros de entrada.
            //PreparedStatement ps = conn.prepareStatement(_SQL_FIND_ALL_DEPORTE); 
            
            System.out.println(_SQL_FIND_ALL_DEPORTE);
            
            ResultSet rs = statement.executeQuery(_SQL_FIND_ALL_DEPORTE);
            
            while (rs.next()) {

				String id = rs.getString("id_deporte");
				String nombre = rs.getString("nombre");

				System.out.println("id : " + id);
				System.out.println("name : " + nombre);

			}

            //ps.setInt(1,d.getId());
            
            /*ps.setInt(2,c.getEstado());
            ps.setInt(4,c.getModalidad());
            ps.setInt(5,c.getDeporte());*/
           // ps.setString(10, c.getNombre());
            
            
            rs.close();
            
            
        
        
        
            
        }catch (SQLException ex) {
            
            Logger.getLogger(participanteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            //no olvidar nunca cerrar todo!!!
            if(conn!=null)try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(participanteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
    
    public void crear(Competencia c) {
        Connection conn = null;
        try {
            conn = DBConnection.get();
            
            //PreparedStatement: Ejecuta sentencias SQL con parámetros de entrada.
            PreparedStatement ps = conn.prepareStatement(_SQL_INSERT_COMPETENCIA); 
            ps.setInt(1, c.getId());
           /* ps.setInt(2,c.getEstado());
            ps.setInt(3,c.getFormaPuntuacion());
            ps.setInt(4,c.getModalidad());
            ps.setInt(5,c.getDeporte());
            ps.setInt(6,c.getDisponibilidad());
            ps.setInt(7,c.getUsuario());
            ps.setInt(8,c.getTablaPosicionesParticipante);
            ps.setInt(9,c.getFixture());*/
            ps.setString(10, c.getNombre());
            ps.setString(11, c.getReglamento());
            ps.setInt(12, c.getCantidadMaximaDeSets());
            ps.setString(13,c.getTantosPorAusenciaDeRival());
            ps.setInt(14,c.getPuntosPorPresentacion());
            ps.setInt(15,c.getPuntosPorVictoria());
            ps.setInt(16,c.getEmpatePermitido());
            ps.setString(17,c.getPuntosPorPermitido());
           
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(participanteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            //no olvidar nunca cerrar todo!!!
            if(conn!=null)try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(participanteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
    }
    
    
    
    
    
}
