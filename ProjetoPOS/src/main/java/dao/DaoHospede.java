package dao;

import beans.Hospede;
import interfaces.InterfaceDaoHospede;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author SergioD
 */
@Stateless
public class DaoHospede implements InterfaceDaoHospede{

    @PersistenceContext(unitName = "jdbc/ProjetoPOS")
    private EntityManager em;

    @Override
    public boolean salvar(Hospede hospede) {

        try {
            em.persist(hospede);
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    @Override
    public Hospede buscarHospede(String email) {
        Hospede hospede;
        try {
            hospede = em.find(Hospede.class, email);
            return hospede;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean atualizar(Hospede hospede) {

        try {
            em.merge(hospede);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean remover(Hospede hospede) {

        try {
            em.remove(em.merge(hospede));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Hospede login(String email, String senha) {

        Query query = em.createQuery("SELECT h FROM Hospede h WHERE h.email = :email AND h.senha = :senha ");
        query.setParameter("email", email);
        query.setParameter("senha", senha);

        List<Hospede> h = query.getResultList();

        if (h.size() > 0) {
            return h.get(0);
        }

        return null;

    }
}
