package ws.jpa;

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
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "salvarHospede")
    public boolean salvarHospede(@WebParam(name = "email") String email, 
            @WebParam(name = "nome") String nome, @WebParam(name = "senha") String senha) {
        
        return fachada.salvarHospede(email, senha, nome);
    }
    
}
