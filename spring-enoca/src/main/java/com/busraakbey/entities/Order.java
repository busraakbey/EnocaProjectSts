package com.busraakbey.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order extends BaseEntity {
	
	@Column(name = "order_date")
	private Date orderDate;
	
	@Column(name = "total_price")
	private double totalPrice;
	
	@ManyToOne
	private Customer customer;
	
	@OneToMany(mappedBy = "order")
	private List<OrderItem> items;
	

}
