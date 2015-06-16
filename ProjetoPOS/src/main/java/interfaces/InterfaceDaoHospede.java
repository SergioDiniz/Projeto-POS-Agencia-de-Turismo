package interfaces;

import beans.Hospede;
import javax.ejb.Remote;

/**
 *
 * @author Fatinha
 */

@Remote
public interface InterfaceDaoHospede {
    
    public boolean salvar(Hospede hospede);

    public Hospede buscarHospede(String email);

    public boolean atualizar(Hospede hospede);

    public boolean remover(Hospede hospede);

    public Hospede login(String email, String senha);
}
