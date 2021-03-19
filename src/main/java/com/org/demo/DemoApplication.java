package com.org.demo;

import com.org.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    ProductRepository produitRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //produitRepository.save(new Produit(null, "Iphone 01", 1000, 12));
        //produitRepository.save(new Produit(null, "Iphone 02", 2000, 1));
        //produitRepository.save(new Produit(null, "Iphone 03", 3000, 3));

        produitRepository.findAll().forEach(produit -> {
            System.out.println(produit.toString());
        });
    }
}
