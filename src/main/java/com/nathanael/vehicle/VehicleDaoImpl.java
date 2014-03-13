package com.nathanael.vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleDaoImpl implements VehicleDao {

	List<Vehicle> vehicles;
	
	public VehicleDaoImpl(){
		vehicles = new ArrayList<Vehicle>();
	}
	
	public void add(Vehicle v) {
		// TODO Auto-generated method stub
		vehicles.add(v);
	}

	public void delete(Vehicle v) {
		// TODO Auto-generated method stub
		vehicles.remove(v);
	}

	public List<Vehicle> getVehicles() {
		// TODO Auto-generated method stub
		return vehicles;
	}

}
