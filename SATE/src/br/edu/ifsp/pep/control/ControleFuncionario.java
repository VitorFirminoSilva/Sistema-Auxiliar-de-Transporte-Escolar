/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.control;

import br.edu.ifsp.pep.model.Funcionario;
import br.edu.ifsp.pep.model.Monitor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Aluno
 */
public class ControleFuncionario extends ControleGenerico<Funcionario>{
    
    public ControleFuncionario() {
        super(Funcionario.class);
    }
    
    public Funcionario findByNumRegistro(String numero){
        EntityManager em = getEm();
        TypedQuery<Funcionario> query = em.createQuery("SELECT f FROM Funcionario f WHERE f.numeroRegistro like :numero AND f.status = true", Funcionario.class);
        query.setParameter("numero", numero);
        return query.getSingleResult();
    }
    
    public Funcionario findByGeral(String numero){
        EntityManager em = getEm();
        TypedQuery<Funcionario> query = em.createQuery("SELECT f FROM Funcionario f WHERE f.numeroRegistro like :numero", Funcionario.class);
        query.setParameter("numero", numero);
        return query.getSingleResult();
    }
    
    public List<Funcionario> findAll(){
        EntityManager em = getEm();
        TypedQuery<Funcionario> query = em.createQuery("SELECT f FROM Funcionario f WHERE f.status = true", Funcionario.class);
        return query.getResultList();
    }
}
