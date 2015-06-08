package daos;

import beans.Gerente;
import interfaces.DaoGerenteIT;
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
public class GerenteDao implements DaoGerenteIT {

    @PersistenceContext(unitName = "Provedor-WSPU")
    private EntityManager em;

    @Override
    public Gerente buscar(String email) {
        try {
            return em.find(Gerente.class, email);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean atualizar(Gerente gerente
    ) {

        try {
            em.merge(gerente);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
