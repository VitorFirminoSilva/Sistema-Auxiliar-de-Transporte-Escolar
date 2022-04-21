/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.control;

import br.edu.ifsp.pep.model.Monitor;
import br.edu.ifsp.pep.model.Motorista;
import br.edu.ifsp.pep.model.Vinculo;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Aluno
 */
public class ControleVinculo extends ControleGenerico<Vinculo>{
    
    public ControleVinculo() {
        super(Vinculo.class);
    }
    
    public List<Vinculo> findByAtual(){
        EntityManager em = getEm();
        TypedQuery<Vinculo> query = em.createQuery("SELECT v FROM Vinculo v WHERE v.vinculoPK.data = :data and v.horarioFim is null", Vinculo.class);
        query.setParameter("data", new Date());
        return query.getResultList();
    }
    
    public Vinculo findByRegistros(Motorista motorista, Monitor monitor){
        EntityManager em = getEm();
        TypedQuery<Vinculo> query = em.createQuery("SELECT v FROM Vinculo v WHERE v.motorista = :motorista and v.monitor = :monitor and v.vinculoPK.data = :data", Vinculo.class);
        query.setParameter("motorista", motorista);
        query.setParameter("monitor", monitor);
        query.setParameter("data", new Date());
        return query.getSingleResult();
    }
    
}
