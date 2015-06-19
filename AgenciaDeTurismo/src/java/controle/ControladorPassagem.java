/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import datas.XMLCalendarParaDate;
import fachada.Fachada;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import wse.passagem.*;

/**
 *
 * @author SergioD
 */
@ManagedBean(name = "controladorPassagem")
@SessionScoped
public class ControladorPassagem implements Serializable{
    
    @EJB
    private Fachada fachada;

    private Passagem passagem;
    private String destino;
    private Date dataPassagem;
    private boolean vooPesquisa;
    private ExternalContext context;
    private HttpSession session;
    
    public ControladorPassagem() {
        this.passagem = new Passagem();
        this.vooPesquisa = false;
    }
    
    
    
    
    public String buscarVoos(String origem){
        this.vooPesquisa = true;
        
        List<Voo> voos = fachada.bucarVoos(origem, this.destino, XMLCalendarParaDate.toXMLGregorianCalendarPassagem(this.dataPassagem));
        this.context = FacesContext.getCurrentInstance().getExternalContext();
        this.session = (HttpSession) this.context.getSession(false);
        context.getSessionMap().put("voos", voos);
        

        return "passagens.jsf?faces-redirect=true";
    }
 
    public String comparPassagemIda(String emailUsuario, Voo voo, String nomeUsuario){
        
        if(fachada.comprarPassagemIda(nomeUsuario, voo, nomeUsuario, nomeUsuario)){
            System.out.println("comprou passagem");
            return null;
        } else {
            System.out.println("erro ao comprar passagem");
            return null;
        }
        
    }
    
    public List<Passagem> listarPassagens(String emailUsuario){
        return fachada.listarPassagens(emailUsuario);
    }

    
    
    public Passagem getPassagem() {
        return passagem;
    }

    //
    //
    //
    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getDataPassagem() {
        return dataPassagem;
    }

    public void setDataPassagem(Date dataPassagem) {
        this.dataPassagem = dataPassagem;
    }

    public boolean isVooPesquisa() {
        return vooPesquisa;
    }

    public void setVooPesquisa(boolean vooPesquisa) {
        this.vooPesquisa = vooPesquisa;
    }
    
    
    
    
}

