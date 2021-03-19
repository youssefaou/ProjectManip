package com.org.demo.repositories;

import com.org.demo.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductRepository extends JpaRepository<Produit,Long> {
    List<Produit> findProductsByDesignation(String designation);
}
