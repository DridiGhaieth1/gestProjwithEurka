package com.esprit.gestprojwitheurk.repositories;

import com.esprit.gestprojwitheurk.entites.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategorieRepo extends JpaRepository<Categorie,Long> {
}
