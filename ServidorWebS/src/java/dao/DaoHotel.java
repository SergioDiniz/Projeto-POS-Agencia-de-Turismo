package dao;

import beans.Hotel;
import interfaces.InterfaceDaoHotel;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Diego Alves
 */
@Stateless
public class DaoHotel implements InterfaceDaoHotel{

    @PersistenceContext(unitName = "jdbc/ProjetoPOS")
    private EntityManager em;

    @Override
    public boolean salvar(Hotel hotel) {


            em.persist(hotel);
            return true;

    }

    @Override
    public Hotel buscarQuarto(int numero) {
        Hotel hospede;
        try {
            hospede = em.find(Hotel.class, numero);
            return hospede;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Hotel> buscarTodos(String cidade) {
        List<Hotel> hoteis;
        try {
            Query query = em.createQuery("select h from Hotel h  where h.enderecoHotel.cidade = :cidade");
            query.setParameter(cidade, "cidade");
            hoteis = query.getResultList();
            return hoteis;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Hotel> todosOsHoteis() {
        List<Hotel> hoteis;
        try {
            Query query = em.createQuery("select h from Hotel h");
            hoteis = query.getResultList();
            return hoteis;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
