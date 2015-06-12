package interfaces;

import beans.Quarto;
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
    
}
