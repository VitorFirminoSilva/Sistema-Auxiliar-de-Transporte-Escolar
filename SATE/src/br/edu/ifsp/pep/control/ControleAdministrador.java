/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.control;

import br.edu.ifsp.pep.model.Administrador;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;

/**
 *
 * @author Aluno
 */
public class ControleAdministrador extends ControleGenerico<Administrador>{
    
    public ControleAdministrador() {
        super(Administrador.class);
    }
    
    public List<Administrador> findByNome(String nome){
        EntityManager em = getEm();
        TypedQuery<Administrador> query = em.createQuery("SELECT a FROM Administrador a WHERE a.nomeFuncionario like :nome AND a.status = true", Administrador.class);
        query.setParameter("nome", "%" + nome + "%");
        query.setHint(QueryHints.REFRESH, HintValues.TRUE);
        return query.getResultList();
    }
    
    public Administrador findByNumRegistro(String numero){
        EntityManager em = getEm();
        TypedQuery<Administrador> query = em.createQuery("SELECT a FROM Administrador a WHERE a.numeroRegistro like :numero AND a.status = true", Administrador.class);
        query.setParameter("numero", numero);
        return query.getSingleResult();
    }
    
    public Administrador findRegistro(String numero){
        EntityManager em = getEm();
        TypedQuery<Administrador> query = em.createQuery("SELECT a FROM Administrador a WHERE a.numeroRegistro like :numero", Administrador.class);
        query.setParameter("numero", numero);
        return query.getSingleResult();
    }
    
    public Administrador findByUsuario(String usuario, String senha){
        EntityManager em = getEm();
        TypedQuery<Administrador> query = em.createQuery("SELECT a FROM Administrador a WHERE a.usuario = :usuario AND a.senha = :senha and a.status = true", Administrador.class);
        query.setParameter("usuario", usuario);
        query.setParameter("senha", senha);
        return query.getSingleResult();
    }
}
