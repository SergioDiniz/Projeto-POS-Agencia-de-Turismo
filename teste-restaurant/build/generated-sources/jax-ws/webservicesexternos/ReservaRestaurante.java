
package webservicesexternos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de reservaRestaurante complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="reservaRestaurante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataReserva" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="qtdePessoas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="restaurante" type="{http://webservicesexternos/}restaurante" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://webservicesexternos/}usuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservaRestaurante", propOrder = {
    "dataReserva",
    "id",
    "qtdePessoas",
    "restaurante",
    "usuario"
})
public class ReservaRestaurante {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataReserva;
    protected int id;
    protected int qtdePessoas;
    protected Restaurante restaurante;
    protected Usuario usuario;

    /**
     * Obtém o valor da propriedade dataReserva.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataReserva() {
        return dataReserva;
    }

    /**
     * Define o valor da propriedade dataReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataReserva(XMLGregorianCalendar value) {
        this.dataReserva = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade qtdePessoas.
     * 
     */
    public int getQtdePessoas() {
        return qtdePessoas;
    }

    /**
     * Define o valor da propriedade qtdePessoas.
     * 
     */
    public void setQtdePessoas(int value) {
        this.qtdePessoas = value;
    }

    /**
     * Obtém o valor da propriedade restaurante.
     * 
     * @return
     *     possible object is
     *     {@link Restaurante }
     *     
     */
    public Restaurante getRestaurante() {
        return restaurante;
    }

    /**
     * Define o valor da propriedade restaurante.
     * 
     * @param value
     *     allowed object is
     *     {@link Restaurante }
     *     
     */
    public void setRestaurante(Restaurante value) {
        this.restaurante = value;
    }

    /**
     * Obtém o valor da propriedade usuario.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Define o valor da propriedade usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuario(Usuario value) {
        this.usuario = value;
    }

}
