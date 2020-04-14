package com.capg.dao;

import java.util.List;
import javax.persistence.*;
import org.springframework.stereotype.Repository;

import com.capg.entities.Customer;

@Repository
public class CustomerDaoImpl implements ICustomerDao {

	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public Customer findById(int custId)
	{
		Customer customer = entityManager.find(Customer.class, custId);
		return customer;
	}
	
	@Override
	public Customer update(Customer customer)
	{
		customer = getEntityManager().merge(customer);
		return customer;
	}
	
    @Override
    public boolean remove(int id) {
        Customer customer = findById(id);
        getEntityManager().remove(customer);
        return true;
    }
    
	@Override
    public List<Customer> fetchAll() {
        String jql = "from Customer";
        TypedQuery<Customer> query = entityManager.createQuery(jql, Customer.class);
        List<Customer> list = query.getResultList();
        return list;
    }
	
}
