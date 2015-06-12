package dao;

import beans.Hotel;
import beans.Quarto;
import beans.ReservaHotel;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author SergioD
 */
@Remote
public interface DaoIT {
    
    public boolean salvarReserva(ReservaHotel reserva);
    
    public List<Hotel> buscarTodosHoteisPorCidade(String cidade);
    
    public List<Quarto> todosQuatosPorHotel(int codHotel);
    
    public boolean atualizarQuarto(Quarto quarto);
    
    public ReservaHotel buscarReservaHotel(int codigoReserva);
    
    public List<ReservaHotel> listarReservasHotel(String login);
}
