package com.rim.services.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.rim.services.models.Commande;


public class Commandedao {


	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ServicesUnit");
    EntityManager em = emf.createEntityManager();
    
	public List<Commande> getAll() {
        String sql = "select u from  Commande u order by u.id desc ";
        TypedQuery< Commande> qr = em.createQuery(sql,  Commande.class);
        return qr.getResultList();
    }
    public  Commande add( Commande  commande) {
        em.getTransaction().begin();
        em.persist(commande); 
        em.getTransaction().commit();
        return  commande;
    }

    public  Commande update(Commande  commande) {
        System.out.println("here ");
        em.getTransaction().begin();
        em.merge(commande);
        em.getTransaction().commit();
        return  commande;
    }

    public boolean remove(Commande  commande) {

        em.getTransaction().begin();

        em.remove(commande);

        em.getTransaction().commit();
           return true;
    }

    public Commande getById(Long id) {

     return em.find(Commande.class,id);

    }



}

