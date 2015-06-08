package interfaces;

import beans.Gerente;
import javax.ejb.Remote;

/**
 *
 * @author Fatinha
 */

@Remote
public interface DaoGerenteIT {
 
    public Gerente buscar(String email);
    
    public boolean atualizar(Gerente gerente);
}
