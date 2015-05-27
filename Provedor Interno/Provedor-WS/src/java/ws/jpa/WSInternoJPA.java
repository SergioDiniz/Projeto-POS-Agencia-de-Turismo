package ws.jpa;

import beans.Hospede;
import fachada.FachadaIT;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Fatinha
 */
@WebService(serviceName = "WSInternoJPA")
@Stateless()
public class WSInternoJPA {

    @EJB
    private FachadaIT fachada;
    
    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "salvarHospede")
    public boolean salvarHospede(@WebParam(name = "hospede") Hospede hospede) {
        return fachada.salvarHospede(hospede);
    }
    
}
