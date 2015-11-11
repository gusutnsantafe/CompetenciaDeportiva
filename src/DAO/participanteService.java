
package DAO;

import modelo.Participante;
import java.util.List;


public interface participanteService {
    
   public void nuevoParticipante(Participante alu);
   public List<Participante> listaParticipante(); 
}
