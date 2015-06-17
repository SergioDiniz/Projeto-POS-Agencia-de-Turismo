package beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Fatinha
 */

@Entity
public class Quarto implements Serializable{
    
    
    @Id @Column(nullable = false)
    private int numero;
    @Column(nullable = false)
    private String tipo;
    @Column(nullable = false)
    private double preco;
    @Column(nullable = false)
    private int qtdHospede;
    private boolean disponivel;
    
    public Quarto() {
    }

    public Quarto(int numero, String tipo, double preco, int qtdHospede) {
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
        this.qtdHospede = qtdHospede;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdHospede() {
        return qtdHospede;
    }

    public void setQtdHospede(int qtdHospede) {
        this.qtdHospede = qtdHospede;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Quarto other = (Quarto) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }
    
    
    
}
