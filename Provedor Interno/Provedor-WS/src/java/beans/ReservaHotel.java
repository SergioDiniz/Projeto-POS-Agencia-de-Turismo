package beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Fatinha
 */

@Entity
public class ReservaHotel implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @Temporal(TemporalType.DATE)
    private Date dataSaida;
    @Temporal(TemporalType.DATE)
    private Date dataReserva;
    private float valorReserva;

    @ManyToOne
    private Hospede hospede;
    @OneToOne
    private Hotel hotel;
    @OneToOne
    private Quarto quarto;

    public ReservaHotel() {
    }

    public ReservaHotel(Date dataSaida, Date dataReserva, float valorReserva, Quarto quarto, Hospede hospede, Hotel hotel) {
        this.dataSaida = dataSaida;
        this.dataReserva = dataReserva;
        this.valorReserva = valorReserva;
        this.quarto = quarto;
        this.hospede = hospede;
        this.hotel = hotel;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public float getValorReserva() {
        return valorReserva;
    }

    public void setValorReserva(float valorReserva) {
        this.valorReserva = valorReserva;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
