package com.rim.services.models;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "commande")
public class Commande {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	
 	@Column(name = "id")
    private Long id;
	
 	@Column(name = "id_fournisseur")
    private Long id_fournisseur;
 

 	@Column(name = "date")
    private Date date;
 	
 	@Column(name = "etat")
    private String etat;
 	
	public Commande() {
		
	}
	public Commande(Long id,Long id_fournisseur,   Date date,String etat) {
		super();
		this.id = id;
		this.id_fournisseur = id_fournisseur;
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


