package com.example.simplewebapp.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.simplewebapp.Model.Product;
import com.example.simplewebapp.Service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/products")
//	@RequestMapping("/products")
	public List<Product> getProducts() {
		return service.getProducts();
	}
	
	@GetMapping("/products/{prodId}")
//	@RequestMapping("/products/{prodId}")
	public Product getProductById(@PathVariable int prodId) {
		return service.getProductById(prodId);
	}
	
//	@RequestMapping("/products")
	@PostMapping("/products")
	public void addProduct(@RequestBody Product product)
	{
		service.addProduct(product);
	}
	
	@PutMapping("/products")
	public void updateProduct(@RequestBody Product product)
	{
		service.updateProduct(product);
	}
	
	@DeleteMapping("/products/{prodId}")
	public void deleteProduct(@PathVariable int prodId)
	{
		service.deleteProduct(prodId);
	}
}
