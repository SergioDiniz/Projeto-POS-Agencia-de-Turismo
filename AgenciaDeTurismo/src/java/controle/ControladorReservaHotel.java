package controle;

import datas.XMLCalendarParaDate;
import fachada.Fachada;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import ws.Hospede;
import ws.Hotel;
import ws.Quarto;
import ws.ReservaHotel;

/**
 *
 * @author Fatinha
 */
@ManagedBean(name = "controladorReservaHotel")
@SessionScoped
public class ControladorReservaHotel implements Serializable {

    @EJB
    private Fachada fachada;
    private String cidade;
    private Hotel hotel;
    private ReservaHotel reservaHotel;
    private ExternalContext context;
    private HttpServletRequest request;
    private HttpSession session;
    private Date dataEntrada;
    private Date dataSaida;

    public ControladorReservaHotel() {
        this.reservaHotel = new ReservaHotel();
        this.hotel = new Hotel();
    }

    public ReservaHotel getReservaHotel() {
        return reservaHotel;
    }

    public void setReservaHotel(ReservaHotel reservaHotel) {
        this.reservaHotel = reservaHotel;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String proximaPagina(String cidade) {
        this.context = FacesContext.getCurrentInstance().getExternalContext();
        this.request = (HttpServletRequest) context.getRequest();
        this.session = (HttpSession) context.getSession(false);
        this.context.getSessionMap().put("cidadeHotel", cidade);

        return "listaHotelCidade?faces-redirect=true";
    }

    public List<Hotel> hoteisCidade() {
        this.context = FacesContext.getCurrentInstance().getExternalContext();
        this.session = (HttpSession) this.context.getSession(false);
        this.cidade = (String) session.getAttribute("cidadeHotel");

        return fachada.buscarHoteisCidade(this.cidade);
    }

    public String selectionarHotelReserva(Hotel hotel) {
        this.hotel = hotel;
        this.context = FacesContext.getCurrentInstance().getExternalContext();
        this.request = (HttpServletRequest) this.context.getRequest();
        this.session = (HttpSession) this.context.getSession(false);
        context.getSessionMap().put("hotelReserva", hotel);
        return "reservarQuarto?faces-redirect=true";
    }

    public String reservarHotel() {
        this.context = FacesContext.getCurrentInstance().getExternalContext();
        this.session = (HttpSession) this.context.getSession(false);
        this.hotel = (Hotel) this.session.getAttribute("hotelReserva");
        Hospede hospede = (Hospede) this.session.getAttribute("hospedeCadastrado");

        Quarto quarto = buscarQuartoDisponivel(hotel);
        
        if (quarto != null) {
            
            reservaHotel.setHospede(hospede);
            reservaHotel.setHotel(hotel);
            reservaHotel.setQuarto(quarto);
            reservaHotel.setDataReserva(XMLCalendarParaDate.toXMLGregorianCalendar(dataEntrada));
            reservaHotel.setDataSaida(XMLCalendarParaDate.toXMLGregorianCalendar(dataSaida));
            
            float preco = (float) (quarto.getPreco() * XMLCalendarParaDate.diferencaDeDatas(dataEntrada, dataSaida));
            reservaHotel.setValorReserva(preco);
            
            quarto.setDisponivel(false);
            fachada.atualizarQuarto(quarto);
            fachada.salvarReservaHotel(reservaHotel);
            
            this.reservaHotel = new ReservaHotel();
            this.dataEntrada = null;
            this.dataSaida = null;
        } else {
            System.out.println("Nenhum Quarto Disponivel!!!");
        }

        return null;
    }

    public Quarto buscarQuartoDisponivel(Hotel hotel) {

        Quarto quarto = null;

        if (hotel.getQuartos().size() > 0) {
            
            for (Quarto q : hotel.getQuartos()) {
                if (q.isDisponivel() == true) {
                    quarto = q;
                    break;
                }
            }
        }

        return quarto;
    }
}
