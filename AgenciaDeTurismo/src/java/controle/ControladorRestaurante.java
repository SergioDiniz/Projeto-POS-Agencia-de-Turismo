/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import datas.XMLCalendarParaDate;
import fachada.Fachada;
import java.io.Serializable;
import java.util.ArrayList;
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
import wse.restaurante.*;

/**
 *
 * @author SergioD
 */
@ManagedBean(name = "controladorRestaurante")
@SessionScoped
public class ControladorRestaurante implements Serializable {

    @EJB
    private Fachada fachada;

    private Restaurante restaurante;
    private ExternalContext context;
    private HttpSession session;
    private String cidade;
    private Date dataReserva;
    private ReservaRestaurante reservaRestaurante;

    public ControladorRestaurante() {
        this.restaurante = new Restaurante();
        this.reservaRestaurante = new ReservaRestaurante();
    }

    public List<Restaurante> buscarRestaurantesPorCidade() {
        this.context = FacesContext.getCurrentInstance().getExternalContext();
        this.session = (HttpSession) this.context.getSession(false);
        this.cidade = (String) session.getAttribute("cidadeHotel");

        return fachada.buscarRestaurantesPorCidade(cidade);
    }

    public String selecionarRestaurante(Restaurante restaurante) {
        this.context = FacesContext.getCurrentInstance().getExternalContext();
        this.session = (HttpSession) context.getSession(false);
        this.context.getSessionMap().put("restaurante", restaurante);

        return "restaurante-reserva.jsf?faces-redirect=true";

    }

    public String criarReserva(String emailUsuario, Restaurante restaurante) {

        System.out.println(emailUsuario);
        System.out.println(restaurante.getNome());
        System.out.println(reservaRestaurante.getQtdePessoas());
        System.out.println(this.dataReserva);
        Usuario u = new Usuario();

        u.setEmail(emailUsuario);
        reservaRestaurante.setUsuario(u);
        reservaRestaurante.setRestaurante(restaurante);
        reservaRestaurante.setDataReserva(XMLCalendarParaDate.toXMLGregorianCalendar(this.dataReserva));
//        return true;
        if (fachada.criarReserva(this.reservaRestaurante)) {
            System.out.println("reservado");
            return null;
        } else {
            System.out.println("Erro ao reservar");
            return null;
        }

    }

    public List<ReservaRestaurante> listarReservas(String emailUsuario) {
        System.out.println(emailUsuario);
        List<ReservaRestaurante> todasReservas = fachada.listarReservas();

        System.out.println(todasReservas.get(0).getUsuario().getEmail());

        for (Iterator<ReservaRestaurante> iterator = todasReservas.iterator(); iterator.hasNext();) {
            ReservaRestaurante restaurante = iterator.next();
            if (!restaurante.getUsuario().getEmail().equals(emailUsuario)) {
                iterator.remove();
            }
        }

        return todasReservas;
    }

    public List<ReservaRestaurante> pesquisarReserva(Date data) {
        return null;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public ReservaRestaurante getReservaRestaurante() {
        return reservaRestaurante;
    }

    public void setReservaRestaurante(ReservaRestaurante reservaRestaurante) {
        this.reservaRestaurante = reservaRestaurante;
    }

}
