package com.busraakbey.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product  extends BaseEntity{
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "stock")
	private int stock;
	
	@OneToMany(mappedBy = "product")
	private List<Cart> carts;
	
	
	 

}
