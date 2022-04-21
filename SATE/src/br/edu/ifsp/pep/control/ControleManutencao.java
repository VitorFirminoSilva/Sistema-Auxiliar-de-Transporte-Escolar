/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.control;

import br.edu.ifsp.pep.model.Manutencao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;

/**
 *
 * @author Aluno
 */
public class ControleManutencao extends ControleGenerico<Manutencao>{
    
    public ControleManutencao() {
        super(Manutencao.class);
    }
    
    public Manutencao findByCodigo(int codigo, String chassi){
        EntityManager em = getEm();
        TypedQuery<Manutencao> query = em.createQuery("SELECT m FROM Manutencao m where m.manutencaoPK.codigo = :codigo AND m.manutencaoPK.numChassi = :chassi", Manutencao.class);
        query.setParameter("codigo", codigo);
        query.setParameter("chassi", chassi);
        return query.getSingleResult();
    }

    public List<Manutencao> findByCodigoPD(String chassi){
        EntityManager em = getEm();
        TypedQuery<Manutencao> query = em.createQuery("SELECT m FROM Manutencao m WHERE m.manutencaoPK.numChassi = :chassi AND m.status = 'PD'", Manutencao.class);
        query.setParameter("chassi", chassi);
        query.setHint(QueryHints.REFRESH, HintValues.TRUE);
        return query.getResultList();
    }
    
    public List<Manutencao> findByChassis(String chassi){
        EntityManager em = getEm();
        TypedQuery<Manutencao> query = em.createQuery("SELECT m FROM Manutencao m WHERE m.manutencaoPK.numChassi = :chassi", Manutencao.class);
        query.setParameter("chassi", chassi);
        query.setHint(QueryHints.REFRESH, HintValues.TRUE);
        return query.getResultList();
    }
    
    public void alterarSituacao(Integer codigo, String chassi){
        EntityManager em = getEm();
        em.getTransaction().begin();
        Manutencao manu = findByCodigo(codigo, chassi);
        
        manu.setStatus("PG");
        em.merge(manu);
        em.getTransaction().commit();          
    }
    
//    public List<Manutencao> findByTipo(String tipo){
//        EntityManager em = getEm();
//        TypedQuery<Manutencao> query = em.createQuery("SELECT m FROM Manutencao m WHERE m.tipoManutencao = :tipo", Manutencao.class);
//        query.setParameter("tipo", "%" + tipo + "%");
//        query.setHint(QueryHints.REFRESH, HintValues.TRUE);
//        return query.getResultList();
//    }
    
}
