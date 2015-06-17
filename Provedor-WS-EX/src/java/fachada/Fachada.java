/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import beans.Hotel;
import beans.Quarto;
import beans.ReservaHotel;
import dao.DaoIT;
import datas.XMLCalendarParaDate;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author SergioD
 */
@Stateless
public class Fachada implements FachadaIT {

    @EJB
    private DaoIT dao;

    public Fachada() {
    }

    @Override
    public List<Hotel> buscarTodosCidade(String cidade) {
        return dao.buscarTodosCidade(cidade);
    }

    @Override
    public List<Quarto> quartosDisponiveis(Date dataEntrada, Date dataSaida, int codHotel) {
        return dao.quartosDisponiveis(dataEntrada, dataSaida, codHotel);
    }

    @Override
    public List<ReservaHotel> listarReservasPorData(Date dataReserva, String login) {
        return dao.listarReservasPorData(dataReserva, login);
    }

    @Override
    public List<ReservaHotel> reservasHospede(String login) {
        return dao.reservasHospede(login);
    }

    @Override
    public ReservaHotel buscarReservaCodigo(int codigo) {
        return dao.buscarReservaCodigo(codigo);
    }

    @Override
    public boolean salvarReserva(ReservaHotel reserva) {
        return dao.salvarResevar(reserva);
    }

   

}
