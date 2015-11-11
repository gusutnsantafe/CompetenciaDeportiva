
package DAO.darDeAltaCD;

import modelo.Competencia;
import java.util.List;
import modelo.Participante;

public interface darDeAltaService {
    
    public void nuevoCompetencia(Competencia c);
   public List<Competencia> listaCompetencia(); 
    
}
