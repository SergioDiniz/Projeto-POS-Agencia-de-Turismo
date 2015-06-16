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
@Entity
public class Gerente implements Serializable{
    
    @Id @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String senha;

    public Gerente() {
    }

    public Gerente(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
