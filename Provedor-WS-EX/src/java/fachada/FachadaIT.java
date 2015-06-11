/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import beans.Hotel;
import beans.Quarto;
import beans.ReservaHotel;
import java.util.List;

/**
 *
 * @author SergioD
 */
public interface FachadaIT {
    
    public boolean salvarReservaHotel(ReservaHotel reservaHotel);
    
    public List<Hotel> buscarTodosHoteisPorCidade(String cidade);
    
    public List<Quarto> todosQuatosPorHotel(int codHotel);
    
}
