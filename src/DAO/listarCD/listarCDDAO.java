
package DAO.listarCD;

import modelo.Competencia;
import java.util.List;

public interface listarCDDAO {
    
    public List<Competencia> buscarTodos(); 
    public void crearCompetencia(Competencia c);
    

   
    
}
