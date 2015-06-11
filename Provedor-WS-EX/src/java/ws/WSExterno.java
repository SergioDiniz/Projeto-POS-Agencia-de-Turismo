/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import beans.Hotel;
import beans.Quarto;
import beans.ReservaHotel;
import fachada.FachadaIT;
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
     * Operação de Listar todos os quartos de um hotel
     */
    @WebMethod(operationName = "todosQuatosPorHotel")
    public List<Quarto> todosQuatosPorHotel(@WebParam(name = "codigo") int codigo) {
        return fachada.todosQuatosPorHotel(codigo);
    }

    /**************************************************************************/

    
    
    
    
}
