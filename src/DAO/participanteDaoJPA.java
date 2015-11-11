
package DAO;

import modelo.MiEntityManager;
import modelo.Participante;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class participanteDaoJPA implements participanteDao{
   
    @Override
    public void crear(Participante p) {
        EntityManager em = MiEntityManager.get();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(p);
        tx.commit();
        em.close();
    }

    @Override
    public List<Participante> buscarTodos() {
        EntityManager em = MiEntityManager.get();
        List<Participante> result = em.createQuery("SELECT nombre FROM participante").getResultList();
        em.close();
        return result;
    }
     
}
