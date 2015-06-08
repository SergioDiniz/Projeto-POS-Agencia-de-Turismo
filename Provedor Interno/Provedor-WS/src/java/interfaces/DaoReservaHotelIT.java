package interfaces;

import beans.ReservaHotel;
import javax.ejb.Remote;

/**
 *
 * @author Fatinha
 */

@Remote
public interface DaoReservaHotelIT {
    
    public boolean salvar(ReservaHotel reserva);
}
