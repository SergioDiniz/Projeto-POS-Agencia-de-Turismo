package fachada;

import beans.Hotel;
import beans.ReservaHotel;
import java.util.Date;
import java.util.List;

/**
 *
 * @author SergioD
 */
public interface FachadaIT {
    
    public boolean salvarReservaHotel(ReservaHotel reservaHotel);
    
    public List<Hotel> buscarTodosHoteisPorCidade(String cidade);
    
    public ReservaHotel buscarUmaReserva(int codigo);
    
    public List<ReservaHotel> todasAsReservas(String login);
    
    public List<ReservaHotel> reservasPorData(Date dataReserva, String login);
}
