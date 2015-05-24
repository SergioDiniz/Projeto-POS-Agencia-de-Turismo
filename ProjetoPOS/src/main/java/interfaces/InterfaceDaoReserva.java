package interfaces;

import beans.Reserva;
import javax.ejb.Remote;

/**
 *
 * @author Fatinha
 */

@Remote
public interface InterfaceDaoReserva {
    
    public boolean salvar(Reserva reserva);
}
