/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;


import fachada.Fachada;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import ws.Hospede;

/**
 *
 * @author SergioD
 */
@ManagedBean(name = "controladorHospede")
@SessionScoped
public class ControladorHospede implements Serializable{
   
    @EJB
    private Fachada fachada;

    private Hospede hospede;
    private Hospede hospedeCadastro;

    
    public ControladorHospede() {
        this.hospede = new Hospede();
        this.hospedeCadastro = new Hospede();
    }
    
    
//    public String login(){
//        try {
//            this.hospede = fachada.login(this.hospede.getEmail(), this.hospede.getSenha());
//            return null;
//        } catch (Exception e) {
//            return null;
//        }
//
//    }
    
    public String sair(){
        this.hospede = new Hospede();
        return null;
    }
    
    
    public String cadastro(){
        System.out.println("cadastro");
        try {
            fachada.salvarHospede(hospedeCadastro);
//            this.hospede = fachada.buscarHospede(this.hospedeCadastro.getEmail());
            this.hospedeCadastro = new Hospede();
            System.out.println("cadastro sucesso");
            
            
            
            return null;
        } catch (Exception e) {
            System.out.println("erro cadastro");
            return null;
        }
    }
    
    
    

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Hospede getHospedeCadastro() {
        return hospedeCadastro;
    }

    public void setHospedeCadastro(Hospede hospedeCadastro) {
        this.hospedeCadastro = hospedeCadastro;
    }
    
    
      
    
    
    
}
