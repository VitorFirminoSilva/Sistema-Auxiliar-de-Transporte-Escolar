/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.model;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;

/**
 *
 * @author Aluno
 */
@Embeddable
public class ViagemPK {
    @Column(name = "motorista_registro", updatable = false, insertable = false)
    private String motoristaRegistro;
    @Column(name = "numero_contrato", updatable = false, insertable = false)
    private String numeroContrato;
    
    @Column(name = "data", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;

    public ViagemPK() {
    }

    public ViagemPK(Date data) {
        this.data = data;
    }

    public String getMotoristaRegistro() {
        return motoristaRegistro;
    }

    public void setMotoristaRegistro(String motoristaRegistro) {
        this.motoristaRegistro = motoristaRegistro;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.motoristaRegistro);
        hash = 17 * hash + Objects.hashCode(this.numeroContrato);
        hash = 17 * hash + Objects.hashCode(this.data);
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
        final ViagemPK other = (ViagemPK) obj;
        if (!Objects.equals(this.motoristaRegistro, other.motoristaRegistro)) {
            return false;
        }
        if (!Objects.equals(this.numeroContrato, other.numeroContrato)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return true;
    }


}
