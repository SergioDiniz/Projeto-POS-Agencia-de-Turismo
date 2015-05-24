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
public class Fachada {
    
    @EJB
    private InterfaceDaoHospede daoHospede;
    
    @EJB
    private InterfaceDaoHotel daoHotel;
    
    // Serviços do Hospede
    public Hospede login(String email, String senha){
        return daoHospede.login(email, senha);
    }
    
    public boolean salvarHospede(Hospede hospede) {
        return daoHospede.salvar(hospede);
    }
    
    public Hospede buscarHospede(String email){
        return daoHospede.buscarHospede(email);
    }
    
    //
    //
    //
    //
    
    
    // Serviços do Hotel
    
    public boolean cadastrarHotel(Hotel hotel){
        return daoHotel.salvar(hotel);
    }
    
    public List<Hotel> todosOsHoteis(){
        return daoHotel.todosOsHoteis();
    }
    
    //
    //
    //
    //
}
