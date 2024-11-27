package com.busraakbey.services;

import java.util.List;

import com.busraakbey.entities.Product;

public interface IProductService {
	
	public Product createProduct(Product product);
	
	public Product updateProduct(Integer id, Product updateProduct);
	
	public void deleteProduct(Integer id);
	
	public List<Product> getAllProducts();

}
