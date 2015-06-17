/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import static com.sun.faces.facelets.util.Path.context;
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
import wse.restaurante.Restaurante;


/**
 *
 * @author SergioD
 */
@ManagedBean(name = "controladorRestaurante")
@SessionScoped
public class ControladorRestaurante implements Serializable{
    
    @EJB
    private Fachada fachada;

    private Restaurante restaurante;
    private ExternalContext context;
    private HttpServletRequest request;
    private HttpSession session;
    
    public ControladorRestaurante() {
    }
    
    public void colocarObjetoNaSessao(String nome, Object object){
        this.context = FacesContext.getCurrentInstance().getExternalContext();
        this.session = (HttpSession) context.getSession(false);
        this.context.getSessionMap().put(nome, object);
    }
    
    public List<Restaurante> buscarRestaurantesPorCidade(){
        this.context = FacesContext.getCurrentInstance().getExternalContext();
        this.session = (HttpSession) this.context.getSession(false);

        return fachada.buscarRestaurantesPorCidade("João Pessoa");
    }
    
    
    
    
    
    
    // Getters and Setters

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
    
    
    
    
    
}
