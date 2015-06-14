package ws;

import beans.Hotel;
import beans.Quarto;
import beans.ReservaHotel;
import fachada.FachadaIT;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author SergioD
 */
@WebService(serviceName = "WSExterno")
@Stateless()
public class WSExterno {

    @EJB
    private FachadaIT fachada;
    
    /***************************Entidade ReservaHotel**************************/
    /**
     * Operação de reservar hotel
     */
    @WebMethod(operationName = "salvarReservaHotel")
    public boolean salvarReservaHotel(@WebParam(name = "reservaHotel") ReservaHotel reservaHotel) {
        return fachada.salvarReservaHotel(reservaHotel);
    }

    /**
     * Operação de Listar todos os hoteis de uma cidade
     */
    @WebMethod(operationName = "listaHotelPorCidade")
    public List<Hotel> listaHotelPorCidade(@WebParam(name = "cidade") String cidade) {
        return fachada.buscarTodosHoteisPorCidade(cidade);
    }

    /**
     * Operação que busca uma reserva qualquer
     */
    @WebMethod(operationName = "buscarReserva")
    public ReservaHotel buscarReserva(@WebParam(name = "codigo") int codigo) {
        return fachada.buscarUmaReserva(codigo);
    }

    /**
     * Operação que busca todas as reservas de usuario 
     */
    @WebMethod(operationName = "listarReservasUsuario")
    public List<ReservaHotel> listarReservasUsuario(@WebParam(name = "login") String login) {
        return fachada.todasAsReservas(login);
    }

    /**************************************************************************/
}
