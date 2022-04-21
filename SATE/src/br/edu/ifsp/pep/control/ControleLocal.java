/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.control;

import br.edu.ifsp.pep.model.Local;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;

/**
 *
 * @author WINDOWS10
 */
public class ControleLocal extends ControleGenerico<Local>{
    
    public ControleLocal() {
        super(Local.class);
    }
    
        public Local findByIdLocal(Integer numero){
        EntityManager em = getEm();
        TypedQuery<Local> query = em.createQuery("SELECT l FROM Local l where l.idLocal = :idLocal ", Local.class);
        query.setParameter("idLocal", numero);
        return query.getSingleResult();
    }
    
    public List<Local> findByRua(String rua){
        EntityManager em = getEm();
        TypedQuery<Local> query = em.createQuery("SELECT l FROM Local l WHERE l.rua like :rua", Local.class);
        query.setParameter("rua", "%" + rua + "%");
        query.setHint(QueryHints.REFRESH, HintValues.TRUE);
        return query.getResultList();
    }
}
