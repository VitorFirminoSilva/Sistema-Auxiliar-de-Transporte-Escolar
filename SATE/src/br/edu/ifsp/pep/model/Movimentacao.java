/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "movimentacao")
public class Movimentacao implements Serializable {
    @Id
    @Column(name = "idMovimentacao")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMovimentacao;
    @Column(name = "tipoMovi", nullable = false, length = 20)
    private String tipoMovi;
    @Column(name = "dataMovi", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataMovi;
    @Column(name = "valor", nullable = false)
    private double valor;
    @Column(name = "descricao", nullable = false, length = 50)
    private String descricao;
    @Column(name = "numReferencia", nullable = false)
    private Integer numReferencia;

    public int getIdMovimentacao() {
        return idMovimentacao;
    }

    public void setIdMovimentacao(int idMovimentacao) {
        this.idMovimentacao = idMovimentacao;
    }

    public String getTipoMovi() {
        return tipoMovi;
    }

    public void setTipoMovi(String tipoMovi) {
        this.tipoMovi = tipoMovi;
    }

    public Date getDataMovi() {
        return dataMovi;
    }

    public void setDataMovi(Date dataMovi) {
        this.dataMovi = dataMovi;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(Integer numReferencia) {
        this.numReferencia = numReferencia;
    }




    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.idMovimentacao;
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
        final Movimentacao other = (Movimentacao) obj;
        if (this.idMovimentacao != other.idMovimentacao) {
            return false;
        }
        return true;
    }


}
