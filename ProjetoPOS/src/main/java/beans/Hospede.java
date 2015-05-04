/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author SergioD
 */
@Entity
public class Hospede implements Serializable{
    @Id @Column(nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String senha;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String nome;
    
    
    @OneToMany(mappedBy = "hospede")
    private List<Reserva> reservas;
    
    
    public Hospede() {
    }

    public Hospede(String cpf, String senha, String email, String nome) {
        this.cpf = cpf;
        this.senha = senha;
        this.email = email;
        this.nome = nome;
    }
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
