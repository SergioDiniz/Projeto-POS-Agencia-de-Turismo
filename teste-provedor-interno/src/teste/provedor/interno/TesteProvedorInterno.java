/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.provedor.interno;

import datas.XMLCalendarParaDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import ws.jpa.Quarto;
import ws.jpa.TipoQuato;

/**
 *
 * @author SergioD
 */
public class TesteProvedorInterno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        
        
        Date d1 = sdf.parse("18/02/2015");
        Date d2 = sdf.parse("20/02/2015");
        
        
        
        for(Quarto q : quartosDisponiveis(XMLCalendarParaDate.toXMLGregorianCalendar(d1), XMLCalendarParaDate.toXMLGregorianCalendar(d2), 1)){
            System.out.println(q.getNumero());
        }
        
        
    }

    private static java.util.List<ws.jpa.Quarto> quartosDisponiveis(javax.xml.datatype.XMLGregorianCalendar dataEntrada, javax.xml.datatype.XMLGregorianCalendar dataSaida, int codHotel) {
        ws.jpa.WSInternoJPA_Service service = new ws.jpa.WSInternoJPA_Service();
        ws.jpa.WSInternoJPA port = service.getWSInternoJPAPort();
        return port.quartosDisponiveis(dataEntrada, dataSaida, codHotel);
    }


    
    
}
