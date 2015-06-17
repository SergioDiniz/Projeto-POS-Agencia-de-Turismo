package interfaces;

import beans.Quarto;
import beans.TipoQuato;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Fatinha
 */

@Remote
public interface DaoQuartoIT {
    
    public boolean salvar(Quarto quarto);

    public Quarto buscarQuarto(int numero);

    public boolean atualizar(Quarto quarto);

    public boolean removerQuarto(Quarto quarto);
    
    public List<Quarto> todosQuatosPorHotel(int codHotel);
    
    public List<Quarto> todosQuatosPorHotelAdmin(int codHotel);
    
    public List<TipoQuato> tiposDeQuatosPorHotel(int codHotel);
        
    public List<Quarto> quartosDisponiveis(Date dataEntrada, Date dataSaida, int codHotel);
    
}
