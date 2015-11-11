
package DAO;

import modelo.Participante;
import java.util.List;


public interface participanteDao {
 
    public void crear(Participante p);

    
    public List<Participante> buscarTodos();
  
    
}
