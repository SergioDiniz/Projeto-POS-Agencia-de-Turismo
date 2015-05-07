/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Quarto;
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
public class DaoQuarto {

    @PersistenceContext(unitName = "jdbc/ProjetoPOS")
    private EntityManager em;

    public boolean salvar(Quarto quarto) {

        try {
            em.persist(quarto);
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public Quarto buscarQuarto(int numero) {
        Quarto hospede;
        try {
            hospede = em.find(Quarto.class, numero);
            return hospede;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Quarto> buscarTodos() {
        List<Quarto> quartos;
        try {
            Query query = em.createQuery("select q from Quarto q  where q.disponivel = true");
            quartos = query.getResultList();
            return quartos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean atualizar(Quarto quarto) {

        try {
            em.merge(quarto);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean remover(Quarto quarto) {

        try {
            em.remove(em.merge(quarto));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
