/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author WINDOWS10
 */
@Entity
@Table(name = "historicoUtilizacao")
public class HistoricoUtilizacao implements Serializable{

    @EmbeddedId
    private HistoricoUtilizacaoPK historicoPK;
    
    @Column(name = "horarioInicio", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date horarioInicio;
    @Column(name = "horarioFim")
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date horarioFim;
    @Column(name = "horarioPrevisto", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date horarioPrevisto;
    
    @ManyToOne
    @JoinColumn(name = "motorista_registro", nullable = false)
    private Motorista motorista;
    
    @ManyToOne
    @JoinColumn(name = "veiculo_chassis", nullable = false)
    private Veiculo veiculo;

    public HistoricoUtilizacaoPK getHistoricoPK() {
        return historicoPK;
    }

    public void setHistoricoPK(HistoricoUtilizacaoPK historicoPK) {
        this.historicoPK = historicoPK;
    }

    public Date getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Date horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Date getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(Date horarioFim) {
        this.horarioFim = horarioFim;
    }

    public Date getHorarioPrevisto() {
        return horarioPrevisto;
    }

    public void setHorarioPrevisto(Date horarioPrevisto) {
        this.horarioPrevisto = horarioPrevisto;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.historicoPK);
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
        final HistoricoUtilizacao other = (HistoricoUtilizacao) obj;
        if (!Objects.equals(this.historicoPK, other.historicoPK)) {
            return false;
        }
        return true;
    } 
}
