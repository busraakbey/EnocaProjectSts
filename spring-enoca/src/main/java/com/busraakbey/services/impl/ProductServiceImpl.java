package com.busraakbey.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.busraakbey.entities.Product;
import com.busraakbey.repository.ProductRepository;
import com.busraakbey.services.IProductService;

@Service
public class ProductServiceImpl implements IProductService{

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
		
	}

	@Override
	public Product updateProduct(Integer id, Product updateProduct) {
		Product existingProduct = productRepository.findById(id).orElseThrow();
		existingProduct.setName(updateProduct.getName());
		existingProduct.setPrice(updateProduct.getPrice());
		existingProduct.setStock(updateProduct.getStock());
		return productRepository.save(existingProduct);
		
	}

	@Override
	public void deleteProduct(Integer id) {
		productRepository.deleteById(id);
		
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
	
	
}
