package com.sundar.sws.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sundar.sws.domain.Customer;
import com.sundar.sws.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	private final CustomerRepository customerRepository ;
	

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	@Override
	public Customer findCustomerById(long id) {
		return customerRepository.findById(id).get();
	}

	@Override
	public List<Customer> findAllCustomers() {
		return customerRepository.findAll();
	}
	@Override
	public Customer SaveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

}
