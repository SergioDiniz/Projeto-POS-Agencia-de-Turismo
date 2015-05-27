package fachada;

import beans.Hospede;
import interfaces.DaoHospedeIT;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Fatinha
 */

@Stateless
public class Fachada implements FachadaIT{
    
    @EJB
    private DaoHospedeIT daoHospedeIT;

    public Fachada(){
    
    }
    
    @Override
    public boolean salvarHospede(String email, String senha, String nome) {
        Hospede hospede = new Hospede(senha, email, nome);
        return daoHospedeIT.salvar(hospede);
    }
}
