package com.esprit.gestprojwitheurk.controllers;

import com.esprit.gestprojwitheurk.entites.Produit;
import com.esprit.gestprojwitheurk.service.ProduitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produit")
public class ProduitController {

    @Autowired
    private ProduitServiceImpl produitService;

    @GetMapping("")
    public List<Produit> getAllProduits() {
        return produitService.getAllProduits();
    }


    @GetMapping("/{id}")
    public Produit getProduitById(@PathVariable Long id) throws ChangeSetPersister.NotFoundException {
        return produitService.getProduitById(id);
    }

    @PostMapping("")
    public Produit saveProduit(@RequestBody Produit produit) throws ChangeSetPersister.NotFoundException {
        return produitService.saveProduit(produit);
    }

    @DeleteMapping("/{id}")
    public void deleteProduitById(@PathVariable Long id) throws ChangeSetPersister.NotFoundException {
        produitService.deleteProduitById(id);
    }
}
