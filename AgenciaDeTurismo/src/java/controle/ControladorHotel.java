package controle;

import fachada.Fachada;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import ws.EnderecoHotel;
import ws.Gerente;
import ws.Hotel;

/**
 *
 * @author SergioD
 */
@ManagedBean(name = "controladorHotel")
@SessionScoped
public class ControladorHotel implements Serializable {

    @EJB
    private Fachada fachada;

    private Hotel hotel;
    private EnderecoHotel enderecoHotel;

    public ControladorHotel() {
        this.hotel = new Hotel();
        this.enderecoHotel = new EnderecoHotel();
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public EnderecoHotel getEnderecoHotel() {
        return enderecoHotel;
    }

    public void setEnderecoHotel(EnderecoHotel enderecoHotel) {
        this.enderecoHotel = enderecoHotel;
    }

    public String cadastrarHotel() {

        if (fachada.buscarHotel(hotel.getCodigo()) == null) {

            Gerente gerente = new Gerente();
            gerente.setEmail("Admin");
            gerente.setSenha("12345");
            hotel.setGerente(gerente);

            hotel.setEnderecoHotel(this.enderecoHotel);
            fachada.salvarHotel(hotel);
            this.hotel = new Hotel();
            this.enderecoHotel = new EnderecoHotel();
        }
        return null;
    }

    public List<Hotel> todosOsHoteis() {
        return fachada.listarHoteis();
    }

    public String selectionarHotel(Hotel hotel) {
        this.hotel = hotel;
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        HttpServletRequest request = (HttpServletRequest) context.getRequest();
        HttpSession session = (HttpSession) context.getSession(false);
        context.getSessionMap().put("hotel", hotel);
        return "cadastrarQuarto?faces-redirect=true";
    }

    public String buscarHotel() {
        Hotel h = fachada.buscarHotel(hotel.getCodigo());

        if (h != null) {
            this.hotel = h;
            this.enderecoHotel = h.getEnderecoHotel();
        }

        return null;
    }

    public String atualizarHotel() {
        this.hotel.setEnderecoHotel(enderecoHotel);
        fachada.atualizarHotel(hotel);
        return null;
    }

    public String removerHotel() {
        fachada.removerHotel(hotel);
        this.hotel = new Hotel();
        this.enderecoHotel = new EnderecoHotel();
        return null;
    }
    

    
}
