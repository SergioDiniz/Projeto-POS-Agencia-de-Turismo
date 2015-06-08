package controle;


import fachada.Fachada;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import ws.Hotel;
import ws.Quarto;

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
    private String disponivel;

    public ControladorQuarto() {
        this.quarto = new Quarto();
        this.disponivel = new String();
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public String getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(String disponivel) {
        this.disponivel = disponivel;
    }
    
    public String salvarQuarto() {
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        HttpSession session = (HttpSession) context.getSession(false);
        Hotel hotel = (Hotel) session.getAttribute("hotel");
    
        if(fachada.buscarQuarto(quarto.getNumero()) == null){
            
            if(this.disponivel.equalsIgnoreCase("Sim")){
                this.quarto.setDisponivel(true);
            }else{
                this.quarto.setDisponivel(false);
            }
            
            fachada.salvarQuarto(quarto);
            hotel.getQuartos().add(quarto);
            fachada.atualizarHotel(hotel);
            quarto = new Quarto();
        }else{
            System.out.println("Codigo Ja Cadastrado!!!");
        }
        
        return null;
    }
    
    public String volarPageListarHotel(){
        return "listaHotel?faces-redirect=true";
    }
    
    public String buscarQuarto(){
        Quarto q = fachada.buscarQuarto(quarto.getNumero());
        
        if(q != null){
            this.quarto = q;
        }else{
            System.out.println("Nenhum Registro Encontrado!");
        }
        
        return null;
    }
    
    public String atualizarQuarto(){
        fachada.atualizarQuarto(quarto);
        
        return null;
    }
    
    public String removerQuarto(){
        fachada.removerQuarto(quarto);
        this.quarto = new Quarto();
        return null;
    }
}
