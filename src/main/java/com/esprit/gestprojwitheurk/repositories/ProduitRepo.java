package com.esprit.gestprojwitheurk.repositories;

import com.esprit.gestprojwitheurk.entites.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProduitRepo extends JpaRepository<Produit,Long> {
}
