package com.sundar.sws.service;

import java.util.List;

import com.sundar.sws.domain.Customer;

public interface CustomerService {

Customer findCustomerById(long id);
List<Customer> findAllCustomers();
Customer SaveCustomer(Customer customer);

}
