package com.capg.service;

import java.util.List;

import com.capg.entities.Customer;

public interface ICustomerService {

	Customer findById(int custid);
	
	Customer update(Customer customer);

	List<Customer>  fetchAll();

	boolean remove(int custId);
	
}
