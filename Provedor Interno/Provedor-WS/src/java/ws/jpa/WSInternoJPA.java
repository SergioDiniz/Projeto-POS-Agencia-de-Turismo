package ws.jpa;

import beans.*;
import fachada.FachadaIT;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Fatinha
 */
@WebService(serviceName = "WSInternoJPA")
@Stateless()
public class WSInternoJPA {

    @EJB
    private FachadaIT fachada;
    
    /******************************Entidade Hospede****************************/
    /**
     * Operação de salvar Hospede
     */
    @WebMethod(operationName = "salvarHospede")
    public boolean salvarHospede(@WebParam(name = "hospede") Hospede hospede) {
        return fachada.salvarHospede(hospede);
    }

    /**
     * Operação de Login da entidade Hospede
     */
    @WebMethod(operationName = "loginHospede")
    public Hospede loginHospede(@WebParam(name = "login") String login, @WebParam(name = "senha") String senha) {
        
        return fachada.login(login, senha);
    }
    
        /**
     * Operação de buscar um hospede pelo login
     */
    @WebMethod(operationName = "buscarHospedeLogin")
    public Hospede buscarHospedeLogin(@WebParam(name = "email") String email) {
        return fachada.buscarHospede(email);
    }

    /**
     * Operação de atualizar Hospede
     */
    @WebMethod(operationName = "atualizarHospede")
    public boolean atualizarHospede(@WebParam(name = "hospede") Hospede hospede) {
        return fachada.atualizarHospede(hospede);
    }

    /**
     * Operação de remover um hospede
     */
    @WebMethod(operationName = "removerHospede")
    public boolean removerHospede(@WebParam(name = "hospede") Hospede hospede) {
        return fachada.removerHospede(hospede);
    }
    
    /**
     * Operação de buscar um Hospede
     */
    @WebMethod(operationName = "buscarHospede")
    public Hospede buscarHospede(@WebParam(name = "email") String email) {
        return fachada.buscarHospede(email);
    }
    
    /**************************************************************************/
    
    /*******************************Entidade Hotel*****************************/
    
    /**
     * Operação de salvar Hotel
     */
    @WebMethod(operationName = "salvarHotel")
    public boolean salvarHotel(@WebParam(name = "hotel") Hotel hotel) {
        return fachada.cadastrarHotel(hotel);
    }

    /**
     * Operação de Listar Hoteis
     */
    @WebMethod(operationName = "listarHoteis")
    public List<Hotel> listarHoteis() {
        return fachada.todosOsHoteis();
    }
    
    /**
     * Operação de buscar um hotel pelo numero
     */
    @WebMethod(operationName = "buscarHotel")
    public Hotel buscarHotel(@WebParam(name = "numero") int numero) {
        return fachada.buscarHotel(numero);
    }

    /**
     * Operação de listar todos os hoteis de uma cidade
     */
    @WebMethod(operationName = "buscarHoteisCidade")
    public List<Hotel> buscarHoteisCidade(@WebParam(name = "cidade") String cidade) {
        return fachada.buscarTodosCidade(cidade);
    }

    /**
     * Operação de atualizar um hotel
     */
    @WebMethod(operationName = "atualizarHotel")
    public boolean atualizarHotel(@WebParam(name = "hotel") Hotel hotel) {
        return fachada.atualizarHotel(hotel);
    }

    /**
     * Operação de remover um hotel
     */
    @WebMethod(operationName = "removerHotel")
    public boolean removerHotel(@WebParam(name = "hotel") Hotel hotel) {
        return fachada.removerHotel(hotel);
    }
    
    /**************************************************************************/
    
    /*****************************Entidade Quarto******************************/

    /**
     * Operação de salvar Quarto
     */
    @WebMethod(operationName = "salvarQuarto")
    public boolean salvarQuarto(@WebParam(name = "quarto") Quarto quarto) {
        return fachada.salvarQuarto(quarto);
    }

    /**
     * Operação de buscar um quarto
     */
    @WebMethod(operationName = "buscarQuarto")
    public Quarto buscarQuarto(@WebParam(name = "numero") int numero) {
        return fachada.buscarQuarto(numero);
    }

    /**
     * Operação de atualizar um quarto
     */
    @WebMethod(operationName = "atualizarQuarto")
    public boolean atualizarQuarto(@WebParam(name = "quarto") Quarto quarto) {
        return fachada.atualizarQuarto(quarto);
    }

    /**
     * Operação de remover um quarto
     */
    @WebMethod(operationName = "removerQuarto")
    public boolean removerQuarto(@WebParam(name = "quarto") Quarto quarto) {
        return fachada.removerQuarto(quarto);
    }
    
    /**************************************************************************/
    
    /****************************Entidade Gerente******************************/
    /**
     * Operação de atualizar um gerente
     */
    @WebMethod(operationName = "atualizarGerente")
    public boolean atualizarGerente(@WebParam(name = "gerente") Gerente gerente) {
        return fachada.atualizarGerente(gerente);
    } 

    /**
     * Operação de buscar login da entidade gerente
     */
    @WebMethod(operationName = "buscarGerente")
    public Gerente buscarGerente(@WebParam(name = "login") String login) {
        return fachada.buscarGerente(login);
    }
    
    /**************************************************************************/

    /***************************Entidade ReservaHotel**************************/
    /**
     * Operação de reservar hotel
     */
    @WebMethod(operationName = "salvarReservaHotel")
    public boolean salvarReservaHotel(@WebParam(name = "reservaHotel") ReservaHotel reservaHotel) {
        return fachada.salvarReservaHotel(reservaHotel);
    }

    /**
     * Operação que buscar uma reserva pelo codigo
     */
    @WebMethod(operationName = "buscarReservaPeloCodigo")
    public ReservaHotel buscarReservaPeloCodigo(@WebParam(name = "codigo") int codigo) {
        return fachada.buscarUmaReserva(codigo);
    }

    /**
     * Operação que busca todas as reservas do hotel
     */
    @WebMethod(operationName = "listarTodasAsReservas")
    public List<ReservaHotel> listarTodasAsReservas() {
        return fachada.listarReservasHotel();
    }

    /**
     * Operação que lista todas as reservas de um hospede
     */
    @WebMethod(operationName = "ReservasDoHospede")
    public List<ReservaHotel> ReservasDoHospede(@WebParam(name = "login") String login) {
        return fachada.listarReservasHospede(login);
    }

    /**************************************************************************/
}
