/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Hotel;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Diego Alves
 */
@Stateless
public class DaoHotel {

    @PersistenceContext(unitName = "jdbc/ProjetoPOS")
    private EntityManager em;

    public boolean salvar(Hotel hotel) {

        try {
            em.persist(hotel);
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public Hotel buscarQuarto(int numero) {
        Hotel hospede;
        try {
            hospede = em.find(Hotel.class, numero);
            return hospede;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Hotel> buscarTodos(String cidade) {
        List<Hotel> hoteis;
        try {
            Query query = em.createQuery("select h from Hotel h  where h.enderecoHotel.cidade = :cidade");
            query.setParameter(cidade, "cidade");
            hoteis = query.getResultList();
            return hoteis;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Hotel> todosOsHoteis() {
        List<Hotel> hoteis;
        try {
            Query query = em.createQuery("select h from Hotel h");
            hoteis = query.getResultList();
            return hoteis;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
