package com.sundar.sws.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.sundar.sws.domain.Customer;

import com.sundar.sws.service.CustomerService;

@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {
	
	public static final String BASE_URL = "/api/v1/customers";
	
	private final CustomerService customerService ;

	public CustomerController(CustomerService customerService ) {
		this.customerService  = customerService;
	}

	@GetMapping
	List <Customer> getAllCustomers()
	{
		System.out.println("Inside getAllCustomers...");
		
	return 	customerService.findAllCustomers();
	}
	 
	@GetMapping("/{id}")
	public Customer getCustomeById(@PathVariable Long id)
	{
		System.out.println("Inside getCustomeById...");
		
	return 	customerService.findCustomerById(id);
	}

	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public Customer SaveCustomer(@RequestBody Customer customer)
	{
		System.out.println("Inside SaveCustomer...");
		
	return 	customerService.SaveCustomer(customer);
	}

}
