package com.ashok.rest;
//
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashok.entity.Product;
import com.ashok.repo.productRepository;

@RestController
public class ProductRestController {
	@Autowired
	private productRepository repo;
	@PostMapping( value="/product" ,consumes="application/json")
	public ResponseEntity<String> saveproduct(@RequestBody  Product product){
		
	
		Product save = repo.save(product);	
		return new ResponseEntity<>("product saved",HttpStatus.CREATED); 
		
	}
	
	@GetMapping(value="/products" ,produces="application/json")
public ResponseEntity<List<Product>> products(){ 
		List<Product> products = repo.findAll();
	return new ResponseEntity<>(products,HttpStatus.OK);
 	
}

}
