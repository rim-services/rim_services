package com.rim.services.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.rim.services.models.Admin;

public class Admindao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ServicesUnit");
    EntityManager em = emf.createEntityManager();
	public List<Admin> getAll() {
        String sql = "select u from Admin u order by u.id desc ";
        TypedQuery<Admin> qr = em.createQuery(sql, Admin.class);
        return qr.getResultList();
    }
    public Admin add(Admin admin) {
        em.getTransaction().begin();
        em.persist(admin); 
        em.getTransaction().commit();
        return admin;
    }

    public Admin update(Admin admin) {
        System.out.println("here ");
        em.getTransaction().begin();
        em.merge(admin);
        em.getTransaction().commit();
        return admin;
    }

    public boolean remove(Admin admin) {

        em.getTransaction().begin();

        em.remove(admin);

        em.getTransaction().commit();
           return true;
    }

    public Admin getById(Long id) {

     return em.find(Admin.class,id);

    }


   
    public boolean validate(String userName, String password) {

            String sql = "select u from Admin u  WHERE u.email =:userName and u.pass=:password";
            TypedQuery <Admin> qr = em.createQuery(sql, Admin.class);


            if (qr.getResultList() != null ) {
                return true;
            }

        return false;
    }


}
