package fachada;

import beans.*;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Fatinha
 */

@Remote
public interface FachadaIT {
    
    // 
    //
    //
    //Serviços do Hospede
    public boolean salvarHospede(Hospede hospede);
    
    public Hospede login(String email, String senha);
    
    public Hospede buscarHospede(String email);
    
    public boolean atualizarHospede(Hospede hospede);

    public boolean removerHospede(Hospede hospede);
    
    // 
    //
    //
    //Serviços do Hotel
    
    public boolean cadastrarHotel(Hotel hotel);
    
    public List<Hotel> todosOsHoteis();
    
    public Hotel buscarHotel(int numero);

    public List<Hotel> buscarTodosCidade(String cidade);
    
    public boolean atualizarHotel(Hotel hotel);
    
    public boolean removerHotel(Hotel hotel);
    
    //
    //
    //
    // Serviços do Quarto
    public boolean salvarQuarto(Quarto quarto);
    
    public Quarto buscarQuarto(int numero);
    
    public boolean atualizarQuarto(Quarto quarto);

    public boolean removerQuarto(Quarto quarto);
    
    public List<TipoQuato> tiposDeQuatosPorHotel(int codHotel);
    
    //
    //
    //
    //Servicoe do Administrador
    public Gerente buscarGerente(String email);
    
    public boolean atualizarGerente(Gerente gerente);
    
    //
    //
    //
    //Servicos da reserva
    public boolean salvarReservaHotel(ReservaHotel reservaHotel);
    
    public ReservaHotel buscarUmaReserva(int codigo);
    
    public List<ReservaHotel> listarReservasHotel();
    
    public List<ReservaHotel> listarReservasHospede(String login);
}
