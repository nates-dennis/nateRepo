package com.nathanael.rent;
import java.util.List;

import com.nathanael.customer.Customer;
import com.nathanael.rent.Rent;
import com.nathanael.rent.RentDao;
import com.nathanael.rent.RentDaoImpl;
import com.nathanael.vehicle.Vehicle;
import com.nathanael.vehicle.Vehicle.Status;


public class RentalMenu {
	
	private Rent r;
	private RentDao rental;
	
	public RentalMenu() {
		
		rental = new RentDaoImpl();
	}
	
	public void calculateDiscount(){
		if(r.getC().getAge() > 50){
			r.setRentCost(-0.25*r.getRentCost());
		}else if(r.getC().getAge() < 25){
			r.setRentCost(1.1*r.getRentCost());
		}
	}
	
	public void rent(Vehicle v, Customer c){
		v.setStatus(Status.RENTED.name());
		r = new Rent(v,c);
		rental.add(r);
	}
	
	public List<Rent> getRented(){
		return rental.getRented();
	}
	

}
