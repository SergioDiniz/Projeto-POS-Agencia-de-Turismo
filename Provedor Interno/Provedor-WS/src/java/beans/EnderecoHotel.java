package beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Fatinha
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
