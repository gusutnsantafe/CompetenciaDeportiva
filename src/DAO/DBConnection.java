
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    
     //String url = "jdbc:h2:" + "db/h2test.db";
    private static final String url ="jdbc:postgresql://localhost:5432/postgres";
    //private static final String url ="jdbc:h2:mem:taller";
    //tcp://localhost/server~/dbname
    private static final String user="postgres";
    private static final String pass="1234";
    
    private DBConnection(){
        // no se pueden crear instancias de esta clase
    }
    
    public static Connection get(){
        Connection conn=null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    
    
    
}
