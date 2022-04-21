/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author WINDOWS10
 */
@Entity
@Table(name = "contrato")
public class Contrato implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numContrato")
    private Integer numContrato;
    @Column(name = "dataInicio", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInicio;
    @Column(name = "dataFim", nullable = false)    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataFim;
    @Column(name = "valorContrato", nullable = false)
    private double valorContrato;
    
    @ManyToOne
    @JoinColumn(name = "codCrianca", nullable = false, referencedColumnName = "codCrianca")
    private Crianca crianca;
    
    @OneToMany(mappedBy = "contrato", cascade = CascadeType.ALL)
    private List<Parcela> parcelas;
    

    @OneToOne
    @JoinColumn(name = "localOrigem", nullable = false, referencedColumnName = "idLocal")
    private Local localOrigem;
    
    @OneToOne
    @JoinColumn(name = "localDestino", nullable = false, referencedColumnName = "idLocal")
    private Local localDestino;

    @OneToMany(mappedBy = "contrato")
    private List<Viagem> viagens;

    public Contrato() {
        this.parcelas = new ArrayList<>();
        this.viagens = new ArrayList<>();
    }

    public Local getLocalOrigem() {
        return localOrigem;
    }

    public void setLocalOrigem(Local localOrigem) {
        this.localOrigem = localOrigem;
    }

    public Local getLocalDestino() {
        return localDestino;
    }

    public void setLocalDestino(Local localDestino) {
        this.localDestino = localDestino;
    }

    public List<Viagem> getViagens() {
        return viagens;
    }

    public void setViagens(List<Viagem> viagens) {
        this.viagens = viagens;
    }
    
        
    public Integer getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(Integer numContrato) {
        this.numContrato = numContrato;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public Crianca getCrianca() {
        return crianca;
    }

    public void setCrianca(Crianca crianca) {
        this.crianca = crianca;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Parcela> parcelas) {
        this.parcelas = parcelas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.numContrato);
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
        final Contrato other = (Contrato) obj;
        if (!Objects.equals(this.numContrato, other.numContrato)) {
            return false;
        }
        return true;
    }
    
    
}
