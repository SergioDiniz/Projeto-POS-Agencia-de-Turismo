package interfaces;

import beans.Hotel;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Fatinha
 */

@Remote
public interface DaoHotelIT {
    
    public boolean salvar(Hotel hotel);

    public Hotel buscarQuarto(int numero);

    public List<Hotel> buscarTodos(String cidade);

    public List<Hotel> todosOsHoteis();
}
