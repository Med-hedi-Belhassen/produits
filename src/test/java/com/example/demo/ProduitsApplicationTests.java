package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.enteties.Produits;
import com.example.demo.repos.ProduitRepository;

@SpringBootTest
class ProduitsApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	@Test
	public void testCreateProduit() {
	Produits prod = new Produits("PC Dell",2200.500,new Date());
	produitRepository.save(prod);
	}
	@Test
	public void testFindProduit()
	{
	Produits p = produitRepository.findById(1L).get();

	System.out.println(p);
	}
	@Test
	public void testUpdateProduit()
	{
	Produits p = produitRepository.findById(1L).get();
	p.setPrixProduit(1000.0);
	produitRepository.save(p);
	}
	@Test
	public void testListerTousProduits()
	{
	List<Produits> prods = produitRepository.findAll();
	for (Produits p : prods)
	{
	System.out.println(p);
	}
}
}
