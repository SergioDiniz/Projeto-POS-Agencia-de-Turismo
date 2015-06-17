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

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "buscarTodosCidade")
    public List<Hotel> buscarTodosCidade(@WebParam(name = "cidade") String cidade) {
        return fachada.buscarTodosCidade(cidade);
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "quartosDisponiveis")
    public List<Quarto> quartosDisponiveis(@WebParam(name = "dataEntrada") Date dataEntrada, @WebParam(name = "dataSaida") Date dataSaida, @WebParam(name = "codHotel") int codHotel) {
        return fachada.quartosDisponiveis(dataEntrada, dataSaida, codHotel);
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "listarReservasPorData")
    public List<ReservaHotel> listarReservasPorData(@WebParam(name = "dataReserva") Date dataReserva, @WebParam(name = "login") String login) {
        return fachada.listarReservasPorData(dataReserva, login);
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "reservasHospede")
    public List<ReservaHotel> reservasHospede(@WebParam(name = "login") String login) {
        return fachada.reservasHospede(login);
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "buscarReservaCodigo")
    public ReservaHotel buscarReservaCodigo(@WebParam(name = "codigo") int codigo) {
        return fachada.buscarReservaCodigo(codigo);
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "salvarResevar")
    public boolean salvarResevar(@WebParam(name = "reserva") ReservaHotel reserva) {
        return fachada.salvarReserva(reserva);
    } 
    
}
