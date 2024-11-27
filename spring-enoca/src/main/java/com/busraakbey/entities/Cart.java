package com.busraakbey.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cart")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cart extends BaseEntity {
	
	@Column(name = "total_price")
	private double totalPrice;
	
	@ManyToOne
	private Customer customer;
	
	@OneToMany(mappedBy = "cart")
	private List<CartItem> items;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

}
