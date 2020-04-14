package com.capg.dao;

import java.util.List;

import com.capg.entities.Customer;

public interface ICustomerDao {

    Customer findById(int custId);
	
	Customer update(Customer customer);
	
	List<Customer>  fetchAll();

	boolean remove(int custId);
	
}
