/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SergioD
 */
@Stateless
public class DaoHospede{
    @PersistenceContext(unitName = "jdbc/ProjetoPOS")
    private EntityManager em;

    public String salvar(Object object){
        
        try {
            em.persist(object);
            return "ok.";
        } catch (Exception e) {
            return "erro";
        }
        
    }
    
}
