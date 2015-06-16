package daos;

import beans.Reserva;
import interfaces.DaoReservaIT;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Fatinha
 */

@Stateless
public class ReservaDao implements DaoReservaIT{

    @PersistenceContext(unitName = "Provedor-WSPU")
    private EntityManager em;
    
    @Override
    public boolean salvar(Reserva reserva) {

        try {
            em.persist(reserva);
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }
}
