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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "manutencao")

public class Manutencao implements Serializable {
    
    @EmbeddedId
    private ManutencaoPK manutencaoPK;
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @ManyToOne
    @JoinColumn(name = "numChassi", nullable = false ,referencedColumnName = "chassis")
    private Veiculo veiculo;
    
    @Column(name = "descricao", nullable = false, length = 150)
    private String descricao;
    @Column(name = "dataManutencao", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataManutencao;
    @Column(name = "tipoManutencao", nullable = false, length = 30)
    private String tipoManutencao;
    @Column(name = "valor", nullable = false)
    private double valor;
    
    @Column(name = "status", nullable = false, length = 2)
    private String status;
        

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataManutencao() {
        return dataManutencao;
    }

    public void setDataManutencao(Date dataManutencao) {
        this.dataManutencao = dataManutencao;
    }

    public String getTipoManutencao() {
        return tipoManutencao;
    }

    public void setTipoManutencao(String tipoManutencao) {
        this.tipoManutencao = tipoManutencao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ManutencaoPK getManutencaoPK() {
        return manutencaoPK;
    }

    public void setManutencaoPK(ManutencaoPK manutencaoPK) {
        this.manutencaoPK = manutencaoPK;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.manutencaoPK);
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
        final Manutencao other = (Manutencao) obj;
        if (!Objects.equals(this.manutencaoPK, other.manutencaoPK)) {
            return false;
        }
        return true;
    }
}
