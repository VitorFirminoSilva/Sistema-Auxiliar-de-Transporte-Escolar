/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.control;

import br.edu.ifsp.pep.model.Motorista;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;

/**
 *
 * @author Aluno
 */
public class ControleMotorista extends ControleGenerico<Motorista>{
    
    public ControleMotorista() {
        super(Motorista.class);
    }
    
    public Motorista findByNumRegistro(String numero){
        EntityManager em = getEm();
        TypedQuery<Motorista> query = em.createQuery("SELECT m FROM Motorista m where m.numeroRegistro like :numero AND m.status = true", Motorista.class);
        query.setParameter("numero", numero);
        return query.getSingleResult();
    }
    
    public List<Motorista> findByNome(String nome){
        EntityManager em = getEm();
        TypedQuery<Motorista> query = em.createQuery("SELECT m FROM Motorista m WHERE m.nomeFuncionario like :nome AND m.status = true", Motorista.class);
        query.setParameter("nome", "%" + nome + "%");
        query.setHint(QueryHints.REFRESH, HintValues.TRUE);
        return query.getResultList();
    }
}
