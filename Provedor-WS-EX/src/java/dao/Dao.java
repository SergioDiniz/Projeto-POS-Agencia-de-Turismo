/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Hotel;
import beans.Quarto;
import beans.ReservaHotel;
import java.util.ArrayList;
import java.util.Date;
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
public class Dao implements DaoIT {

    @PersistenceContext(unitName = "Provedor-WSPU")
    private EntityManager em;

    // Metodos do Hotel
    @Override
    public List<Hotel> buscarTodosCidade(String cidade) {
        List<Hotel> hoteis;
        try {
            Query query = em.createQuery("select h from Hotel h where h.enderecoHotel.cidade = :cidade");
            query.setParameter("cidade", cidade);
            hoteis = (List<Hotel>) query.getResultList();

            for (Hotel h : hoteis) {
                h.getQuartos().size();
            }

            return hoteis;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    
    
    
    
    
    // Metodos do Quarto   
    @Override
    public List<Quarto> quartosDisponiveis(Date dataEntrada, Date dataSaida, int codHotel) {
        String sql = "SELECT q from Hotel h, ReservaHotel rh JOIN rh.quarto q where h.codigo = :codHotel and ";
        List<String> consultas = new ArrayList<>();
        consultas.add(":dataEntrada = rh.dataReserva and  :dataSaida = rh.dataSaida");
        consultas.add("rh.dataReserva between :dataEntrada and :dataSaida");
        consultas.add(":dataEntrada > rh.dataReserva and :dataSaida > rh.dataSaida and :dataEntrada < rh.dataSaida");
        consultas.add(":dataEntrada > rh.dataReserva and :dataSaida < rh.dataSaida");
        consultas.add(":dataEntrada < rh.dataReserva and :dataSaida > rh.dataSaida ");

        List<Quarto> quartos = new ArrayList<>();
        try {
            
            List<Quarto> quartosDisponiveis = new ArrayList<>();
            quartosDisponiveis = removerQuartosIndisponiveis(codHotel);

            for (String consulta : consultas) {
                Query query = em.createQuery(sql+consulta);
                query.setParameter("dataEntrada", dataEntrada);
                query.setParameter("dataSaida", dataSaida);
                query.setParameter("codHotel", codHotel);
                quartos = (List<Quarto>) query.getResultList();
                
                quartosDisponiveis.removeAll(quartos);
                quartos = new ArrayList<>();
                
            }

            

            return quartosDisponiveis;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public List<Quarto> removerQuartosIndisponiveis(int codHotel) {
        List<Quarto> quartos = new ArrayList();
        Query query = em.createQuery("select q from Hotel h JOIN h.quartos q WHERE h.codigo = :codHotel");
        query.setParameter("codHotel", codHotel);

        List<Quarto> todos = (List<Quarto>) query.getResultList();
        quartos = (List<Quarto>) query.getResultList();

        return quartos;
    }
    
    
    

    
    // Metodos da Reserva
    @Override
    public List<ReservaHotel> listarReservasPorData(Date dataReserva, String login){
        Query query = em.createQuery("select r from ReservaHotel r where r.dataReserva = :dataReserva and r.hospede.email = :login");
        query.setParameter("dataReserva", dataReserva);
        query.setParameter("login", login);
        
        List<ReservaHotel> reservaHotels = (List<ReservaHotel>) query.getResultList();
        
        for(ReservaHotel r: reservaHotels){
            r.getHotel().getQuartos().size();
        }
        
        return reservaHotels;
    }
    
    @Override
    public List<ReservaHotel> reservasHospede(String login){
        List<ReservaHotel> reservaHotels;
        Query query = em.createQuery("select r from ReservaHotel r where r.hospede.email = :email");
        query.setParameter("email", login);
        reservaHotels = (List<ReservaHotel>) query.getResultList();
        
        
        return reservaHotels;
    }
    
    
    @Override
    public ReservaHotel buscarReservaCodigo(int codigo){        
        try{
            return em.find(ReservaHotel.class, codigo);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean salvarResevar(ReservaHotel reserva) {

        try {
            em.persist(reserva);
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }
    
}
