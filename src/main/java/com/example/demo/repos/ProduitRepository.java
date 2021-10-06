package com.example.demo.repos;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.enteties.Produits;


public interface ProduitRepository extends JpaRepository<Produits, Long> {

}
