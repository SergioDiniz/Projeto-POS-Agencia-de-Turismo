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
    public boolean salvarHospede(Hospede hospede) {
        return daoHospedeIT.salvar(hospede);
    }
}
