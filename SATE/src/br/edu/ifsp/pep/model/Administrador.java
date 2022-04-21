/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.model;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
/**
 *
 * @author Aluno
 */
@Entity
@DiscriminatorValue("administrador")
public class Administrador extends Funcionario{
    @Column(name = "usuario", length = 50)
    private String usuario;
    @Column(name = "senha", length = 32)
    private String senha;


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public double retornaSalario(){
        return getSalarioBase();
    }
}
