/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Aluno
 */
@Entity
@DiscriminatorValue("motorista")
public class Motorista extends Funcionario{

    @Column(name = "cnh")
    private String cnh;
    
    @OneToMany(mappedBy = "motorista")
    private List<Vinculo> vinculos;

    @OneToMany(mappedBy = "motorista")
    private List<HistoricoUtilizacao> historicos;
    
    @OneToMany(mappedBy = "motorista")
    private List<Viagem> viagens;
    
    public Motorista() {
        vinculos = new ArrayList<>();
        historicos = new ArrayList<>();
        viagens = new ArrayList<>();
    }
   
    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public double retornaSalario(){
        return this.getSalarioBase();
    }

    public List<Vinculo> getVinculos() {
        return vinculos;
    }

    public void setVinculos(Vinculo vinculo) {
        this.vinculos.add(vinculo);
    }
}
