package com.nathanael.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao{

	List<Customer> customerList;
	
	
	
	public CustomerDaoImpl() {
		// TODO Auto-generated constructor stub
		customerList = new ArrayList<Customer>();
	}

	@Override
	public void add(Customer c) {
		// TODO Auto-generated method stub
		customerList.add(c);
	}

	@Override
	public void delete(Customer c) {
		// TODO Auto-generated method stub
		customerList.remove(c);
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerList;
	}

}
