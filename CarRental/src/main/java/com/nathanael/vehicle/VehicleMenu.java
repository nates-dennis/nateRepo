package com.nathanael.vehicle;

import java.util.List;

import com.nathanael.vehicle.Vehicle.Status;
import com.nathanael.vehicle.Vehicle.VehicleType;

public class VehicleMenu implements IVehicle {

	private VehicleDao vehicleData;
	
	
	
	public VehicleMenu() {
		vehicleData = new VehicleDaoImpl();
	}

	@Override
	public void addVehicle(Vehicle v) {
		// TODO Auto-generated method stub
		v.setStatus(Status.AVAILABLE.name());
		vehicleData.add(v);
	}

	@Override
	public void removeVehicle(Vehicle v) {
		// TODO Auto-generated method stub	
		vehicleData.delete(v);
	}

	@Override
	public List<Vehicle> getVehicles() {
		// TODO Auto-generated method stub
		return vehicleData.getVehicles();
	}

	@Override
	public void assignType(Vehicle v) {
		// TODO Auto-generated method stub
		if(v instanceof Car){
			if(((Car) v).getNoOfDoors() == 5 && ((Car) v).getNoOfSeats() == 5){
				v.setType(VehicleType.ESTATE.name());
			}else if(((Car) v).getNoOfDoors() == 3 && ((Car) v).getNoOfSeats() == 5){
				v.setType(VehicleType.HATCHBACK.name());
			}else if(((Car) v).getNoOfDoors() == 3 && ((Car) v).getNoOfSeats() == 2){
				v.setType(VehicleType.SPORTS.name());
			}
		}else{
			if(((Van) v).getHeight() <= 10.0 && ((Van) v).getWeight() <= 50.0){
				v.setType(VehicleType.SMALL.name());
			}else if(((Van) v).getHeight() > 10.0 && ((Van) v).getWeight() > 50.0){
				
			}else if(((Van) v).getHeight() > 50.0 && ((Van) v).getWeight() > 100.0){
				
			}
		}
	}
	

}
