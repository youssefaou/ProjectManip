package com.org.demo;

import com.org.demo.entities.Produit;
import com.org.demo.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    ProductRepository productRepository;
    @Test
    void contextLoads() {
        List<Produit> produits = productRepository.findAll();
        assertEquals(6,produits.size());
    }

}
