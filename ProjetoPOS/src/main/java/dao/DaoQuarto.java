package dao;

import beans.Quarto;
import interfaces.InterfaceDaoQuarto;
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
public class DaoQuarto implements InterfaceDaoQuarto{

    @PersistenceContext(unitName = "jdbc/ProjetoPOS")
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
        Quarto hospede;
        try {
            hospede = em.find(Quarto.class, numero);
            return hospede;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Quarto> buscarTodos() {
        List<Quarto> quartos;
        try {
            Query query = em.createQuery("select q from Quarto q  where q.disponivel = true");
            quartos = query.getResultList();
            return quartos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
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
    public boolean remover(Quarto quarto) {

        try {
            em.remove(em.merge(quarto));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
