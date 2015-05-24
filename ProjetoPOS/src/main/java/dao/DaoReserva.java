package dao;

import beans.Reserva;
import interfaces.InterfaceDaoReserva;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Diego Alves
 */
@Stateless
public class DaoReserva implements InterfaceDaoReserva{
    
    @PersistenceContext(unitName = "jdbc/ProjetoPOS")
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
