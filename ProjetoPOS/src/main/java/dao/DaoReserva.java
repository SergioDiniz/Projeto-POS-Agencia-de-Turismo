/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Reserva;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Diego Alves
 */
@Stateless
public class DaoReserva {
    
    @PersistenceContext(unitName = "jdbc/ProjetoPOS")
    private EntityManager em;

    public boolean salvar(Reserva reserva) {

        try {
            em.persist(reserva);
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }
    
}
