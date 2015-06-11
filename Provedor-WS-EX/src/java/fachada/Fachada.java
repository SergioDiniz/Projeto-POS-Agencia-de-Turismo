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
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author SergioD
 */
@Stateless
public class Fachada implements FachadaIT{

    @EJB
    private DaoIT dao;
    
    public Fachada() {
    }

    @Override
    public boolean salvarReservaHotel(ReservaHotel reservaHotel) {
        return dao.salvar(reservaHotel);
    }

    @Override
    public List<Hotel> buscarTodosHoteisPorCidade(String cidade) {
        return dao.buscarTodosHoteisPorCidade(cidade);
    }

    @Override
    public List<Quarto> todosQuatosPorHotel(int codHotel) {
        return dao.todosQuatosPorHotel(codHotel);
    }
    
}
