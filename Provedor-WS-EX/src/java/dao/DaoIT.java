/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Hotel;
import beans.Quarto;
import beans.ReservaHotel;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author SergioD
 */
@Remote
public interface DaoIT {
    
    public boolean salvar(ReservaHotel reserva);
    
    public List<Hotel> buscarTodosHoteisPorCidade(String cidade);
    
    public List<Quarto> todosQuatosPorHotel(int codHotel);
    
}
