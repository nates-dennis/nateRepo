package com.nathanael.customer;

import java.util.List;

public interface CustomerDao {
	void add(Customer c);
	void delete(Customer c);
	List<Customer> getCustomers();

}
