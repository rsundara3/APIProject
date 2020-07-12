package com.sundar.sws.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sundar.sws.domain.Customer;
import com.sundar.sws.repositories.CustomerRepository;

@Component
public class BootStrapData implements CommandLineRunner{

	private final CustomerRepository customerRepository ;

	public BootStrapData(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	@Override
	public void run(String... args) throws Exception {

	System.out.println("Loading Customer Data...");
	System.out.println("Adding Customer Data...");
	
	Customer c1 = new Customer ();
	c1.setFirstname("Jhon");
	c1.setLastname("Maya");
	customerRepository.save(c1);
	
	Customer c2 = new Customer ();
	c2.setFirstname("Sundar");
	c2.setLastname("Rama");
	customerRepository.save(c2);
	
	Customer c3 = new Customer ();
	c3.setFirstname("Ramanujam");
	c3.setLastname("Renga");
	customerRepository.save(c3);
	
	System.out.println("Count of Customer Data..." +customerRepository.count());

	}
}
