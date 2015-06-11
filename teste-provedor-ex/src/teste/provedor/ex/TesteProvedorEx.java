/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.provedor.ex;

import datas.XMLCalendarParaDate;
import java.util.Date;
import java.util.List;
import ws.*;

/**
 *
 * @author SergioD
 */
public class TesteProvedorEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (Hotel h : listaHotelPorCidade("Cajazeiras")) {
            System.out.println(h.getNome());
        }

        for (Quarto q : todosQuatosPorHotel(1)) {
            System.out.println(q.getNumero());
        }
        
        List<Hotel> hoteis = listaHotelPorCidade("Santa Helena");
        List<Quarto> quartos = todosQuatosPorHotel(hoteis.get(0).getCodigo());
        Hospede hospede = new Hospede();
        hospede.setEmail("sergio@gmail.com");
        hospede.setNome("sergio");
        hospede.setSenha("123");
        
        
        ReservaHotel reservaHotel = new ReservaHotel();
        reservaHotel.setQuarto(quartos.get(0));
        reservaHotel.setHotel(hoteis.get(0));
        reservaHotel.setHospede(hospede);
        reservaHotel.setDataReserva(XMLCalendarParaDate.toXMLGregorianCalendar(new Date()));
        reservaHotel.setDataSaida(XMLCalendarParaDate.toXMLGregorianCalendar(new Date()));
        
        salvarReservaHotel(reservaHotel);

    }

    private static java.util.List<ws.Hotel> listaHotelPorCidade(java.lang.String cidade) {
        ws.WSExterno_Service service = new ws.WSExterno_Service();
        ws.WSExterno port = service.getWSExternoPort();
        return port.listaHotelPorCidade(cidade);
    }

    private static java.util.List<ws.Quarto> todosQuatosPorHotel(int codigo) {
        ws.WSExterno_Service service = new ws.WSExterno_Service();
        ws.WSExterno port = service.getWSExternoPort();
        return port.todosQuatosPorHotel(codigo);
    }

    private static boolean salvarReservaHotel(ws.ReservaHotel reservaHotel) {
        ws.WSExterno_Service service = new ws.WSExterno_Service();
        ws.WSExterno port = service.getWSExternoPort();
        return port.salvarReservaHotel(reservaHotel);
    }

}
