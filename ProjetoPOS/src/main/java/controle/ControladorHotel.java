/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import beans.EnderecoHotel;
import beans.Hotel;
import beans.Quarto;
import fachada.Fachada;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;
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
        fachada.cadastrarHotel(hotel);
        return null;
    }
    
    public List<Hotel> todosOsHoteis(){
        return fachada.todosOsHoteis();
    }

    
    public String selectionarHotel(Hotel hotel){
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        HttpSession session = (HttpSession) context.getContext();
        return null;
    }
    
    
    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

}
