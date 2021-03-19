package com.org.demo.services;

import com.org.demo.entities.Produit;

import java.security.SecureRandom;
import java.util.List;

public interface ProductServices {
    List<Produit> findProductsByDesignation(String designation);
}
