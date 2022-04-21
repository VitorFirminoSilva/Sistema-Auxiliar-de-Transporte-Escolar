/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Aluno
 */
public class ControleGenerico<T> {
    private EntityManagerFactory emf;
    private Class<T> classe;
    
    public ControleGenerico(Class<T> classe){
        this.classe = classe;
        emf = Persistence.createEntityManagerFactory("ProjetoIntegradoPU");
    }
    
    protected EntityManager getEm(){
        return emf.createEntityManager();
    }
    public void inserir(T objeto){
        EntityManager em = getEm();
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
    }
    
    public void alterar(T objeto){
        EntityManager em = getEm();
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();
    }
    
    public void deletar(T objeto){
        EntityManager em = getEm();
        em.getTransaction().begin();
        em.remove(em.merge(objeto));
        em.getTransaction().commit();
    }
}
