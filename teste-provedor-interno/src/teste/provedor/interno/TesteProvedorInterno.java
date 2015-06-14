/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.provedor.interno;

import ws.jpa.TipoQuato;

/**
 *
 * @author SergioD
 */
public class TesteProvedorInterno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
             
        for(TipoQuato t : tiposDeQuatosPorHotel(1)){
            System.out.println("tipo: " + t.getTipo());
        }
        
        
    }

    private static java.util.List<ws.jpa.TipoQuato> tiposDeQuatosPorHotel(int codHotel) {
        ws.jpa.WSInternoJPA_Service service = new ws.jpa.WSInternoJPA_Service();
        ws.jpa.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.tiposDeQuatosPorHotel(codHotel);
    }

}
