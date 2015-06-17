package teste.restaurante;

import java.util.List;
import webservicesexternos.Restaurante;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SergioD
 */
public class NewClass {
    public static void main(String[] args) {
        
        
        
        
        
        List<Restaurante> restaurantes = buscarRestaurantesPorCidade("João Pessoa");
        
        for(Restaurante r : restaurantes){
            System.out.println(r.getNome());
        }
        
    }

    private static java.util.List<webservicesexternos.Restaurante> buscarRestaurantesPorCidade(java.lang.String cidade) {
        webservicesexternos.WSReservaRestaurante_Service service = new webservicesexternos.WSReservaRestaurante_Service();
        webservicesexternos.WSReservaRestaurante port = service.getWSReservaRestaurantePort();
        return port.buscarRestaurantesPorCidade(cidade);
    }
}
