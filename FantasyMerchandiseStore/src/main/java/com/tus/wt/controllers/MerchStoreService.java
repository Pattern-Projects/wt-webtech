package com.tus.wt.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tus.wt.dao.ProductRepository;
import com.tus.wt.dto.Product;
import com.tus.wt.exceptions.ProductNotFoundException;

@RestController
@RequestMapping("products")
public class MerchStoreService {

	@Autowired
	ProductRepository repo;
	
	@GetMapping
	public ResponseEntity<List<Product>> allProducts(){
		List<Product> products =  repo.findAll();
		if (products.size()>0) {
			return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Product>>(products, HttpStatus.NO_CONTENT);			
		}
	} 
	
	@RequestMapping("{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) throws ProductNotFoundException{
		Optional<Product> product =  repo.findById(id);
		if (product.isPresent()) {
			return new ResponseEntity<Product>(product.get(), HttpStatus.OK);
		} else {
			throw new ProductNotFoundException("Product not found " + id);		
		}
	} 
	@RequestMapping("search/brand/{queryBrand}")
	public ResponseEntity<List<Product>> findByBrand(@PathVariable("queryBrand") String brand){
		List<Product> products =  repo.findByBrandContaining(brand);
		if (products.size()>0) {
			return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Product>>(products, HttpStatus.NO_CONTENT);			
		}
	} 
	
	@RequestMapping("search/item/{queryType}")
	public ResponseEntity<List<Product>> findByType(@PathVariable("queryType") String type){
		List<Product> products =  repo.findByTypeContaining(type);
		if (products.size()>0) {
			return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Product>>(products, HttpStatus.NO_CONTENT);			
		}
	} 
	
	
	
	@ExceptionHandler({ProductNotFoundException.class})
	public ResponseEntity notFound(ProductNotFoundException ex) {
		return new ResponseEntity( HttpStatus.NOT_FOUND );
	}
	
}
