package daos;

import beans.Hotel;
import beans.Quarto;
import interfaces.DaoQuartoIT;
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
public class QuartoDao implements DaoQuartoIT {

    @PersistenceContext(unitName = "Provedor-WSPU")
    private EntityManager em;

    @Override
    public boolean salvar(Quarto quarto) {

        try {
            em.persist(quarto);
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    @Override
    public Quarto buscarQuarto(int numero) {
        Quarto quarto = new Quarto();
        try {
            quarto = em.find(Quarto.class, numero);
            return quarto;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean atualizar(Quarto quarto) {

        try {
            em.merge(quarto);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean removerQuarto(Quarto quarto) {

        try {
            em.remove(em.merge(quarto));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Quarto> todosQuatosPorHotel(int codHotel) {
        List<Quarto> quartos;
        try {
            Query query = em.createQuery("select q from Hotel h JOIN h.quartos q where h.codigo = :codigo and q.disponivel = true");
            query.setParameter("codigo", codHotel);
            quartos = (List<Quarto>) query.getResultList();

            return quartos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
