/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Hospede;
import beans.Quarto;
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
public class DaoHospede {
    @PersistenceContext(unitName = "jdbc/ProjetoPOS")
    private EntityManager em;

    public boolean salvar(Hospede hospede){
        
        try {
            em.persist(hospede);
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }       
    }
    
    public Hospede buscarHospede(String cpf) {
        Hospede hospede;
        try {
            hospede = em.find(Hospede.class, cpf);
            return hospede;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean atualizar(Hospede hospede){
        
        try {
            em.merge(hospede);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }       
    }
    
    public boolean remover(Hospede hospede){
        
        try {
            em.remove(em.merge(hospede));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }       
    } 
}
