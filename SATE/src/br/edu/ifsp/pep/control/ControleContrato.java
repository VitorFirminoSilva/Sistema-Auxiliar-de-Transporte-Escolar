/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.control;

import br.edu.ifsp.pep.model.Contrato;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author WINDOWS10
 */
public class ControleContrato extends ControleGenerico<Contrato>{
    
    public ControleContrato() {
        super(Contrato.class);
    }
    
    public Contrato findByNumContrato(Integer numero){
        EntityManager em = getEm();
        TypedQuery<Contrato> query = em.createQuery("SELECT c FROM Contrato c WHERE c.numContrato = :numContrato", Contrato.class);
        query.setParameter("numContrato", numero);
        return query.getSingleResult();
    }
    
    public List<Contrato> findByCriancaNome(String nome){
        EntityManager em = getEm();
        TypedQuery<Contrato> query = em.createQuery("SELECT c FROM Contrato c WHERE c.crianca.nome LIKE :nomeCrianca", Contrato.class);
        query.setParameter("nomeCrianca", "%" + nome + "%");
        return query.getResultList();
    }
    
    
    public List<Contrato> findByCriancaCodigo(Integer codigo){
        EntityManager em = getEm();
        TypedQuery<Contrato> query = em.createQuery("SELECT c FROM Contrato c WHERE c.crianca.codigo = :codCrianca", Contrato.class);
        query.setParameter("codCrianca", codigo);
        return query.getResultList();
    }
}
