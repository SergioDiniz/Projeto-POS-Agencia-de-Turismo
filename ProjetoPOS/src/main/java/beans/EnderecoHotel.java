/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author SergioD
 */
@Embeddable
public class EnderecoHotel implements Serializable{
    @Column(nullable = false)
    private String cidade;
    @Column(nullable = false)
    private String rua;
    @Column(nullable = false)
    private String estado;

    public EnderecoHotel() {
    }

    public EnderecoHotel(String cidade, String rua, String estado) {
        this.cidade = cidade;
        this.rua = rua;
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
