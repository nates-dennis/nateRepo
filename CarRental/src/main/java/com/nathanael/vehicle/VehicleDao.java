package com.nathanael.vehicle;

import java.util.List;

public interface VehicleDao {
	void add(Vehicle v);
	void delete(Vehicle v);
	List<Vehicle> getVehicles();

}
