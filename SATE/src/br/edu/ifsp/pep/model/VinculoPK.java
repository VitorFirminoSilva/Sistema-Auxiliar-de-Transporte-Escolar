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
public class VinculoPK {
    @Column(name = "motorista_registro", updatable = false, insertable = false)
    private String motoristaRegistro;
    @Column(name = "monitor_registro", updatable = false, insertable = false)
    private String monitorRegistro;
    @Column(name = "data", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;

    public VinculoPK() {
    }

    public VinculoPK(Date data) {
        this.data = data;
    }

    public String getMotoristaRegistro() {
        return motoristaRegistro;
    }

    public void setMotoristaRegistro(String motoristaRegistro) {
        this.motoristaRegistro = motoristaRegistro;
    }

    public String getMonitorRegistro() {
        return monitorRegistro;
    }

    public void setMonitorRegistro(String monitorRegistro) {
        this.monitorRegistro = monitorRegistro;
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
        hash = 89 * hash + Objects.hashCode(this.motoristaRegistro);
        hash = 89 * hash + Objects.hashCode(this.monitorRegistro);
        hash = 89 * hash + Objects.hashCode(this.data);
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
        final VinculoPK other = (VinculoPK) obj;
        if (!Objects.equals(this.motoristaRegistro, other.motoristaRegistro)) {
            return false;
        }
        if (!Objects.equals(this.monitorRegistro, other.monitorRegistro)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return true;
    }

       
}
