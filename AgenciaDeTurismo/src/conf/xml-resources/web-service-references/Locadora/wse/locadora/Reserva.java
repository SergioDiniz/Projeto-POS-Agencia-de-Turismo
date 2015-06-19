
package wse.locadora;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de reserva complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="reserva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carro" type="{http://service.pos.com/}carro" minOccurs="0"/>
 *         &lt;element name="dataFim" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="locadora" type="{http://service.pos.com/}locadora" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://service.pos.com/}usuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserva", propOrder = {
    "carro",
    "dataFim",
    "dataInicio",
    "id",
    "locadora",
    "usuario"
})
public class Reserva {

    protected Carro carro;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFim;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicio;
    protected int id;
    protected Locadora locadora;
    protected Usuario usuario;

    /**
     * Obtém o valor da propriedade carro.
     * 
     * @return
     *     possible object is
     *     {@link Carro }
     *     
     */
    public Carro getCarro() {
        return carro;
    }

    /**
     * Define o valor da propriedade carro.
     * 
     * @param value
     *     allowed object is
     *     {@link Carro }
     *     
     */
    public void setCarro(Carro value) {
        this.carro = value;
    }

    /**
     * Obtém o valor da propriedade dataFim.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFim() {
        return dataFim;
    }

    /**
     * Define o valor da propriedade dataFim.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFim(XMLGregorianCalendar value) {
        this.dataFim = value;
    }

    /**
     * Obtém o valor da propriedade dataInicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicio() {
        return dataInicio;
    }

    /**
     * Define o valor da propriedade dataInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicio(XMLGregorianCalendar value) {
        this.dataInicio = value;
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
     * Obtém o valor da propriedade locadora.
     * 
     * @return
     *     possible object is
     *     {@link Locadora }
     *     
     */
    public Locadora getLocadora() {
        return locadora;
    }

    /**
     * Define o valor da propriedade locadora.
     * 
     * @param value
     *     allowed object is
     *     {@link Locadora }
     *     
     */
    public void setLocadora(Locadora value) {
        this.locadora = value;
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
