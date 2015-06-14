package daos;

import beans.ReservaHotel;
import interfaces.DaoReservaHotelIT;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Fatinha
 */
@Stateless
public class ReservaHotelDao implements DaoReservaHotelIT {

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

    @Override
    public ReservaHotel buscarReservaCodigo(int codigo){        
        try{
            return em.find(ReservaHotel.class, codigo);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<ReservaHotel> listarReservas(){
        Query query = em.createQuery("select r from ReservaHotel r");
        
        return (List<ReservaHotel>) query.getResultList();
    }

    @Override
    public List<ReservaHotel> reservasHospede(String login){
        Query query = em.createQuery("select r from ReservaHotel r where r.hospede.email = :email");
        query.setParameter("email", login);
        
        return (List<ReservaHotel>) query.getResultList();
    }
}
