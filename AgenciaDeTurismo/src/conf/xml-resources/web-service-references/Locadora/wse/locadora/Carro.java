
package wse.locadora;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de carro complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="carro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ano" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="disponivel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="locadora" type="{http://service.pos.com/}locadora" minOccurs="0"/>
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carro", propOrder = {
    "ano",
    "disponivel",
    "id",
    "locadora",
    "modelo",
    "placa",
    "valor"
})
public class Carro {

    protected int ano;
    protected boolean disponivel;
    protected int id;
    protected Locadora locadora;
    protected String modelo;
    protected String placa;
    protected float valor;

    /**
     * Obtém o valor da propriedade ano.
     * 
     */
    public int getAno() {
        return ano;
    }

    /**
     * Define o valor da propriedade ano.
     * 
     */
    public void setAno(int value) {
        this.ano = value;
    }

    /**
     * Obtém o valor da propriedade disponivel.
     * 
     */
    public boolean isDisponivel() {
        return disponivel;
    }

    /**
     * Define o valor da propriedade disponivel.
     * 
     */
    public void setDisponivel(boolean value) {
        this.disponivel = value;
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
     * Obtém o valor da propriedade modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define o valor da propriedade modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Obtém o valor da propriedade placa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Define o valor da propriedade placa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     */
    public float getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     */
    public void setValor(float value) {
        this.valor = value;
    }

}
