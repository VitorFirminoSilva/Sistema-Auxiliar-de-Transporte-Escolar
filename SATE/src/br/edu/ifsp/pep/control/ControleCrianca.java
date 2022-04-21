/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.control;

import br.edu.ifsp.pep.model.Crianca;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;

/**
 *
 * @author Aluno
 */
public class ControleCrianca extends ControleGenerico<Crianca>{
    
    public ControleCrianca() {
        super(Crianca.class);
    }
    
    public Crianca findByCodigo(int codigo){
        EntityManager em = getEm();
        TypedQuery<Crianca> query = em.createQuery("SELECT c FROM Crianca c where c.codCrianca = :codigo AND c.status = true", Crianca.class);
        query.setParameter("codigo", codigo);
        return query.getSingleResult();
    }
    
    public Crianca findByCodigoG(int codigo){
        EntityManager em = getEm();
        TypedQuery<Crianca> query = em.createQuery("SELECT c FROM Crianca c where c.codCrianca = :codigo", Crianca.class);
        query.setParameter("codigo", codigo);
        return query.getSingleResult();
    }
    
    public List<Crianca> findByNome(String nome){
        EntityManager em = getEm();
        TypedQuery<Crianca> query = em.createQuery("SELECT c FROM Crianca c WHERE c.nome like :nome AND c.status = true", Crianca.class);
        query.setParameter("nome", "%" + nome + "%");
        query.setHint(QueryHints.REFRESH, HintValues.TRUE);
        return query.getResultList();
    }
    
}
