/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;


/**
 *
 * @author WINDOWS10
 */
@Embeddable
public class ManutencaoPK {
    @Column(name = "codigo",insertable = false, updatable = false)
    private Integer codigo;
    @Column(name = "numChassi",insertable = false, updatable = false)
    private String numChassi;

    public ManutencaoPK() {
    }

    public ManutencaoPK(String numChassi) {
        this.numChassi = numChassi;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(String numChassi) {
        this.numChassi = numChassi;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.codigo);
        hash = 47 * hash + Objects.hashCode(this.numChassi);
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
        final ManutencaoPK other = (ManutencaoPK) obj;
        if (!Objects.equals(this.numChassi, other.numChassi)) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }


}
