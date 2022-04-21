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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "crianca")
public class Crianca implements Serializable {
    @Id
    @Column(name = "codCrianca", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codCrianca;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "dataNascimento", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;  
    @Column(name = "status", nullable = false)
    private boolean status;
    
    @ManyToOne
    @JoinColumn(name = "cpfResponsavel", nullable = false, referencedColumnName = "cpfResponsavel")
    private Cliente cliente;

    @OneToMany(mappedBy = "crianca", cascade = CascadeType.ALL)
    private List<Contrato> contratos;
    
    public Crianca() {
        contratos = new ArrayList<>();
    }

    public int getCodCrianca() {
        return codCrianca;
    }

    public void setCodCrianca(int codCrianca) {
        this.codCrianca = codCrianca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }
    
    @Override
    public String toString() {
        return "Crianca: " + "codCrianca=" + codCrianca + ", dataNascimento=" + dataNascimento + ", nomePai=" + cliente.getNomePai() + ", nomeMae=" + cliente.getNomeMae();
    }    
}
