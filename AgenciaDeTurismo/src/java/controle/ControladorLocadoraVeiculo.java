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
import java.util.Iterator;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import wse.locadora.*;
import wse.restaurante.ReservaRestaurante;

/**
 *
 * @author SergioD
 */
@ManagedBean(name = "controladorLocadoraVeiculo")
@SessionScoped
public class ControladorLocadoraVeiculo implements Serializable {

    @EJB
    private Fachada fachada;

    private Locadora locadora;
    private ExternalContext context;
    private HttpSession session;
    private String cidade;
    private Date dataFim;
    private Date dataInicio;
    private boolean pesquisaCarro;

    public ControladorLocadoraVeiculo() {

    }

    public List<Locadora> buscarLocadorasPorCidade() {
        this.context = FacesContext.getCurrentInstance().getExternalContext();
        this.session = (HttpSession) this.context.getSession(false);
        this.cidade = (String) session.getAttribute("cidadeHotel");

        return fachada.buscarLocadorasPorCidade(this.cidade);
    }

    public String selecionarLocadora(Locadora locadora) {
        this.locadora = locadora;
        return "locadora-reserva.jsf?faces-redirect=true";
    }

    public List<Carro> listarCarrosPorLocadora() {
        return fachada.listarCarrosPorLocadora(this.locadora);
    }

    public String criarReservaLocadora(Carro carro, String nomeUsuario) {
        Reserva reserva = new Reserva();
        reserva.setCarro(carro);
        Usuario usuario = new Usuario();
        usuario.setNome(nomeUsuario);
        reserva.setUsuario(usuario);
        reserva.setDataFim(XMLCalendarParaDate.toXMLGregorianCalendar(dataFim));
        reserva.setDataInicio(XMLCalendarParaDate.toXMLGregorianCalendar(dataInicio));
        reserva.setLocadora(this.locadora);

        if (fachada.criarReservaLocadora(reserva)) {
            System.out.println("Veiculo Reservado");
            return null;
        } else {
            System.out.println("falha ao reserva Veiculo");
            return null;
        }

    }

    public List<Reserva> listarReservasLocadora(String emailUsuario) {

        List<Reserva> reservasUsuario = fachada.listarReservasLocadora();
        
        for (Iterator<Reserva> iterator = reservasUsuario.iterator(); iterator.hasNext();) {
            Reserva reserva = iterator.next();
            if (!reserva.getUsuario().getEmail().equals(emailUsuario)) {
                iterator.remove();
            }
        }

        return reservasUsuario;
    }

    //
    //
    //

    public Locadora getLocadora() {
        return locadora;
    }

    public void setLocadora(Locadora locadora) {
        this.locadora = locadora;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public boolean isPesquisaCarro() {
        return pesquisaCarro;
    }

    public void setPesquisaCarro(boolean pesquisaCarro) {
        this.pesquisaCarro = pesquisaCarro;
    }
    
    
    
}