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
 * @author Aluno
 */
@Entity
@Table(name = "vinculo")
public class Vinculo implements Serializable {
    
    @EmbeddedId
    private VinculoPK vinculoPK;
    
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
    @JoinColumn(name = "monitor_registro", nullable = false)
    private Monitor monitor;

    public VinculoPK getVinculoPK() {
        return vinculoPK;
    }

    public void setVinculoPK(VinculoPK vinculoPK) {
        this.vinculoPK = vinculoPK;
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

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.vinculoPK);
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
        final Vinculo other = (Vinculo) obj;
        if (!Objects.equals(this.vinculoPK, other.vinculoPK)) {
            return false;
        }
        return true;
    }
    
    
}
