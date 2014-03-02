package com.nathanael;

import java.util.List;

import com.nathanael.customer.Customer;
import com.nathanael.customer.CustomerMenu;
import com.nathanael.vehicle.Car;
import com.nathanael.vehicle.Van;
import com.nathanael.vehicle.Vehicle;
import com.nathanael.vehicle.VehicleMenu;





public class TestUtil {
	protected CustomerMenu cMenu;
	protected VehicleMenu vMenu;
	protected Customer customer1, customer2, customer3;;
    protected Vehicle van,car;
	
	public TestUtil() {
		// TODO Auto-generated constructor stub
		cMenu = new CustomerMenu();
		vMenu = new VehicleMenu();
	}
	public void addC(){
		customer1 = new Customer("Nathanael","Dennis",22,"Ealing");
		customer2 = new Customer("Catherine","Dennis",50,"Ealing");
		customer3 = new Customer("Evelyn","Dennis",70,"Ealing");
		
		cMenu.addCustomer(customer1);
		cMenu.addCustomer(customer2);
		cMenu.addCustomer(customer3);
	}
	public void addV(){
		van = new Van("reg1", "ford", "transit");
		car = new Car("reg2", "focus", "ford", 5, 5);
		
		vMenu.addVehicle(van);
		vMenu.addVehicle(car);
		
	}
	
	public List<Customer> getCustomers(){return cMenu.getCustomers();
	}
	
	public List<Vehicle> getVehicles(){return vMenu.getVehicles();	
	}
	
	public void removeV(){
		vMenu.removeVehicle(car);
	}

	public void removeC(){
		cMenu.removeCustomer(customer1);
	}
	
	public void assign(){
		vMenu.assignType(car);
	}
}
