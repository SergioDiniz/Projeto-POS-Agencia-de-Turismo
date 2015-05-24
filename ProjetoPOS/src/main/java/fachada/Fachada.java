/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import beans.Hospede;
import beans.Hotel;
import dao.DaoHospede;
import dao.DaoHotel;
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
    private DaoHospede daoHospede;
    
    @EJB
    private DaoHotel daoHotel;
    
    // Serviços do Hospede
    public Hospede login(String email, String senha){
        return daoHospede.login(email, senha);
    }
    
    public boolean salvarHospede(Hospede hospede) {
        return daoHospede.salvar(hospede);
    }
    
    public Hospede buscarHospede(String cpf){
        return daoHospede.buscarHospede(cpf);
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
