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

    public Hotel buscarHotel(int numero);

    public List<Hotel> buscarTodosCidade(String cidade);

    public List<Hotel> todosOsHoteis();
    
    public boolean atualizarHotel(Hotel hotel);
    
    public boolean removerHotel(Hotel hotel);
}
