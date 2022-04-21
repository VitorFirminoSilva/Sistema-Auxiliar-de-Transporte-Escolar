/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.control;

import br.edu.ifsp.pep.model.HistoricoUtilizacao;
import br.edu.ifsp.pep.model.Motorista;
import br.edu.ifsp.pep.model.Veiculo;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Aluno
 */
public class ControleHistoricoUtilizacao extends ControleGenerico<HistoricoUtilizacao>{
    
    public ControleHistoricoUtilizacao() {
        super(HistoricoUtilizacao.class);
    }
    
    public List<HistoricoUtilizacao> findByAtual(){
        EntityManager em = getEm();
        TypedQuery<HistoricoUtilizacao> query = em.createQuery("SELECT h FROM HistoricoUtilizacao h WHERE h.historicoPK.data = :data and h.horarioFim is null", HistoricoUtilizacao.class);
        query.setParameter("data", new Date());
        return query.getResultList();
    }
    
    public HistoricoUtilizacao findByRegistroChassi(Motorista motorista, Veiculo veiculo){
        EntityManager em = getEm();
        TypedQuery<HistoricoUtilizacao> query = em.createQuery("SELECT h FROM HistoricoUtilizacao h WHERE h.motorista = :motorista and h.veiculo = :veiculo and h.historicoPK.data = :data", HistoricoUtilizacao.class);
        query.setParameter("motorista", motorista);
        query.setParameter("veiculo", veiculo);
        query.setParameter("data", new Date());
        return query.getSingleResult();
    }
    
    public List<HistoricoUtilizacao> findByChassi(Veiculo veiculo){
        EntityManager em = getEm();
        TypedQuery<HistoricoUtilizacao> query = em.createQuery("SELECT h FROM HistoricoUtilizacao h WHERE  h.veiculo = :veiculo and h.historicoPK.data = :data and h.horarioFim is null", HistoricoUtilizacao.class);
        query.setParameter("veiculo", veiculo);
        query.setParameter("data", new Date());
        return query.getResultList();
    }
    
}
