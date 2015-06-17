/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.cal;

/**
 *
 * @author SergioD
 */
public class TesteCal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(percentual(5, 10));
    }

    private static double percentual(double x, double y) {
        webservices.CalcWS_Service service = new webservices.CalcWS_Service();
        webservices.CalcWS port = service.getCalcWSPort();
        return port.percentual(x, y);
    }
    
}
