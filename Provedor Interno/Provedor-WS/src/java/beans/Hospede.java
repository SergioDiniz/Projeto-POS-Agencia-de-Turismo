package beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Fatinha
 */

@Entity
public class Hospede implements Serializable{
    
    @Column(nullable = false)
    private String senha;
    @Column(nullable = false)
    @Id private String email;
    @Column(nullable = false)
    private String nome;
    
    public Hospede() {
    }

    public Hospede(String senha, String email, String nome) {
        this.senha = senha;
        this.email = email;
        this.nome = nome;
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
