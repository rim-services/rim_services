package com.rim.services.models;


import javax.persistence.*;


@Entity
@Table(name = "sortie_detail")
public class Sortie_detail {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "id_produit")
    private Long id_produit;

    @Column(name = "id_sortie")
    private Long id_sortie;

    @Column(name = "quantite")
    private Long quantite;

    @Column(name="pu")
    private float pu;



    public Sortie_detail() {
    }

    public Sortie_detail(Long id, Long id_produit, Long id_sortie, Long quantite, float pu) {
        this.id = id;
        this.id_produit = id_produit;
        this.id_sortie = id_sortie;
        this.quantite = quantite;
        this.pu=pu;
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

    public Long getId_sortie() {
        return id_sortie;
    }

    public void setId_sortie(Long id_sortie) {
        this.id_sortie = id_sortie;
    }

    public Long getQuantite() {
        return quantite;
    }

    public void setQuantite(Long quantite) {
        this.quantite = quantite;
    }

    public float getPu() {
        return pu;
    }

    public void setPu(float pu) {
        this.pu = pu;
    }
}
