/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Gerente;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Diego Alves
 */
@Stateless
public class DaoGerente {

    @PersistenceContext(unitName = "jdbc/ProjetoPOS")
    private EntityManager em;

    public Gerente buscar(String email, String senha) {
        Gerente gerente;
        try {
            Query query = em.createQuery("select g from Gerente g  where g.email = :email and g.senha = :senha");
            query.setParameter(email, "email");
            query.setParameter(senha, "senha");
            gerente = (Gerente) query.getSingleResult();
            return gerente;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean atualizar(Gerente gerente){
        
        try {
            em.merge(gerente);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }       
    }

}
