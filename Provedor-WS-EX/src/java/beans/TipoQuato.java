/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author SergioD
 */
public class TipoQuato {
    private String tipo;
    private int qtdHospede;
    private int numeroVagas;
    private double preco;

    public TipoQuato() {
    }

    public TipoQuato(String tipo, int qtdHospede, int numeroVagas, double preco) {
        this.tipo = tipo;
        this.qtdHospede = qtdHospede;
        this.numeroVagas = numeroVagas;
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQtdHospede() {
        return qtdHospede;
    }

    public void setQtdHospede(int qtdHospede) {
        this.qtdHospede = qtdHospede;
    }

    public int getNumeroVagas() {
        return numeroVagas;
    }

    public void setNumeroVagas(int numeroVagas) {
        this.numeroVagas = numeroVagas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
