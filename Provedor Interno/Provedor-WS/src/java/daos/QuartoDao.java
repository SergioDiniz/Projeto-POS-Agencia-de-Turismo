package daos;

import beans.Hotel;
import beans.Quarto;
import beans.TipoQuato;
import interfaces.DaoQuartoIT;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Fatinha
 */
@Stateless
public class QuartoDao implements DaoQuartoIT {

    @PersistenceContext(unitName = "Provedor-WSPU")
    private EntityManager em;

    @Override
    public boolean salvar(Quarto quarto) {

        try {
            em.persist(quarto);
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    @Override
    public Quarto buscarQuarto(int numero) {
        Quarto quarto = new Quarto();
        try {
            quarto = em.find(Quarto.class, numero);
            return quarto;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean atualizar(Quarto quarto) {

        try {
            em.merge(quarto);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean removerQuarto(Quarto quarto) {

        try {
            em.remove(em.merge(quarto));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Quarto> todosQuatosPorHotel(int codHotel) {
        List<Quarto> quartos;
        try {
            Query query = em.createQuery("select q from Hotel h JOIN h.quartos q where h.codigo = :codigo and q.disponivel = true");
            query.setParameter("codigo", codHotel);
            quartos = (List<Quarto>) query.getResultList();

            return quartos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Quarto> todosQuatosPorHotelAdmin(int codHotel) {
        List<Quarto> quartos;
        try {
            Query query = em.createQuery("select q from Hotel h JOIN h.quartos q where h.codigo = :codigo");
            query.setParameter("codigo", codHotel);
            quartos = (List<Quarto>) query.getResultList();

            return quartos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<TipoQuato> tiposDeQuatosPorHotel(int codHotel) {
        List<TipoQuato> quartos = new ArrayList<TipoQuato>();
        try {
            Query query = em.createQuery("SELECT DISTINCT q.tipo, q.qtdHospede, CAST(COUNT(q.qtdHospede) as int), q.preco from Hotel h JOIN h.quartos q WHERE h.codigo = :codigo and q.disponivel = true GROUP BY q.tipo, q.preco, q.qtdHospede");
            query.setParameter("codigo", codHotel);
            List resultado = query.getResultList();

            Iterator i = resultado.iterator();
            while (i.hasNext()) {
                Object[] o = (Object[]) i.next();
                TipoQuato tpQuato = new TipoQuato((String) o[0],
                        (int) o[1],
                        (int) o[2],
                        (double) o[3]);

                quartos.add(tpQuato);
            }

            return quartos;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Quarto> quartosDisponiveis(Date dataEntrada, Date dataSaida, int codHotel) {
        String sql = "SELECT q from Hotel h, ReservaHotel rh JOIN rh.quarto q where q.disponivel = TRUE and h.codigo = :codHotel and ";
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
                Query query = em.createQuery(sql + consulta);
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

}
