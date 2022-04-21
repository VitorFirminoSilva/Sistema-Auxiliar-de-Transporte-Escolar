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
 * @author Aluno
 */
@Entity
@Table(name = "viagem")
public class Viagem implements Serializable{

    @EmbeddedId
    private ViagemPK viagemPK;    
    
    @ManyToOne
    @JoinColumn(name = "numero_contrato", nullable = false)
    private Contrato contrato;

    @ManyToOne
    @JoinColumn(name = "motorista_registro", nullable = false)
    private Motorista motorista;

    public ViagemPK getViagemPK() {
        return viagemPK;
    }

    public void setViagemPK(ViagemPK viagemPK) {
        this.viagemPK = viagemPK;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.viagemPK);
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
        final Viagem other = (Viagem) obj;
        if (!Objects.equals(this.viagemPK, other.viagemPK)) {
            return false;
        }
        return true;
    }
}
