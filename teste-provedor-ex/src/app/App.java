package app;

import datas.XMLCalendarParaDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import ws.ReservaHotel;

/**
 *
 * @author Fatinha
 */
public class App {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataReserva = "15/06/2015";
        Date data = dateFormat.parse(dataReserva);

        List<ReservaHotel> reservas = listarReservasPorData(XMLCalendarParaDate.toXMLGregorianCalendar(data), "fatinha@cz");

        if (reservas.size() > 0) {

            for (ReservaHotel rh : reservas) {
                System.out.println("Reserva: " + rh.getCodigo());
            }
        }else{
            System.out.println("Nenhum Reserva Encontrada!");
        }
    }

    private static java.util.List<ws.ReservaHotel> listarReservasPorData(javax.xml.datatype.XMLGregorianCalendar dataReserva, java.lang.String login) {
        ws.WSExterno_Service service = new ws.WSExterno_Service();
        ws.WSExterno port = service.getWSExternoPort();
        return port.listarReservasPorData(dataReserva, login);
    }
}
