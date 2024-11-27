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

import com.busraakbey.controller.ICustomerController;
import com.busraakbey.entities.Customer;
import com.busraakbey.services.ICustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerControllerImpl implements ICustomerController{

	
	@Autowired
	private ICustomerService customerService;
	
	@PostMapping(path = "/create")
	@Override
	public Customer addCustomer(@RequestBody Customer customer) {
		
		return customerService.addCustomer(customer);
	}

	@GetMapping(path = "/list/{id}")
	@Override
	public Customer getCustomerById(@PathVariable(name = "id") Integer id) {
		
		return customerService.getCustomerById(id);
	}

	@DeleteMapping(path = "/delete/{id}")
	@Override
	public void deleteCustomer(@PathVariable(name = "id") Integer id) {
		customerService.deleteCustomer(id);
		
	}

	@GetMapping(path = "/list")
	@Override
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

	@PutMapping(path = "/update/{id}")
	@Override
	public Customer updateCustomert(@PathVariable(name = "id") Integer id,@RequestBody Customer updateCustomer) {
		return customerService.updateCustomert(id, updateCustomer);
	}
	


}
