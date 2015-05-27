/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;
import ws.WSInternoJPA_Service;


/**
 *
 * @author SergioD
 */
@Stateless
public class Fachada {
   
    
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WSInternoJPA/WSInternoJPA.wsdl")
    private WSInternoJPA_Service service;

    public boolean salvarHospede(ws.Hospede hospede) {
        ws.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.salvarHospede(hospede);
    }


    
}
