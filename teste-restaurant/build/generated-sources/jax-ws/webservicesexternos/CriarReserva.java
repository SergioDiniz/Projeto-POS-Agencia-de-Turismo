
package webservicesexternos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de criarReserva complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="criarReserva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reserva" type="{http://webservicesexternos/}reservaRestaurante" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "criarReserva", propOrder = {
    "reserva"
})
public class CriarReserva {

    protected ReservaRestaurante reserva;

    /**
     * Obtém o valor da propriedade reserva.
     * 
     * @return
     *     possible object is
     *     {@link ReservaRestaurante }
     *     
     */
    public ReservaRestaurante getReserva() {
        return reserva;
    }

    /**
     * Define o valor da propriedade reserva.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservaRestaurante }
     *     
     */
    public void setReserva(ReservaRestaurante value) {
        this.reserva = value;
    }

}
