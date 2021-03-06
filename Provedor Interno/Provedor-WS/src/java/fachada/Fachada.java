package fachada;

import beans.*;
import datas.XMLCalendarParaDate;
import interfaces.*;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Fatinha
 */
@Stateless
public class Fachada implements FachadaIT {

    @EJB
    private DaoHospedeIT daoHospedeIT;

    @EJB
    private DaoHotelIT daoHotelIT;

    @EJB
    private DaoQuartoIT daoQuartoIT;

    @EJB
    private DaoGerenteIT daoGerenteIT;

    @EJB
    private DaoReservaHotelIT daoReservaIT;

    public Fachada() {

    }

    //
    //
    //
    // Serviços do Hote
    @Override
    public boolean salvarHospede(Hospede hospede) {
        return daoHospedeIT.salvar(hospede);
    }

    @Override
    public Hospede login(String email, String senha) {
        return daoHospedeIT.login(email, senha);
    }

    @Override
    public Hospede buscarHospede(String email) {
        return daoHospedeIT.buscarHospede(email);
    }

    @Override
    public boolean atualizarHospede(Hospede hospede) {
        return daoHospedeIT.atualizar(hospede);
    }

    @Override
    public boolean removerHospede(Hospede hospede) {
        return daoHospedeIT.remover(hospede);
    }

    //
    //
    //
    // Serviços do Hotel
    @Override
    public boolean cadastrarHotel(Hotel hotel) {
        return daoHotelIT.salvar(hotel);
    }

    @Override
    public List<Hotel> todosOsHoteis() {
        return daoHotelIT.todosOsHoteis();
    }

    @Override
    public Hotel buscarHotel(int numero) {
        return daoHotelIT.buscarHotel(numero);
    }

    @Override
    public List<Hotel> buscarTodosCidade(String cidade) {
        return daoHotelIT.buscarTodosCidade(cidade);
    }

    @Override
    public boolean atualizarHotel(Hotel hotel) {
        return daoHotelIT.atualizarHotel(hotel);
    }

    @Override
    public boolean removerHotel(Hotel hotel) {
        return daoHotelIT.removerHotel(hotel);
    }

    //
    //
    //
    // Serviços do Quarto
    @Override
    public boolean salvarQuarto(Quarto quarto) {
        return daoQuartoIT.salvar(quarto);
    }

    @Override
    public Quarto buscarQuarto(int numero) {
        return daoQuartoIT.buscarQuarto(numero);
    }

    @Override
    public boolean atualizarQuarto(Quarto quarto) {
        return daoQuartoIT.atualizar(quarto);
    }

    @Override
    public boolean removerQuarto(Quarto quarto) {
        return daoQuartoIT.removerQuarto(quarto);
    }

    
    @Override
    public List<TipoQuato> tiposDeQuatosPorHotel(int codHotel){
        return daoQuartoIT.tiposDeQuatosPorHotel(codHotel);
    }
    
    @Override
    public List<Quarto> todosQuatosPorHotel(int codHotel) {
        return daoQuartoIT.todosQuatosPorHotel(codHotel);
    }


    @Override
    public List<Quarto> quartosIndisponiveisNaReserva(Date dataEntrada, Date dataSaida, int codHotel) {
        return daoQuartoIT.quartosDisponiveis(dataEntrada, dataSaida, codHotel);
    }
    
    @Override
    public List<Quarto> todosQuatosPorHotelAdmin(int codHotel){
        return daoQuartoIT.todosQuatosPorHotelAdmin(codHotel);
    }
    

    //
    //
    //
    //Servicos do Administrador
    @Override
    public Gerente buscarGerente(String email) {
        return daoGerenteIT.buscar(email);
    }

    @Override
    public boolean atualizarGerente(Gerente gerente) {
        return daoGerenteIT.atualizar(gerente);
    }

    //
    //
    //
    //Servicos da Reserva de um quarto
    @Override
    public boolean salvarReservaHotel(ReservaHotel reservaHotel) {
        return daoReservaIT.salvar(reservaHotel);
    }

    @Override
    public ReservaHotel buscarUmaReserva(int codigo){
        return daoReservaIT.buscarReservaCodigo(codigo);
    }

    @Override
    public List<ReservaHotel> listarReservasHotel(){
        return daoReservaIT.listarReservas();
    }

    @Override
    public List<ReservaHotel> listarReservasHospede(String login){
        return daoReservaIT.reservasHospede(login);
    }
    
    @Override
    public List<ReservaHotel> listarReservasPorData(Date dataReserva, String login){
        return daoReservaIT.listarReservasPorData(dataReserva, login);
    }



}
