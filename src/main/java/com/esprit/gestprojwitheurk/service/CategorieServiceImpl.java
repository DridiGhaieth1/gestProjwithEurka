package com.esprit.gestprojwitheurk.service;

import com.esprit.gestprojwitheurk.entites.Categorie;
import com.esprit.gestprojwitheurk.repositories.CategorieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategorieServiceImpl implements CategorieService {

    @Autowired
    private CategorieRepo categorieRepository;
    @Override
    public List<Categorie> getAllCategories() {
        return categorieRepository.findAll();
    }

    @Override
    public Categorie getCategorieById(Long id)  {
        Optional<Categorie> optionalCategorie = categorieRepository.findById(id);
        return optionalCategorie.get();
    }




    @Override
    public Categorie saveCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public void deleteCategorieById(Long id) {
        categorieRepository.deleteById(id);
    }
}


