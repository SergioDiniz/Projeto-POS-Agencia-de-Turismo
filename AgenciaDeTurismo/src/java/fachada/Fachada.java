package fachada;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;
import ws.Gerente;
import ws.Hospede;
import ws.Hotel;
import ws.Quarto;
import ws.WSInternoJPA_Service;
import wse.passagem.ServicosDePassagensWS;
import wse.restaurante.WSReservaRestaurante_Service;

/**
 *
 * @author SergioD
 */
@Stateless
public class Fachada {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/ServicosDePassagensWS.wsdl")
    private ServicosDePassagensWS service_2;
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/10.10.0.95_8080/WSReservaRestaurante/WSReservaRestaurante.wsdl")
    private WSReservaRestaurante_Service service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WSInternoJPA/WSInternoJPA.wsdl")
    private WSInternoJPA_Service service;

    /*Servicos da Entidade Hospede*/
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

    /*Servicos da Entidade Hotel*/
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

    /*Servicos da Entidade Quarto*/
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

    public java.util.List<ws.Quarto> todosQuatosPorHotel(int codHotel) {
        ws.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.todosQuatosPorHotel(codHotel);
    }

    public java.util.List<ws.Quarto> quartosDisponiveis(javax.xml.datatype.XMLGregorianCalendar dataEntrada, javax.xml.datatype.XMLGregorianCalendar dataSaida, int codHotel) {
        ws.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.quartosDisponiveis(dataEntrada, dataSaida, codHotel);
    }

    public java.util.List<ws.Quarto> todosQuatosPorHotelAdmin(int codHotel) {
        ws.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.todosQuatosPorHotelAdmin(codHotel);
    }

    /*Servicos da Entidade Reserva*/
    public boolean salvarReservaHotel(ws.ReservaHotel reservaHotel) {
        ws.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.salvarReservaHotel(reservaHotel);
    }

    /*Servicos da Entidade Administrador*/
    public Gerente buscarGerente(java.lang.String login) {
        ws.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.buscarGerente(login);
    }

    public java.util.List<ws.TipoQuato> tiposDeQuatosPorHotel(int codHotel) {
        ws.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.tiposDeQuatosPorHotel(codHotel);
    }

    public java.util.List<ws.ReservaHotel> reservasDoHospede(java.lang.String login) {
        ws.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.reservasDoHospede(login);
    }

    
    
    //
    //
    //
    //
    // Restaurante

    public java.util.List<wse.restaurante.Restaurante> buscarRestaurantesPorCidade(java.lang.String cidade) {
        wse.restaurante.WSReservaRestaurante port = service_1.getWSReservaRestaurantePort();
        return port.buscarRestaurantesPorCidade(cidade);
    }

    public boolean criarReserva(wse.restaurante.ReservaRestaurante reserva) {
        wse.restaurante.WSReservaRestaurante port = service_1.getWSReservaRestaurantePort();
        return port.criarReserva(reserva);
    }

    public java.util.List<wse.restaurante.ReservaRestaurante> listarReservas() {
        wse.restaurante.WSReservaRestaurante port = service_1.getWSReservaRestaurantePort();
        return port.listarReservas();
    }

    public java.util.List<wse.restaurante.ReservaRestaurante> pesquisarReserva(javax.xml.datatype.XMLGregorianCalendar data) {
        wse.restaurante.WSReservaRestaurante port = service_1.getWSReservaRestaurantePort();
        return port.pesquisarReserva(data);
    }
    
    //
    //
    //
    //
    //
    // Passagens

    public java.util.List<wse.passagem.Voo> bucarVoos(java.lang.String cidadeOrigem, java.lang.String cidadeDestino, javax.xml.datatype.XMLGregorianCalendar data) {
        wse.passagem.WSServices port = service_2.getWSServicesPort();
        return port.bucarVoos(cidadeOrigem, cidadeDestino, data);
    }

    public Boolean cancelarPassagem(java.lang.Long idPassagem) {
        wse.passagem.WSServices port = service_2.getWSServicesPort();
        return port.cancelarPassagem(idPassagem);
    }

    public Boolean comprarPassagemIda(java.lang.String loginUsuario, wse.passagem.Voo voo, java.lang.String nomePassageiro, java.lang.String sobreNomePassageiro) {
        wse.passagem.WSServices port = service_2.getWSServicesPort();
        return port.comprarPassagemIda(loginUsuario, voo, nomePassageiro, sobreNomePassageiro);
    }

    public Boolean comprarPassagemIdaVolta(java.lang.String loginUsuario, wse.passagem.Voo vooIda, wse.passagem.Voo vooIdaVolta, java.lang.String nomePassageiro, java.lang.String sobreNomePassageiro) {
        wse.passagem.WSServices port = service_2.getWSServicesPort();
        return port.comprarPassagemIdaVolta(loginUsuario, vooIda, vooIdaVolta, nomePassageiro, sobreNomePassageiro);
    }

    public java.util.List<wse.passagem.Passagem> listarPassagens(java.lang.String loginUsuario) {
        wse.passagem.WSServices port = service_2.getWSServicesPort();
        return port.listarPassagens(loginUsuario);
    }

    private java.util.List<wse.restaurante.Restaurante> buscarRestaurantesPorCidade_1(java.lang.String cidade) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        wse.restaurante.WSReservaRestaurante port = service_1.getWSReservaRestaurantePort();
        return port.buscarRestaurantesPorCidade(cidade);
    }
    
    
}
