/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import beans.Hotel;
import fachada.InterfaceFachada;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author SergioD
 */
@WebService(serviceName = "WSInterno")
@Stateless()
public class WSInterno {

    @EJB
    private InterfaceFachada fachada;
    
    @WebMethod(operationName = "salvarHotel")
    public boolean salvarHotel(@WebParam(name = "Hotel") Hotel h) {
        System.out.println("oi");
        return fachada.cadastrarHotel(h);
    }
}
