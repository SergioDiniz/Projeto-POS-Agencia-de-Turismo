/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamb;

import beans.Quarto;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author SergioD
 */
public class ConsultaDataReserva {

    @PersistenceContext(unitName = "Provedor-WSPU")
    public static EntityManager em;
    
    private String sql = "";
    public static Query query;
    
    public static List<Quarto> quartosDisponiveisPorData(Date dataEntrada, Date dataSaida) {
        List<Quarto> quartos;
        try {
            query = em.createQuery("SELECT q from Hotel h, ReservaHotel rh JOIN rh.quarto q where h.codigo = 1 ");
//            query.setParameter("dataEntrada", dataEntrada);
//            query.setParameter("dataSaida", dataSaida);
            quartos = (List<Quarto>) query.getResultList();

            
            return quartos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
