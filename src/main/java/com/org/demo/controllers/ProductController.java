package com.org.demo.controllers;

import com.org.demo.entities.Produit;
import com.org.demo.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ProductController {

    @Autowired
    ProductServices productServices;
    @GetMapping("/Product/{id}")
    public Produit  getProduct(@PathVariable int id) {
        return new Produit((long) id,"Desc product",0,9);
    }

    @GetMapping("/Products/p/{designation}")
    public List<Produit> getProductsByDesignation(@PathVariable  String designation){
        return productServices.findProductsByDesignation(designation);
    }

}
