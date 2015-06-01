
package fachada;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;
import ws.Hospede;
import ws.Hotel;
import ws.Quarto;
import ws.WSInternoJPA_Service;


/**
 *
 * @author SergioD
 */
@Stateless
public class Fachada {
   
    
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WSInternoJPA/WSInternoJPA.wsdl")
    private WSInternoJPA_Service service;

    /*Operações Entidade Hospede*/
    public boolean salvarHospede(ws.Hospede hospede) {
        ws.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.salvarHospede(hospede);
    }

    public Hospede loginHospede(java.lang.String login, java.lang.String senha) {
        ws.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.loginHospede(login, senha);
    }

    public boolean atualizarHospede(ws.Hospede hospede) {
        ws.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.atualizarHospede(hospede);
    }

    public boolean removerHospede(ws.Hospede hospede) {
        ws.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.removerHospede(hospede);
    }
    
    /*Operações Entidade Hotel*/

    public boolean salvarHotel(ws.Hotel hotel) {
        ws.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.salvarHotel(hotel);
    }

    public java.util.List<ws.Hotel> listarHoteis() {
        ws.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.listarHoteis();
    }

    public boolean atualizarHotel(ws.Hotel hotel) {
        ws.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.atualizarHotel(hotel);
    }

    public java.util.List<ws.Hotel> buscarHoteisCidade(java.lang.String cidade) {
        ws.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.buscarHoteisCidade(cidade);
    }

    public Hotel buscarHotel(int numero) {
        ws.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.buscarHotel(numero);
    }

    public boolean removerHotel(ws.Hotel hotel) {
        ws.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.removerHotel(hotel);
    }
    
    /*Operações Entidade Quarto*/

    public boolean salvarQuarto(ws.Quarto quarto) {
        ws.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.salvarQuarto(quarto);
    }

    public boolean atualizarQuarto(ws.Quarto quarto) {
        ws.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.atualizarQuarto(quarto);
    }

    public Quarto buscarQuarto(int numero) {
        ws.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.buscarQuarto(numero);
    }

    public boolean removerQuarto(ws.Quarto quarto) {
        ws.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.removerQuarto(quarto);
    }
}
