package daos;

import beans.ReservaHotel;
import interfaces.DaoReservaHotelIT;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Fatinha
 */

@Stateless
public class ReservaHotelDao implements DaoReservaHotelIT{

    @PersistenceContext(unitName = "Provedor-WSPU")
    private EntityManager em;
    
    @Override
    public boolean salvar(ReservaHotel reserva) {

        try {
            em.persist(reserva);
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }
}
