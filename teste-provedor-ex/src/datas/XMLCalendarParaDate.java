package datas;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Fatinha
 */
public class XMLCalendarParaDate {

    public static XMLGregorianCalendar toXMLGregorianCalendar(Date date) {
        GregorianCalendar gCalendar = new GregorianCalendar();
        gCalendar.setTime(date);
        XMLGregorianCalendar xmlCalendar = null;
        
        try {
            xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(XMLCalendarParaDate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return xmlCalendar;
    }

    public static Date toDate(XMLGregorianCalendar calendar){
        
        if(calendar == null) {
            return null;
        }
        
        return calendar.toGregorianCalendar().getTime();
    }
    
    public static int diferencaDeDatas(Date dataEntrada, Date dataSaida){
        long dt = (dataSaida.getTime() - dataEntrada.getTime());  
        int dias = (int) (dt / 86400000L); 
        
        return dias;
    }
}
