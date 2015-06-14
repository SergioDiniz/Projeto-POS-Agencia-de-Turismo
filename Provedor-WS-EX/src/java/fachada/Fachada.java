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
    public boolean salvarReservaHotel(ReservaHotel reservaHotel) {
        List<Quarto> quartos = dao.todosQuatosPorHotel(reservaHotel.getHotel().getCodigo());

        if (quartos.size() > 0) {
            Quarto q = quartos.get(0);
            reservaHotel.setQuarto(q);
            q.setDisponivel(false);

            float preco = (float) (q.getPreco() * XMLCalendarParaDate.diferencaDeDatas(reservaHotel.getDataReserva(),
                    reservaHotel.getDataSaida()));
            reservaHotel.setValorReserva(preco);

            dao.atualizarQuarto(quartos.get(0));
            return dao.salvarReserva(reservaHotel);
        } else {
            return false;
        }
    }

    @Override
    public List<Hotel> buscarTodosHoteisPorCidade(String cidade) {
        return dao.buscarTodosHoteisPorCidade(cidade);
    }

    @Override
    public ReservaHotel buscarUmaReserva(int codigo) {
        return dao.buscarReservaHotel(codigo);
    }

    @Override
    public List<ReservaHotel> todasAsReservas(String login) {
        return dao.listarReservasHotel(login);
    }

    @Override
    public List<ReservaHotel> reservasPorData(Date dataReserva, String login) {
        return dao.listarReservasPorData(dataReserva, login);
    }

}
