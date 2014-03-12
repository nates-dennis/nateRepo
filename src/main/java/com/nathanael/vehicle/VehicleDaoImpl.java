package com.nathanael.vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleDaoImpl implements VehicleDao {

	List<Vehicle> vehicles;
	
	public VehicleDaoImpl(){
		vehicles = new ArrayList<Vehicle>();
	}
	
	@Override
	public void add(Vehicle v) {
		// TODO Auto-generated method stub
		vehicles.add(v);
	}

	@Override
	public void delete(Vehicle v) {
		// TODO Auto-generated method stub
		vehicles.remove(v);
	}

	@Override
	public List<Vehicle> getVehicles() {
		// TODO Auto-generated method stub
		return vehicles;
	}

}
