package teste.provedor.ex;

import datas.XMLCalendarParaDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import ws.*;

/**
 *
 * @author SergioD
 */
public class TesteProvedorEx {

    public static void main(String[] args) throws ParseException {

        for (Hotel h : listaHotelPorCidade("João Pessoa")) {
            System.out.println(h.getNome());
        }

        List<Hotel> hoteis = listaHotelPorCidade("João Pessoa");
        Hospede hospede = new Hospede();
        hospede.setEmail("fatinha.sg@hotmail.com");
        hospede.setNome("Fatinha");
        hospede.setSenha("fatinha");

        ReservaHotel reservaHotel = new ReservaHotel();
        reservaHotel.setQuarto(null);
        reservaHotel.setHotel(hoteis.get(0));
        reservaHotel.setHospede(hospede);
        
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date dataEntrada = format.parse("14/06/2015");
        Date dataSaida = format.parse("24/06/2015");
        
        reservaHotel.setDataReserva(XMLCalendarParaDate.toXMLGregorianCalendar(dataEntrada));
        reservaHotel.setDataSaida(XMLCalendarParaDate.toXMLGregorianCalendar(dataSaida));

        boolean resposta = salvarReservaHotel(reservaHotel);

        if(resposta == true){
            System.out.println("Okay!");
        }else{
            System.out.println("Nenhum Quarto Disponivel!");
        }
    }

    private static java.util.List<ws.Hotel> listaHotelPorCidade(java.lang.String cidade) {
        ws.WSExterno_Service service = new ws.WSExterno_Service();
        ws.WSExterno port = service.getWSExternoPort();
        return port.listaHotelPorCidade(cidade);
    }

    private static boolean salvarReservaHotel(ws.ReservaHotel reservaHotel) {
        ws.WSExterno_Service service = new ws.WSExterno_Service();
        ws.WSExterno port = service.getWSExternoPort();
        return port.salvarReservaHotel(reservaHotel);
    }
}
