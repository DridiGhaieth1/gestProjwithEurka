package com.esprit.gestprojwitheurk.entites;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Produit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long ref;


    private String nom;

    private String description;

    @ManyToOne
   @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    public long getId() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Categorie getCategorie() {
       return categorie;
    }

    public void setCategorie(Categorie categorie) {
       this.categorie = categorie;
    }

    public Produit(long id, String nom, String description,long ref,Categorie categorie) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.categorie = categorie;
        this.ref=ref;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getRef() {
        return ref;
    }

    public void setRef(Long ref) {
        this.ref = ref;
    }

    public Produit() {

    }
}

