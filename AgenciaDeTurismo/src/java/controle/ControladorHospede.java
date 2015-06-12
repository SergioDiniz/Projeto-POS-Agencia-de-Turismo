package controle;

import fachada.Fachada;
import java.io.IOException;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import ws.Hospede;

/**
 *
 * @author SergioD
 */
@ManagedBean(name = "controladorHospede")
@SessionScoped
public class ControladorHospede implements Serializable {

    @EJB
    private Fachada fachada;

    private Hospede hospede;
    private Hospede hospedeCadastro;
    private HttpSession session;
    private ExternalContext context;

    public ControladorHospede() {
        this.hospede = new Hospede();
        this.hospedeCadastro = new Hospede();
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Hospede getHospedeCadastro() {
        return hospedeCadastro;
    }

    public void setHospedeCadastro(Hospede hospedeCadastro) {
        this.hospedeCadastro = hospedeCadastro;
    }

    /*Servicos*/
    public String cadastro() {

        if (fachada.salvarHospede(hospedeCadastro) == true) {
            this.context = FacesContext.getCurrentInstance().getExternalContext();
            this.session = (HttpSession) context.getSession(false);
            this.context.getSessionMap().put("hospede", hospedeCadastro);
            this.hospede = (Hospede) this.session.getAttribute("hospede");
            this.hospedeCadastro = new Hospede();
        }

        return null;

    }

    public String login(){
        try {
            
            this.context = FacesContext.getCurrentInstance().getExternalContext();
            this.session = (HttpSession) context.getSession(false);
            this.hospede = fachada.loginHospede(this.hospede.getEmail(), this.hospede.getSenha());
            
            this.context.getSessionMap().put("hospedeCadastrado", hospede);
            this.hospede = (Hospede) this.session.getAttribute("hospedeCadastrado");
            
            System.out.println("Hospede: " +this.hospede.getEmail());
            return null;
            
        } catch (Exception e) {
            return null;
        }

    }
    
    public String sair() {
        this.context = FacesContext.getCurrentInstance().getExternalContext();
        HttpServletRequest request = (HttpServletRequest) context.getRequest();
        this.session = (HttpSession) context.getSession(false);
        session.invalidate();
        
        try {
            context.redirect(request.getContextPath());
            this.hospede = new Hospede();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public String atualizarHospede(){
        
        fachada.atualizarHospede(hospede);
        return null;
    }
    
    public String removerHospede(){
    
        fachada.removerHospede(hospede);
        return null;
    }

}
