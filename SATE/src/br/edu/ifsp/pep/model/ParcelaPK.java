/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Richard
 */
@Embeddable
public class ParcelaPK {
    @Column(name = "numParcela", updatable = false, insertable = false)
    private Integer numParcela;
    @Column(name = "numContrato", updatable = false, insertable = false)
    private Integer numContrato;

    public ParcelaPK() {
    }

    public Integer getNumParcela() {
        return numParcela;
    }

    public void setNumParcela(Integer numParcela) {
        this.numParcela = numParcela;
    }

    public Integer getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(Integer numContrato) {
        this.numContrato = numContrato;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.numParcela);
        hash = 47 * hash + Objects.hashCode(this.numContrato);
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
        final ParcelaPK other = (ParcelaPK) obj;
        if (!Objects.equals(this.numParcela, other.numParcela)) {
            return false;
        }
        if (!Objects.equals(this.numContrato, other.numContrato)) {
            return false;
        }
        return true;
    }
    
    
}
