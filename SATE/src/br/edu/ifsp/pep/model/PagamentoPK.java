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

/**
 *
 * @author WINDOWS10
 */
@Embeddable
public class PagamentoPK implements Serializable{
    @Column(name = "idPagamento", insertable = false, updatable = false)
    private Integer idPagamento;
    @Column(name = "numeroRegistro", insertable = false, updatable = false)
    private String numeroRegistro;  

    public PagamentoPK() {
    }

    public PagamentoPK(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public Integer getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Integer idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.idPagamento);
        hash = 67 * hash + Objects.hashCode(this.numeroRegistro);
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
        final PagamentoPK other = (PagamentoPK) obj;
        if (!Objects.equals(this.numeroRegistro, other.numeroRegistro)) {
            return false;
        }
        if (!Objects.equals(this.idPagamento, other.idPagamento)) {
            return false;
        }
        return true;
    }
}
