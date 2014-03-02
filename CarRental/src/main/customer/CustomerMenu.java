package com.nathanael.customer;

import java.util.List;

public class CustomerMenu implements ICustomer {

	private CustomerDao cus;
	
	

	public CustomerMenu() {
		cus = new CustomerDaoImpl();
	}

	@Override
	public void addCustomer(Customer c) {
		// TODO Auto-generated method stub
		cus.add(c);

	}

	@Override
	public void removeCustomer(Customer c) {
		// TODO Auto-generated method stub
		cus.delete(c);
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return cus.getCustomers();
	}

	@Override
	public void calculateDiscount() {
		// TODO Auto-generated method stub
		
	}

}
