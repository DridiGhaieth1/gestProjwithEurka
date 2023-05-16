package com.esprit.gestprojwitheurk.entites;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "categorie")
public class Categorie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @OneToMany
    @JsonIgnore
    List<Produit> produits;
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

    public Categorie(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public Categorie() {
    }

}

