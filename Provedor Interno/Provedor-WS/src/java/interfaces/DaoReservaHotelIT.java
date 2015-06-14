package interfaces;

import beans.ReservaHotel;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Fatinha
 */

@Remote
public interface DaoReservaHotelIT {
    
    public boolean salvar(ReservaHotel reserva);
    
    public ReservaHotel buscarReservaCodigo(int codigo);
    
    public List<ReservaHotel> listarReservas();
    
    public List<ReservaHotel> reservasHospede(String login);
    
    public List<ReservaHotel> listarReservasPorData(Date dataReserva, String login);
    
}
