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
import org.eclipse.persistence.annotations.CascadeOnDelete;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "pagamento")

public class Pagamento implements Serializable{

    @EmbeddedId
    private PagamentoPK pagamentoPK;
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPagamento;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "numeroRegistro", nullable = false, referencedColumnName = "numeroRegistro")
    private Funcionario funcionario;
    
    
    @Column(name = "data", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    @Column(name = "valor", nullable = false)
    private double valor;
    
    @Column(name = "status", nullable = false, length = 2)
    private String status;
    

    public Integer getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Integer idPagamento) {
        this.idPagamento = idPagamento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PagamentoPK getPagamentoPK() {
        return pagamentoPK;
    }

    public void setPagamentoPK(PagamentoPK pagamentoPK) {
        this.pagamentoPK = pagamentoPK;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.pagamentoPK);
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
        final Pagamento other = (Pagamento) obj;
        if (!Objects.equals(this.pagamentoPK, other.pagamentoPK)) {
            return false;
        }
        return true;
    }  
}
