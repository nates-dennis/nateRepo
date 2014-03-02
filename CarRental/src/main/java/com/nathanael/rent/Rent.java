package com.nathanael.rent;

import com.nathanael.customer.Customer;
import com.nathanael.vehicle.Vehicle;

public class Rent {

	private Vehicle v;
	private Customer c;
	private double rentCost;
	
	public double getRentCost() {return rentCost;}
	
	public void setRentCost(double rentCost) {this.rentCost += rentCost ;}
	
	public Rent(Vehicle v, Customer c) {
		this.v = v;
		this.c = c;
		rentCost = v.getPrice();
	}
	
	public Vehicle getV() {return v;}
	
	public void setV(Vehicle v) {this.v = v;}
	
	public Customer getC() {return c;}
	
	public void setC(Customer c) {this.c = c;}
	
}
