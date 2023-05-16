package com.esprit.gestprojwitheurk.service;

import com.esprit.gestprojwitheurk.entites.Categorie;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategorieService {
    List<Categorie> getAllCategories();

    Categorie getCategorieById(Long id) ;

    Categorie saveCategorie(Categorie categorie);

    void deleteCategorieById(Long id);

}
