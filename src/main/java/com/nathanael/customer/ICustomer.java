package com.nathanael.customer;

import java.util.List;

public interface ICustomer {
	void addCustomer(Customer c);
	void removeCustomer(Customer c);
	List<Customer> getCustomers();
}
