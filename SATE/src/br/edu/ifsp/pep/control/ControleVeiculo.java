/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.control;

import br.edu.ifsp.pep.model.Veiculo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Aluno
 */
public class ControleVeiculo extends ControleGenerico<Veiculo>{
    
    public ControleVeiculo() {
        super(Veiculo.class);
    }
    
    public List<Veiculo> findByModelo(String modelo){
        EntityManager em = getEm();
        TypedQuery<Veiculo> query = em.createQuery("SELECT v FROM Veiculo v WHERE v.modelo like :modelo AND v.status = true", Veiculo.class);
        query.setParameter("modelo", "%" + modelo + "%");
        return query.getResultList();
    }
    
    public Veiculo findByChassis(String chassis){
        EntityManager em = getEm();
        TypedQuery<Veiculo> query = em.createQuery("SELECT v FROM Veiculo v WHERE v.chassis like :chassis AND v.status = true", Veiculo.class);
        query.setParameter("chassis", chassis);
        return query.getSingleResult();
    }
    
}
