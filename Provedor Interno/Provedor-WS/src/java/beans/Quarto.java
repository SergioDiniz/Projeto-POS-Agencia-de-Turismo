package beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
    
    @ManyToOne
    private Hotel hotel;
    
    @OneToOne(mappedBy = "quarto")
    private Reserva reserva;

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

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
