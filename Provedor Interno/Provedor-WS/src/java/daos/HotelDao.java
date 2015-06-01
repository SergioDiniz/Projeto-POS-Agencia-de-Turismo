package daos;

import beans.Hotel;
import interfaces.DaoHotelIT;
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
public class HotelDao implements DaoHotelIT {

    @PersistenceContext(unitName = "Provedor-WSPU")
    private EntityManager em;

    @Override
    public boolean salvar(Hotel hotel) {

        try {
            em.persist(hotel);
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    @Override
    public Hotel buscarHotel(int numero) {
        Hotel hotel;
        try {
            hotel = em.find(Hotel.class, numero);
            hotel.getQuartos().size();
            return hotel;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Hotel> buscarTodosCidade(String cidade) {
        List<Hotel> hoteis;
        try {
            Query query = em.createQuery("select h from Hotel h  where h.enderecoHotel.cidade = :cidade");
            query.setParameter(cidade, "cidade");
            hoteis = query.getResultList();
            hoteis.size();
            return hoteis;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Hotel> todosOsHoteis() {
        List<Hotel> hoteis;
        try {
            Query query = em.createQuery("select h from Hotel h");
            hoteis = query.getResultList();
            
            for(Hotel h: hoteis){
                h.getQuartos().size();
            }
            
            return hoteis;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean atualizarHotel(Hotel hotel) {

        try {
            em.merge(hotel);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    @Override
    public boolean removerHotel(Hotel hotel){
        
        try{
            em.remove(em.merge(hotel));
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
