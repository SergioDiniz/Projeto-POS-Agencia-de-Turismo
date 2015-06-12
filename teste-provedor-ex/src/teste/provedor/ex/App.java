package teste.provedor.ex;

import java.util.List;
import ws.ReservaHotel;

/**
 *
 * @author Fatinha
 */
public class App {

    public static void main(String[] args) {

        System.out.println("Hello!!!");

        /*
        ReservaHotel reservaHotel = buscarReserva(14);

        if (reservaHotel != null) {
            System.out.println("Reserva: " + reservaHotel.getCodigo());
            System.out.println("Hospede: " + reservaHotel.getHospede().getNome());
            System.out.println("Hotel: " + reservaHotel.getHotel().getNome());
            System.out.println("Quarto: " + reservaHotel.getQuarto().getNumero());
            System.out.println("Data de Entrada: " + reservaHotel.getDataReserva());
            System.out.println("Data de Saida: " + reservaHotel.getDataSaida());
            System.out.println("Valor: " + reservaHotel.getValorReserva());

        }else{
            System.out.println("Nenhum Registro Encontrado!");
        }*/
        
        
        List<ReservaHotel> hotels = listarReservasUsuario("fatinha.sg@hotmail.com");

        if (hotels.size() > 0) {
            for (ReservaHotel r : hotels) {
                System.out.println("Reserva: " + r.getCodigo());
                System.out.println("Hospede: " + r.getHospede().getNome());
                System.out.println("Hotel: " + r.getHotel().getNome());
                System.out.println("");
            }
        }
    }

    private static java.util.List<ws.ReservaHotel> listarReservasUsuario(java.lang.String login) {
        ws.WSExterno_Service service = new ws.WSExterno_Service();
        ws.WSExterno port = service.getWSExternoPort();
        return port.listarReservasUsuario(login);
    }

    private static ReservaHotel buscarReserva(int codigo) {
        ws.WSExterno_Service service = new ws.WSExterno_Service();
        ws.WSExterno port = service.getWSExternoPort();
        return port.buscarReserva(codigo);
    }
}
