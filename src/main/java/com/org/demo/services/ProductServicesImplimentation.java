package com.org.demo.services;

import com.org.demo.entities.Produit;
import com.org.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service("ProductService")
public class ProductServicesImplimentation implements ProductServices{
    @Autowired
    ProductRepository produitRepository;
    @Override
    public List<Produit> findProductsByDesignation(String designation) {
        return produitRepository.findProductsByDesignation(designation);
    }
}
