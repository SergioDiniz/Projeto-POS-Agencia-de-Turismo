package interfaces;

import beans.Reserva;
import javax.ejb.Remote;

/**
 *
 * @author Fatinha
 */

@Remote
public interface DaoReservaIT {
    
    public boolean salvar(Reserva reserva);
}
