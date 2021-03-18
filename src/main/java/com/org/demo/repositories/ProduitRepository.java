package com.org.demo.repositories;

import com.org.demo.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
