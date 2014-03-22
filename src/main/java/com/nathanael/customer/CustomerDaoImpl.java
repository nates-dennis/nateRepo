package com.nathanael.customer;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class CustomerDaoImpl implements CustomerDao{

	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	List<Customer> customerList;
	
	public CustomerDaoImpl() {
		// TODO Auto-generated constructor stub
		customerList = new ArrayList<Customer>();
	}

	@Override
	public void add(Customer c) {
		// TODO Auto-generated method stub
//		customerList.add(c);
		sessionFactory.getCurrentSession().saveOrUpdate(c);
	}

	@Override
	public void delete(Customer c) {
		// TODO Auto-generated method stub
//		customerList.remove(c);
		sessionFactory.getCurrentSession().delete(c);
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
//		return customerList;
		return sessionFactory.getCurrentSession().createCriteria(Customer.class).list();
	}

}
