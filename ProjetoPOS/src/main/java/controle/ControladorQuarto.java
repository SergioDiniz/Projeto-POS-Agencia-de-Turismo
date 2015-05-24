/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import beans.Quarto;
import fachada.Fachada;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author SergioD
 */
@ManagedBean(name = "controladorQuarto")
@SessionScoped
public class ControladorQuarto implements Serializable{
    
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
    
    
    
    
}
