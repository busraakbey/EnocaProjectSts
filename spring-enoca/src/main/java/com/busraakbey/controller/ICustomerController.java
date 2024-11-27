package com.busraakbey.controller;

import java.util.List;

import com.busraakbey.entities.Customer;

public interface ICustomerController {
	
	public Customer addCustomer(Customer customer);
	
	public Customer getCustomerById(Integer id);
	
	public void deleteCustomer(Integer id);
	
	public List<Customer> getAllCustomers();

	public Customer updateCustomert(Integer id, Customer updateCustomer);
	


}
