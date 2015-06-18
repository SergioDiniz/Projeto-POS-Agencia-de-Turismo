/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.restaurant;

import webservicesexternos.Restaurante;

/**
 *
 * @author SergioD
 */
public class TesteRestaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(Restaurante r : buscarRestaurantesPorCidade("João Pessoa")){
            System.out.println(r.getNome());
        }
        
    }

    private static java.util.List<webservicesexternos.Restaurante> buscarRestaurantesPorCidade(java.lang.String cidade) {
        webservicesexternos.WSReservaRestaurante_Service service = new webservicesexternos.WSReservaRestaurante_Service();
        webservicesexternos.WSReservaRestaurante port = service.getWSReservaRestaurantePort();
        return port.buscarRestaurantesPorCidade(cidade);
    }
    
}
