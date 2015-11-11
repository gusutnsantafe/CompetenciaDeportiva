
package DAO;

import DAO.participanteDao;
import DAO.participanteDaoJDBC;
import DAO.participanteDaoJPA;
import modelo.Participante;
import java.util.List;


public class participanteServiceImpl implements participanteService{
    
    private participanteDao dao = participanteDaoJDBC.get();
    //private participanteDao dao = participanteDaoJPA();

    @Override
    public void nuevoParticipante(Participante alu) {
        dao.crear(alu);
    }
    
    @Override
    public List<Participante> listaParticipante() {
       return dao.buscarTodos();
    }
    
}
