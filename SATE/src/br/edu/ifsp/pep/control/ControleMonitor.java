/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.control;

import br.edu.ifsp.pep.model.Administrador;
import br.edu.ifsp.pep.model.Monitor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;

/**
 *
 * @author Aluno
 */
public class ControleMonitor extends ControleGenerico<Monitor>{
    
    public ControleMonitor() {
        super(Monitor.class);
    }
    
    public List<Monitor> findByNome(String nome){
        EntityManager em = getEm();
        TypedQuery<Monitor> query = em.createQuery("SELECT m FROM Monitor m WHERE m.nomeFuncionario LIKE :nome AND m.status = true", Monitor.class);
        query.setParameter("nome", "%" + nome + "%");
        query.setHint(QueryHints.REFRESH, HintValues.TRUE);
        return query.getResultList();
    }
    
    public Monitor findByNumRegistro(String numero){
        EntityManager em = getEm();
        TypedQuery<Monitor> query = em.createQuery("SELECT m FROM Monitor m WHERE m.numeroRegistro like :numero AND m.status = true", Monitor.class);
        query.setParameter("numero", numero);
        return query.getSingleResult();
    }
    
    public Monitor findRegistro(String numero){
        EntityManager em = getEm();
        TypedQuery<Monitor> query = em.createQuery("SELECT a FROM Monitor a WHERE a.numeroRegistro like :numero", Monitor.class);
        query.setParameter("numero", numero);
        return query.getSingleResult();
    }
}
