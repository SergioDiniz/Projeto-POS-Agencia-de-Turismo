package controle;

import beans.Hotel;
import beans.Quarto;
import fachada.Fachada;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SergioD
 */
@ManagedBean(name = "controladorQuarto")
@SessionScoped
public class ControladorQuarto implements Serializable {

    @EJB
    private Fachada fachada;

    private Quarto quarto;

    public ControladorQuarto() {
        this.quarto = new Quarto();
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public String salvarQuarto() {
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        HttpSession session = (HttpSession) context.getSession(false);
        Hotel hotel = (Hotel) session.getAttribute("hotel");
    
        if(fachada.buscarQuarto(quarto.getCodigo()) == null){
            quarto.setDisponivel(true);
            quarto.setHotel(hotel);
            fachada.salvarQuarto(quarto);
            quarto = new Quarto();
        }
        
        return null;
    }
    
    public String volarPageListarHotel(){
        return "listaHotel?faces-redirect=true";
    }
}
