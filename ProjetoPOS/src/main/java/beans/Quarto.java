/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    private double preço;
    @Column(nullable = false)
    private int qtdHospede;
    private boolean disponivel;
    
    @ManyToOne
    private Hotel hotel;

    public Quarto() {
    }

    public Quarto(int codigo, String tipo, double preço, int qtdHospede) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.preço = preço;
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

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getQtdHospede() {
        return qtdHospede;
    }

    public void setQtdHospede(int qtdHospede) {
        this.qtdHospede = qtdHospede;
    }
    
    
    
}
