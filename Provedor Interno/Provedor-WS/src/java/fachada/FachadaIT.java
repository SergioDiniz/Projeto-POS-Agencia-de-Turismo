package fachada;

import beans.Hospede;
import javax.ejb.Remote;

/**
 *
 * @author Fatinha
 */

@Remote
public interface FachadaIT {
    
    public boolean salvarHospede(Hospede hospede);
}
