package beans;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author SergioD
 */
@Entity
public class Quarto implements Serializable{
    @Id @Column(nullable = false)
    private int codigo;
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

    public Quarto(int codigo, String tipo, double preco, int qtdHospede) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.preco = preco;
        this.qtdHospede = qtdHospede;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
