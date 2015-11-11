
package DAO.darDeAltaCD;

import java.util.List;
import modelo.Competencia;
import modelo.Participante;
import modelo.Deporte;
import modelo.Usuario; 


public interface darDeAltaCDDAO {
  
      
    public void validar();
    public void existeCompetencia(Competencia c);
    public void agregarCompetencia(Competencia c);
    public void crear(Competencia c);
    public void get(Competencia c);
    public void add(Competencia c);
    public void setDeporte(Deporte d);
    public void save(Competencia c);
    public void save(Usuario u);
    
    public List<Participante> buscarTodos();
       
}