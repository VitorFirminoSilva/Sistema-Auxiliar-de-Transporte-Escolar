/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{
    @Id
    @Column(name = "cpfResponsavel", length = 14, nullable = false)
    private String cpfResponsavel; 
    @Column(name = "nomePai", length = 60, nullable = false)
    private String nomePai;
    @Column(name = "nomeMae", length = 60, nullable = false)
    private String nomeMae;
    @Column(name = "email", length = 150, nullable = false)
    private String email;
    @Column(name = "status", nullable = false)
    private boolean status;
    @Column(name = "telefone", nullable = false, length = 13)
    private String telefone;
    @Column(name = "celular", nullable = false, length = 14)
    private String celular;
    @Column(name = "endereco", nullable = false, length = 100)
    private String endereco;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Crianca> filhos;
    
    public Cliente() {
        filhos = new ArrayList<>();
        //contratos = new ArrayList<>();
    }

    public String getCpfResponsavel() {
        return cpfResponsavel;
    }

    public void setCpfResponsavel(String cpfResponsavel) {
        this.cpfResponsavel = cpfResponsavel;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nome) {
        this.nomePai = nome;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }  
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Crianca> getFilhos() {
        return filhos;
    }

    public void setFilhos(List<Crianca> filhos) {
        this.filhos = filhos;
    }

    public void addFilho(Crianca filho){
        filhos.add(filho);
    }
    
    public void removeFilho(Crianca filho){
        filhos.remove(filho);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }   

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
        
    @Override
    public String toString() {
        return "Cliente{" + "cpfResponsavel=" + cpfResponsavel + 
                ", nomePai=" + nomePai + ", nomeMae=" + nomeMae + 
                ", email=" + email + ", status=" + status;
    }
    
}
