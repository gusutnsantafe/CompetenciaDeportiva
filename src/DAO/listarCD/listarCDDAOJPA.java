
package DAO.listarCD;

import DAO.participanteDao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import modelo.MiEntityManager;
import modelo.Competencia;



public class listarCDDAOJPA implements listarCDDAO {

    @Override
    public List<Competencia> buscarTodos() {
       EntityManager em = MiEntityManager.get();
        List<Competencia> result = em.createQuery("SELECT nombre FROM competencias").getResultList();
        em.close();
        return result;
        
    }

    @Override
    public void crearCompetencia(Competencia c) {
       EntityManager em = MiEntityManager.get();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(c);
        tx.commit();
        em.close();
    }
    
}
