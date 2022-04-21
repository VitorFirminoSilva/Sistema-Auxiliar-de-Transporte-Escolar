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
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "funcionario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING)
public class Funcionario implements Serializable {
    @Id
    @Column(name = "numeroRegistro", nullable = false, length = 20)
    private String numeroRegistro;
    @Column(name = "nomeFuncionario", nullable = false, length = 60)
    private String nomeFuncionario;
    @Column(name = "sexo", nullable = false)
    private String sexo;
    @Column(name = "cpf", nullable = false, length = 14)
    private String cpf;
    @Column(name = "dataNascimento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Column(name = "naturalidade", length = 20)
    private String naturalidade;
    @Column(name = "nomePai", nullable = false, length = 60)
    private String nomePai;
    @Column(name = "nomeMae", nullable = false, length = 60)
    private String nomeMae;
    @Column(name = "escolaridade", length = 50)
    private String escolaridade;
    @Column(name = "estadoCivil", length = 20)
    private String estadoCivil;
    @Column(name = "email", nullable = false, length = 150)
    private String email;
    @Column(name = "endereco", nullable = false, length = 50)
    private String endereco;
    @Column(name = "salarioBase", nullable = false)
    private double salarioBase;
    @Column(name = "status", nullable = false)
    private boolean status;
    @Column(name = "numeroConta", nullable = false, length = 18)
    private String numeroConta;

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
    private List<Pagamento> pagamentos;

    public Funcionario() {
        this.pagamentos = new ArrayList<>();
    }


    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }
    
    
    
    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    
    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    public double retornaSalario(){
        return this.salarioBase;
    }
    public void addPagamentos(Pagamento pagamento){
        this.pagamentos.add(pagamento);
    }
    
}
