package com.sundar.sws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sundar.sws.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
