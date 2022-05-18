package com.rim.services.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.rim.services.models.Fournisseur;

public class Fournisseurdao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ServicesUnit");
    EntityManager em = emf.createEntityManager();
	
    public Fournisseur add(Fournisseur fournisseur) {
        em.getTransaction().begin();
        em.persist(fournisseur); 
        em.getTransaction().commit();
        return fournisseur;
    }

    public Fournisseur update(Fournisseur fournisseur) {
        System.out.println("here ");
        em.getTransaction().begin();
        em.merge(fournisseur);
        em.getTransaction().commit();
        return fournisseur;
    }

    public boolean remove(Fournisseur fournisseur) {

        em.getTransaction().begin();

        em.remove(fournisseur);

        em.getTransaction().commit();
           return true;
    }

    public Fournisseur getById(Long id) {

     return em.find(Fournisseur.class,id);

    }
	public List<Fournisseur> getAll() {
		 String sql = "select u from Fournisseur u order by u.id desc ";
	        TypedQuery<Fournisseur> qr = em.createQuery(sql, Fournisseur.class);
	        return qr.getResultList();
	}

}

