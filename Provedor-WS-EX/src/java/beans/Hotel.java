package beans;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Fatinha
 */

@Entity
public class Hotel implements Serializable{

    @Id @Column(nullable = false)
    private int codigo;
    @Column(nullable = false, unique = true)
    private String nome;
    @Embedded
    private EnderecoHotel enderecoHotel;
    
    
    @OneToMany(fetch = FetchType.EAGER)
    private List<Quarto> quartos;
    
    @OneToOne
    private Gerente gerente;
    
    public Hotel() {
    }

    public Hotel(String nome, EnderecoHotel enderecoHotel, List<Quarto> quartos, Gerente gerente) {
        this.nome = nome;
        this.enderecoHotel = enderecoHotel;
        this.quartos = quartos;
        this.gerente = gerente;
    }


    public Hotel(EnderecoHotel enderecoHotel) {
        this.enderecoHotel = enderecoHotel;
        this.gerente = new Gerente("admin", "123");
    }

    public EnderecoHotel getEnderecoHotel() {
        return enderecoHotel;
    }
    
    public void setEnderecoHotel(EnderecoHotel enderecoHotel) {
        this.enderecoHotel = enderecoHotel;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
}
