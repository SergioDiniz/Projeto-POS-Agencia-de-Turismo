package fachada;

import beans.Hospede;
import javax.ejb.Remote;

/**
 *
 * @author Fatinha
 */

@Remote
public interface FachadaIT {
    
    public boolean salvarHospede(String email, String senha, String nome);
}
