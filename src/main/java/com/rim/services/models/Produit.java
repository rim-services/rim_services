package com.rim.services.models;

import javax.persistence.*;
import java.util.Date;


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

	@Column(name="quantite")
	private int quantite;

	@Column(name="id_stock")
	private int id_stock;

	
	
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Produit(Long id, String code, String libelle, float prix, Date date_Expiration, int quantite, int id_stock) {
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		this.date_Expiration = date_Expiration;
		this.quantite = quantite;
		this.id_stock = id_stock;
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

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getId_stock() {
		return id_stock;
	}

	public void setId_stock(int id_stock) {
		this.id_stock = id_stock;
	}
}
