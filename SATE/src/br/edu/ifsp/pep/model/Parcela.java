/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author WINDOWS10
 */
@Entity
@Table(name = "parcela")
public class Parcela implements Serializable{
    
    @EmbeddedId
    private ParcelaPK parcelaPK;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numParcela")
    private Integer numParcela;
    @Column(name = "dataVencimento", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataVencimeto;
    @Column(name = "valor", nullable = false)
    private double valor;
    @Column(name = "status", nullable = false, length = 2)
    private String status;
    
    @ManyToOne
    @JoinColumn(name = "numContrato", nullable = false, referencedColumnName = "numContrato")
    private Contrato contrato;
    

    public Integer getNumParcela() {
        return numParcela;
    }

    public void setNumParcela(Integer numParcela) {
        this.numParcela = numParcela;
    }

    public Date getDataVencimeto() {
        return dataVencimeto;
    }

    public void setDataVencimeto(Date dataVencimeto) {
        this.dataVencimeto = dataVencimeto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.numParcela);
        hash = 53 * hash + Objects.hashCode(this.contrato);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Parcela other = (Parcela) obj;
        if (!Objects.equals(this.numParcela, other.numParcela)) {
            return false;
        }
        if (!Objects.equals(this.contrato, other.contrato)) {
            return false;
        }
        return true;
    }
}
