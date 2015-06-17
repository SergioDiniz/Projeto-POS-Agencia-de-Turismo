package dao;

import beans.Hotel;
import beans.Quarto;
import beans.ReservaHotel;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author SergioD
 */
@Remote
public interface DaoIT {

    // Metodos do Hotel
    public List<Hotel> buscarTodosCidade(String cidade);
    
    // Metodos do Quarto   
    public List<Quarto> quartosDisponiveis(Date dataEntrada, Date dataSaida, int codHotel);
    
    // Metodos da Reserva
    public List<ReservaHotel> listarReservasPorData(Date dataReserva, String login);
    
    public List<ReservaHotel> reservasHospede(String login);
    
    public ReservaHotel buscarReservaCodigo(int codigo);
    
    public boolean salvarResevar(ReservaHotel reserva);

}
