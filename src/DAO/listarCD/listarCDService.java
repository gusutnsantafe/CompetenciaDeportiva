
package DAO.listarCD;

import modelo.Competencia;
import java.util.List;
import modelo.Participante;

public interface listarCDService {
    
    public void nuevoCompetencias(Competencia c);
    public void getCompetenicas(Competencia c);/* retorna una listaCompetencia va alojar instancias de competencia*/ 
    public void setNombre(Competencia nombre);
    public void setEstado(Competencia estado);
    public void setModalidad(Competencia modalidad);
    public void setDeporte(Competencia deporte);
    public void add();
    public List<Competencia> listaCompetencias();
   
    
}
