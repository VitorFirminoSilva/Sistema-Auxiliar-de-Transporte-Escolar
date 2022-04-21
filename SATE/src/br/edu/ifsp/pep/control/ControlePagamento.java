/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.control;

import br.edu.ifsp.pep.model.Pagamento;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;

/**
 *
 * @author WINDOWS10
 */
public class ControlePagamento extends ControleGenerico<Pagamento>{
    
    public ControlePagamento() {
        super(Pagamento.class);
    }
    
    public Pagamento findByCodigo(Integer id){
        EntityManager em = getEm();
        TypedQuery<Pagamento> query = em.createQuery("SELECT p FROM Pagamento p where p.idPagamento = :idPagamento ", Pagamento.class);
        query.setParameter("idPagamento", id);
        return query.getSingleResult();
    }
    
    public List<Pagamento> findByCodigoPD(String numero){
        EntityManager em = getEm();
        TypedQuery<Pagamento> query = em.createQuery("SELECT p FROM Pagamento p where p.numeroRegistro = :numeroRegistro AND p.status = 'PD'", Pagamento.class);
        query.setParameter("numeroRegistro", numero);
        query.setHint(QueryHints.REFRESH, HintValues.TRUE);
        return query.getResultList();
    }
    
    public List<Pagamento> findByData(Date data){
        EntityManager em = getEm();
        TypedQuery<Pagamento> query = em.createQuery("SELECT p FROM Pagamento p where p.data = :dataPag", Pagamento.class);
        query.setParameter("dataPag", data);
        query.setHint(QueryHints.REFRESH, HintValues.TRUE);
        return query.getResultList();
    }

    
}
