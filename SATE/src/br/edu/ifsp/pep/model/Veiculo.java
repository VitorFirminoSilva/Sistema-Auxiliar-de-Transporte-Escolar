/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "veiculo")
public class Veiculo implements Serializable {
    @Id
    @Column(name = "chassis", nullable = false)
    private String chassis;
    @Column(name = "modelo", nullable = false)
    private String modelo;
    @Column(name = "placa", nullable = false)
    private String placa;
    @Column(name = "qtdAssentos", nullable = false)
    private int qtdAssentos;
    @Column(name = "quilometragem", nullable = false)
    private int quilometragem;
    @Column(name = "condicao", nullable = false)
    private String condicao;
    @Column(name = "status", nullable = false)
    private boolean status;
    @OneToMany(mappedBy = "veiculo", cascade = CascadeType.ALL)
    private List<Manutencao> listaManutencoes;
    
    @OneToMany(mappedBy = "veiculo")
    private List<HistoricoUtilizacao> historicos;

    public Veiculo() {
        listaManutencoes = new ArrayList<>();
        historicos = new ArrayList<>();
    }

    public List<HistoricoUtilizacao> getHistoricos() {
        return historicos;
    }

    public void setHistoricos(List<HistoricoUtilizacao> historicos) {
        this.historicos = historicos;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQtdAssentos() {
        return qtdAssentos;
    }

    public void setQtdAssentos(int qtdAssentos) {
        this.qtdAssentos = qtdAssentos;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Manutencao> getListaManutencoes() {
        return listaManutencoes;
    }

    public void setListaManutencoes(List<Manutencao> listaManutencoes) {
        this.listaManutencoes = listaManutencoes;
    }
    
    public void addManutencao(Manutencao manutencao){
        listaManutencoes.add(manutencao);
    }
    

    @Override
    public String toString() {
        return "Veiculo{" + "chassis=" + chassis + ", modelo=" + modelo + ", placa=" + placa + ", qtdAssentos=" + qtdAssentos + ", quilometragem=" + quilometragem + ", condicao=" + condicao + ", status=" + status + '}';
    }   
}
