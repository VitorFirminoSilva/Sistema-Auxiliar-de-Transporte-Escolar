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
 * @author WINDOWS10
 */
@Embeddable
public class HistoricoUtilizacaoPK {
    
    @Column(name = "motorista_registro", updatable = false, insertable = false)
    private String motoristaRegistro;
    @Column(name = "veiculo_chassis", updatable = false, insertable = false)
    private String veiculoChassis;
    
    @Column(name = "data", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;

    public HistoricoUtilizacaoPK() {
    }

    public HistoricoUtilizacaoPK(Date data) {
        this.data = data;
    }

    public String getMotoristaRegistro() {
        return motoristaRegistro;
    }

    public void setMotoristaRegistro(String motoristaRegistro) {
        this.motoristaRegistro = motoristaRegistro;
    }

    public String getVeiculoChassis() {
        return veiculoChassis;
    }

    public void setVeiculoChassis(String veiculoChassis) {
        this.veiculoChassis = veiculoChassis;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.motoristaRegistro);
        hash = 47 * hash + Objects.hashCode(this.veiculoChassis);
        hash = 47 * hash + Objects.hashCode(this.data);
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
        final HistoricoUtilizacaoPK other = (HistoricoUtilizacaoPK) obj;
        if (!Objects.equals(this.motoristaRegistro, other.motoristaRegistro)) {
            return false;
        }
        if (!Objects.equals(this.veiculoChassis, other.veiculoChassis)) {
            return false;
        }
        return true;
    }
}
