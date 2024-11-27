package com.busraakbey.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.busraakbey.entities.Customer;
import com.busraakbey.repository.CustomerRepository;
import com.busraakbey.services.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerById(Integer id) {
		Optional<Customer> optional = customerRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void deleteCustomer(Integer id) {
		Customer customer = getCustomerById(id);
		if(customer != null) {
			customerRepository.delete(customer);
		}
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customersList = customerRepository.findAll();
		return customersList;
	}

	@Override
	public Customer updateCustomert(Integer id, Customer updateCustomer) {
		Customer dbCustomer = getCustomerById(id);
		if(dbCustomer != null) {
			dbCustomer.setFirstName(updateCustomer.getFirstName());
			dbCustomer.setLastName(updateCustomer.getLastName());
			dbCustomer.setEmail(updateCustomer.getEmail());
			
			return customerRepository.save(dbCustomer);
		}
		return null;
	}

}
