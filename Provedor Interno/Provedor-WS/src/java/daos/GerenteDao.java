package daos;

import beans.Gerente;
import interfaces.DaoGerenteIT;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Fatinha
 */

@Stateless
public class GerenteDao implements DaoGerenteIT{
    
    @PersistenceContext(unitName = "Provedor-WSPU")
    private EntityManager em;
    
    public Gerente buscar(String email, String senha) {
        Gerente gerente;
        try {
            Query query = em.createQuery("select g from Gerente g  where g.email = :email and g.senha = :senha");
            query.setParameter(email, "email");
            query.setParameter(senha, "senha");
            gerente = (Gerente) query.getSingleResult();
            return gerente;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean atualizar(Gerente gerente){
        
        try {
            em.merge(gerente);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }       
    }
}
