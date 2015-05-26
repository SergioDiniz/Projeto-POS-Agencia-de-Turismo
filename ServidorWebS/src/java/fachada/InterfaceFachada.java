/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import beans.Hospede;
import beans.Hotel;
import beans.Quarto;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author SergioD
 */
@Remote
public interface InterfaceFachada {
    
    public Hospede login(String email, String senha);
    
    public boolean salvarHospede(Hospede hospede);
    
    public Hospede buscarHospede(String email);
    
    public boolean cadastrarHotel(Hotel hotel);
    
    public List<Hotel> todosOsHoteis();
    
    public boolean salvarQuarto(Quarto quarto);
    
    public Quarto buscarQuarto(int numero);
    
}
