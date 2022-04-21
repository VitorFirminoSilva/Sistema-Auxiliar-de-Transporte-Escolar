/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.control;

import br.edu.ifsp.pep.model.Cliente;
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
public class ControleCliente extends ControleGenerico<Cliente>{
     
    public ControleCliente() {
        super(Cliente.class);
    }
     
    public Cliente findByCpf(String cpf){
        EntityManager em = getEm();
        TypedQuery<Cliente> query = em.createQuery("SELECT c FROM Cliente c where c.cpfResponsavel = :cpf AND c.status = true", Cliente.class);
        query.setParameter("cpf", cpf);
        return query.getSingleResult();
    }
    
    public List<Cliente> findByNome(String nome){
        EntityManager em = getEm();
        TypedQuery<Cliente> query = em.createQuery("SELECT c FROM Cliente c WHERE c.nomePai like :nome AND c.status = true", Cliente.class);
        query.setParameter("nome", "%" + nome + "%");
        query.setHint(QueryHints.REFRESH, HintValues.TRUE);
        return query.getResultList();
    }
    
}
