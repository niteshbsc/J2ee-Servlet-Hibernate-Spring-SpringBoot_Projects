package org.jsp.userbootdemo.controller;

import java.util.List;

import org.jsp.userbootdemo.dto.Product;
import org.jsp.userbootdemo.service.ProductService;
import org.jsp.userbootdemo.service.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	private ProductService service;
	
	@PostMapping("/product")
	public ResponseStructure<Product> saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	@PutMapping("/product")
	public ResponseStructure<Product>  updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}
	
	@GetMapping("/product/{id}")
	public ResponseStructure<Product>  findProduct(@PathVariable int id) {
		return service.findProduct(id);
	}
	
	@GetMapping("/product")
	public ResponseStructure <List<Product>> findAll() {
		return service.finAll();
	}
	
	@DeleteMapping("/product/{id}")
	public ResponseStructure<String>  deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}
}
