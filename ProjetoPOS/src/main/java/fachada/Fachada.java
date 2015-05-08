/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import beans.Hospede;
import dao.DaoHospede;
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
    
}
