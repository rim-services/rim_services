package com.rim.services.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "commande")
public class Commande {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	
 	@Column(name = "id")
    private Long id;
	
 	@Column(name = "id_fournisseur")
    private Long id_fournisseur;
 
 	@Column(name = "id_admin")
    private Long id_admin;
 	
 	@Column(name = "date")
    private Date date;
 	
 	@Column(name = "etat")
    private String etat;
 	
	public Commande() {
		
	}
	public Commande(Long id,Long id_fournisseur, Long id_admin,  Date date,String etat) {
		super();
		this.id = id;
		this.id_fournisseur = id_fournisseur;
		this.id_admin =id_admin;
		this.date = date;
		this.etat = etat;
	}
	public Commande(Date date,String etat) {
		super();
		this.date = date;
		this.etat = etat;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId_fournisseur() {
		return id_fournisseur;
	}
	public void setId_fournisseur(Long id_fournisseur) {
		this.id_fournisseur = id_fournisseur;
	}
	public Long getId_admin() {
		return id_admin;
	}
	public void setId_admin(Long id_admin) {
		this.id_admin = id_admin;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
}


