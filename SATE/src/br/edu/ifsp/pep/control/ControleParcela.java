/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.control;


import br.edu.ifsp.pep.model.Parcela;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;

/**
 *
 * @author WINDOWS10
 */
public class ControleParcela extends ControleGenerico<Parcela>{
    
    public ControleParcela() {
        super(Parcela.class);
    }
    
    public Parcela findByCodigo(Integer id, Integer numContrato){
        EntityManager em = getEm();
        TypedQuery<Parcela> query = em.createQuery("SELECT p FROM Parcela p where p.numParcela = :idParcela AND p.contrato.numContrato = :numContrato", Parcela.class);
        query.setParameter("idParcela", id);
        query.setParameter("numContrato", numContrato);
        return query.getSingleResult();
    }
    
    public Parcela findByCodigoPendente(Integer id, Integer numContrato){
        EntityManager em = getEm();
        TypedQuery<Parcela> query = em.createQuery("SELECT p FROM Parcela p where p.numParcela = :idParcela AND p.contrato.numContrato = :numContrato AND p.status = 'PD'", Parcela.class);
        query.setParameter("idParcela", id);
        query.setParameter("numContrato", numContrato);
        return query.getSingleResult();
    }
    
    public List<Parcela> findByCodigoGR(Integer numero){
        EntityManager em = getEm();
        TypedQuery<Parcela> query = em.createQuery("SELECT p FROM Parcela p where p.contrato.numContrato = :numContrato",Parcela.class);
        query.setParameter("numContrato", numero);
        query.setHint(QueryHints.REFRESH, HintValues.TRUE);
        return query.getResultList();
    }
    
    public List<Parcela> findByCodigoPD(Integer numero){
        EntityManager em = getEm();
        TypedQuery<Parcela> query = em.createQuery("SELECT p FROM Parcela p where p.contrato.numContrato = :numContrato AND p.status = 'PD'",Parcela.class);
        query.setParameter("numContrato", numero);
        query.setHint(QueryHints.REFRESH, HintValues.TRUE);
        return query.getResultList();
    }
    
    public List<Parcela> findByContratoPG(Integer numero){
        EntityManager em = getEm();
        TypedQuery<Parcela> query = em.createQuery("SELECT p FROM Parcela p where p.contrato.numContrato = :numContrato AND p.status = 'PG'", Parcela.class);
        query.setParameter("numContrato", numero);
        query.setHint(QueryHints.REFRESH, HintValues.TRUE);
        return query.getResultList();
    }

}
