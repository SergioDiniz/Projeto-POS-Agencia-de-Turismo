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
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author SergioD
 */
@Stateless
public class Dao implements DaoIT{

    @PersistenceContext(unitName = "Provedor-WSPU")
    private EntityManager em;

    @Override
    public boolean salvar(ReservaHotel reserva) {
        try {
            em.persist(reserva);
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    
    @Override
    public List<Hotel> buscarTodosHoteisPorCidade(String cidade) {
        List<Hotel> hoteis;
        try {
            Query query = em.createQuery("select h from Hotel h where h.enderecoHotel.cidade = :cidade");
            query.setParameter("cidade", cidade);
            hoteis = (List<Hotel>) query.getResultList();
            
            for(Hotel h: hoteis){
                h.getQuartos().size();
            }
            
            return hoteis;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    @Override
    public List<Quarto> todosQuatosPorHotel(int codHotel){
        List<Quarto> quartos;
        try {
            Query query = em.createQuery("select hq from Hotel h JOIN h.quartos hq where h.codigo = :codigo");
            query.setParameter("codigo", codHotel);
            quartos = (List<Quarto>) query.getResultList();
                      
            return quartos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
