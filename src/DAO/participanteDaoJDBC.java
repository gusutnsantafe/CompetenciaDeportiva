
package DAO;
 
import modelo.Participante;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class participanteDaoJDBC implements participanteDao {

    private boolean estructuraCreada; 
    private static final String _CREAR_TABLA = "create table PARTICIPANTE (" +
        "    id_participante bigint auto_increment, " +
        "    NOMBRE varchar(80)," +
        "    CORREO varchar(90)," +
        "    IMAGEN varchar(90)," +
        "    PRIMARY KEY (id_participante)" +
        ");";
    
    /* sentencias sql para reuso */
    
    private static final String _TABLE_NAME = "PARTICIPANTE"; 
    private static final String _SQL_INSERT_PARTICIPANTE = "INSERT INTO "+_TABLE_NAME+" (NOMBRE,CORREO) VALUES(?,?)";
    private static final String _SQL_FIND_ALL_PARTICIPANTE = "SELECT * FROM "+_TABLE_NAME;
    
    
    private static participanteDaoJDBC _INSTANCIA=null;
  
    private participanteDaoJDBC(){
        estructuraCreada=false;
    }
            
    public static participanteDaoJDBC get(){
        if(_INSTANCIA==null){
            _INSTANCIA = new participanteDaoJDBC();
            _INSTANCIA.crearEstructura();
        }
        return _INSTANCIA;
    }
    
     public void crearEstructura(){
        
         Connection conn = null;
        try {            
             conn = DBConnection.get();            
            DatabaseMetaData meta = conn.getMetaData();
            ResultSet res = meta.getTables(null, null, _TABLE_NAME,     new String[] {"TABLE"});
            while (res.next()) {
                estructuraCreada=true;
                System.out.println(
        "   "+res.getString("TABLE_CAT") 
       + ", "+res.getString("TABLE_SCHEM")
       + ", "+res.getString("TABLE_NAME")
       + ", "+res.getString("TABLE_TYPE")
       + ", "+res.getString("REMARKS")); 
        }
             if(!estructuraCreada){

              PreparedStatement ps = conn.prepareStatement(_CREAR_TABLA);
                ps.executeUpdate();
                       ps.close();

             }       
        } catch (SQLException ex) {
            Logger.getLogger(participanteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            //no olvidar nunca cerrar todo!!!
            if(conn!=null)try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(participanteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
            estructuraCreada=true;
        }
    }
    

     @Override
    public void crear(Participante p) {
        Connection conn = null;
        try {
            conn = DBConnection.get();
            PreparedStatement ps = conn.prepareStatement(_SQL_INSERT_PARTICIPANTE);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getCorreo());
            
            //no olvidar nunca cerrar todo!!!
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
    
    @Override
    public List<Participante> buscarTodos() {
        Connection conn = null;        
        List<Participante> resultado = new ArrayList<Participante>();
        try {
            conn = DBConnection.get();
            PreparedStatement ps = conn.prepareStatement(_SQL_FIND_ALL_PARTICIPANTE);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Participante tmp = new Participante();
                tmp.setId(rs.getInt("ID"));
                tmp.setNombre(rs.getString("NOMBRE"));
                tmp.setCorreo(rs.getString("CORREO"));
                // PENDIENTE a RESOLVER 
                // ¿Como retornar la lista de cursos a los que se anotó?????
                resultado.add(tmp);
            }
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
        return resultado;
    }
    
    

}