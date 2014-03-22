package com.nathanael.customer;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
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

}
