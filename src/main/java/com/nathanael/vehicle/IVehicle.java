package com.nathanael.vehicle;

import java.util.List;

public interface IVehicle {
	void addVehicle(Vehicle v);
	void removeVehicle(Vehicle v);
	List<Vehicle> getVehicles();
	void assignType(Vehicle v);
	

}
