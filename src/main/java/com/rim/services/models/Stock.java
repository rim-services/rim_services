package com.rim.services.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "stock")
public class Stock {
 	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
 	@Column(name = "id")
    private Long id;
 	
 	@Column(name = "id_produit")
    private Long id_produit;
 	
 	@Column(name = "quantite")
    private float  quantite;
 	
  
	public Stock() {
		
	}
	public Stock(Long id, Long id_produit, float quantite) {
		super();
		this.id = id;
		this.id_produit = id_produit;
		this.quantite = quantite;
	}
	
	public Stock(float quantite) {
		super();
		this.quantite= quantite;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId_produit() {
		return id_produit;
	}
	public void setId_produit(Long id_produit) {
		this.id_produit = id_produit;
	}
	public float getQuantite() {
		return quantite;
	}
	public void setQuantite(float quantite) {
		this.quantite = quantite;
	}

}
