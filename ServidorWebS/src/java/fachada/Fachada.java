package fachada;

import beans.*;
import interfaces.*;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author SergioD
 */
@Stateless
public class Fachada implements InterfaceFachada{
    
    @EJB
    private InterfaceDaoHospede daoHospede;
    
    @EJB
    private InterfaceDaoHotel daoHotel;
    
    @EJB
    private InterfaceDaoQuarto daoQuarto;
    
    // Serviços do Hospede
    @Override
    public Hospede login(String email, String senha){
        return daoHospede.login(email, senha);
    }
    
    @Override
    public boolean salvarHospede(Hospede hospede) {
        return daoHospede.salvar(hospede);
    }
    
    @Override
    public Hospede buscarHospede(String email){
        return daoHospede.buscarHospede(email);
    }
    
    //
    //
    //
    //
    
    
    // Serviços do Hotel
    
    @Override
    public boolean cadastrarHotel(Hotel hotel){
        return daoHotel.salvar(hotel);
    }
    
    @Override
    public List<Hotel> todosOsHoteis(){
        return daoHotel.todosOsHoteis();
    }
    
    //
    //
    //
    //
    
    
    // Serviços do Quarto
    @Override
    public boolean salvarQuarto(Quarto quarto){
        return daoQuarto.salvar(quarto);
    }
    
    @Override
    public Quarto buscarQuarto(int numero){
        return daoQuarto.buscarQuarto(numero);
    }
}
