package com.busraakbey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.busraakbey.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
