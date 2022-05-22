package com.rim.services.models;


import javax.persistence.*;


@Entity
@Table(name = "entree_detail")
public class Entree_detail {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "id_produit")
    private Long id_produit;

    @Column(name = "id_entree")
    private Long id_entree;

    @Column(name = "quantite")
    private Long quantite;

    public Entree_detail() {
    }

    public Entree_detail(Long id, Long id_produit, Long id_entree, Long quantite) {
        this.id = id;
        this.id_produit = id_produit;
        this.id_entree = id_entree;
        this.quantite = quantite;
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

    public Long getId_entree() {
        return id_entree;
    }

    public void setId_entree(Long id_entree) {
        this.id_entree = id_entree;
    }

    public Long getQuantite() {
        return quantite;
    }

    public void setQuantite(Long quantite) {
        this.quantite = quantite;
    }
}
