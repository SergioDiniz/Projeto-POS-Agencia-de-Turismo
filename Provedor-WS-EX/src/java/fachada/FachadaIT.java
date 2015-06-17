package fachada;

import beans.Hotel;
import beans.Quarto;
import beans.ReservaHotel;
import java.util.Date;
import java.util.List;

/**
 *
 * @author SergioD
 */
public interface FachadaIT {
    
    // Metodos do Hotel
    public List<Hotel> buscarTodosCidade(String cidade);
    
    // Metodos do Quarto   
    public List<Quarto> quartosDisponiveis(Date dataEntrada, Date dataSaida, int codHotel);
    
    // Metodos da Reserva
    public List<ReservaHotel> listarReservasPorData(Date dataReserva, String login);
    
    public List<ReservaHotel> reservasHospede(String login);
    
    public ReservaHotel buscarReservaCodigo(int codigo);
    
    public boolean salvarReserva(ReservaHotel reserva);
   
}
