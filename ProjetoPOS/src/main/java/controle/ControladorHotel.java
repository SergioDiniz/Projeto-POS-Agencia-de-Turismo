package controle;

import beans.EnderecoHotel;
import beans.Gerente;
import beans.Hotel;
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

    public ControladorHotel() {
        this.hotel = new Hotel(new EnderecoHotel());
    }

    public String cadastrarHotel() {
        hotel.setGerente(new Gerente("Admin", "12345"));
        fachada.cadastrarHotel(hotel);
        hotel = new Hotel();
        return null;
    }

    public List<Hotel> todosOsHoteis() {
        return fachada.todosOsHoteis();
    }

    public String selectionarHotel(Hotel hotel) {
        this.hotel = hotel;
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        HttpServletRequest request = (HttpServletRequest) context.getRequest();
        HttpSession session = (HttpSession) context.getSession(false);
        context.getSessionMap().put("hotel", hotel);
        return "cadastrarQuarto?faces-redirect=true";
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

}
