
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;


public class conexionBD {
    
    private Connection conectar = null;
    
    
   
    /*Connection conectar=null;*/
    
    /*Statement st;*/
    public Connection conexion(){
      
      String url = "jdbc:postgresql://localhost:5432/postgres";
      String password = "1234";  
      
      try{
          Class.forName("org.postgresql.Driver");
          conectar=DriverManager.getConnection(url, "postgres", password);
          System.out.println("Se hizo la conexion exitosa");
      }catch(Exception e){
          System.out.print(e.getMessage());
      }
      return conectar;
    }
    
    }

