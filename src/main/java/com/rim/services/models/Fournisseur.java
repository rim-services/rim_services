package com.rim.services.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "fournisseurs")
public class Fournisseur {

 	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
 	@Column(name = "id")
    private Long id;
 	@Column(name = "nom")
    private String nom;
 	@Column(name = "prenom")
    private String prenom;
 	@Column(name = "email")
    private String email;
 	@Column(name = "pass")
    private String pass;
 	
 	@OneToMany
    @JoinColumn(name="id_fournisseur")
 	private List<Commande> commandes;
 	
//	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "id_fournisseur", referencedColumnName = "id")
//	private List<Commande> commandes;


   public Fournisseur() {
		
	}
	public Fournisseur(Long id, String nom, String prenom, String email, String pass) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.pass = pass;
	}
	
	public Fournisseur(String nom, String prenom, String email, String pass) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.pass = pass;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
}
