package controle;

import fachada.Fachada;
import java.io.IOException;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import ws.Gerente;
import ws.Hospede;

/**
 *
 * @author Fatinha
 */
@ManagedBean(name = "controladorAdmin")
@SessionScoped
public class ControladorAdmin implements Serializable {

    @EJB
    private Fachada fachada;
    private HttpSession session;
    private ExternalContext context;
    private Gerente gerente;

    public ControladorAdmin() {
        this.gerente = new Gerente();
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public String paginaAdmin() {
        this.gerente = fachada.buscarGerente(this.gerente.getEmail());
        this.context = FacesContext.getCurrentInstance().getExternalContext();
        this.session = (HttpSession) context.getSession(false);
        this.context.getSessionMap().put("administrador", this.gerente);
        this.gerente = (Gerente) this.session.getAttribute("administrador");
        return "admin?faces-redirect=true";
    }

    public String sair() {
        this.context = FacesContext.getCurrentInstance().getExternalContext();
        HttpServletRequest request = (HttpServletRequest) context.getRequest();
        this.session = (HttpSession) context.getSession(false);
        session.invalidate();

        try {
            context.redirect(request.getContextPath());
            this.gerente = new Gerente();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String cadastrarHotel() {
        return "cadastrarHotel?faces-redirect=true";
    }

    public String listarHoteis() {
       return "listaHotel?faces-redirect=true";
    }
}
