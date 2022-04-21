/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author Aluno
 */
@Entity
@DiscriminatorValue("monitor")
public class Monitor extends Funcionario{

    @OneToMany(mappedBy = "monitor")
    private List<Vinculo> vinculos;
    
    @Column(name = "registroPedagogico", length = 30)
    private String registroPedagogico;

    public String getRegistroPedagogico() {
        return registroPedagogico;
    }

    public void setRegistroPedagogico(String registroPedagogico) {
        this.registroPedagogico = registroPedagogico;
    }

    
    @Override
    public double retornaSalario(){
        return this.getSalarioBase();
    }
}
