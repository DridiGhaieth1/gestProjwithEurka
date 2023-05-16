package com.esprit.gestprojwitheurk.controllers;


import com.esprit.gestprojwitheurk.entites.Categorie;
import com.esprit.gestprojwitheurk.service.CategorieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorie")
public class CategorieController {

    @Autowired
    private CategorieServiceImpl categorieService;

    @GetMapping("")
    public List<Categorie> getAllCategories() {
        return categorieService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Categorie getCategorieById(@PathVariable Long id) throws ChangeSetPersister.NotFoundException {
        return categorieService.getCategorieById(id);
    }

    @PostMapping("")
    public Categorie saveCategorie(@RequestBody Categorie categorie) {
        return categorieService.saveCategorie(categorie);
    }

    @DeleteMapping("/{id}")
    public void deleteCategorieById(@PathVariable Long id) {
        categorieService.deleteCategorieById(id);
    }
}
