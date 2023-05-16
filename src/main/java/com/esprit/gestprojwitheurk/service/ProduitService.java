package com.esprit.gestprojwitheurk.service;

import com.esprit.gestprojwitheurk.entites.Produit;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProduitService {
    List<Produit> getAllProduits();


    Produit getProduitById(Long id) throws ChangeSetPersister.NotFoundException;

    Produit saveProduit(Produit produit) throws ChangeSetPersister.NotFoundException;

    void deleteProduitById(Long id) throws ChangeSetPersister.NotFoundException;
}
