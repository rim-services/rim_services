package com.rim.services.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="produit")
public class Produit {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	@Column(name="code")
    private String code;
	@Column(name="libelle")
    private String libelle;
	@Column(name="prix")
    private float prix;
	@Column(name="date_Expiration")
    private Date date_Expiration;
	
	
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(Long id, String code, String libelle, float prix, Date date_Expiration) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		this.date_Expiration = date_Expiration;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public Date getDate_Expiration() {
		return date_Expiration;
	}
	public void setDate_Expiration(Date date_Expiration) {
		this.date_Expiration = date_Expiration;
	}
	

}
