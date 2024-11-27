package com.busraakbey.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.busraakbey.controller.IProductController;
import com.busraakbey.entities.Product;
import com.busraakbey.services.IProductService;


@RestController
@RequestMapping("/api/product")
public class ProductControllerImpl implements IProductController{

	@Autowired
	private IProductService productService;
	
	@PostMapping(path = "/create")
	@Override
	public Product createProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}

	@Override
	@PutMapping(path = "/update/{id}")
	public Product updateProduct(@PathVariable(name = "id") Integer id,@RequestBody Product updateProduct) {
		return productService.updateProduct(id, updateProduct);
	}

	@Override
	@DeleteMapping(path = "/delete/{id}")
	public void deleteProduct(@PathVariable(name = "id") Integer id) {
		productService.deleteProduct(id);
		
	}

	@Override
	@GetMapping(path = "/list")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
}
