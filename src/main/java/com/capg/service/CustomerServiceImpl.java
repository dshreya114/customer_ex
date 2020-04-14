package com.capg.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capg.dao.ICustomerDao;
import com.capg.entities.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService{

	private ICustomerDao customerDao;

	public ICustomerDao getCustomerDao() {
		return customerDao;
	}

	@Autowired
	public void setCustomerDao(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	@Override
	public Customer findById(int custId)
	{
		return  customerDao.findById(custId);

	}
	
	@Override
	public Customer update(Customer customer)
	{
		return  customerDao.update(customer);

	}
	
	@Override
	public boolean remove(int custId)
	{
		return customerDao.remove(custId);
	}
	
	@Override
	public List<Customer> fetchAll()
	{
		return customerDao.fetchAll();
		
	}
	
}
