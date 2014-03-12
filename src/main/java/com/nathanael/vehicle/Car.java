package com.nathanael.vehicle;

public class Car extends Vehicle {

	private int noOfSeats;
	private int noOfDoors;
	
	
	public Car(String reg, String make, String model, int seats, int doors) {
		super(reg, make, model);
		this.noOfDoors = doors;
		this.noOfSeats = seats;
	}

	public int getNoOfSeats() {return noOfSeats;}

	public void setNoOfSeats(int noOfSeats) {this.noOfSeats = noOfSeats;}

	public int getNoOfDoors() {return noOfDoors;}

	public void setNoOfDoors(int noOfDoors) {this.noOfDoors = noOfDoors;}
	
	@Override
	public String toString(){
		return "Van: " + String.valueOf(reg) + "\t" + String.valueOf(make) + "\t" + 
				String.valueOf(model) + "\t" + String.valueOf(getNoOfDoors()) + "\t" + 
				String.valueOf(getNoOfSeats());
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == null || obj.getClass() != this.getClass())
			return false;
		if(obj == this)
			return true;
		Vehicle vehicle = (Vehicle)obj;
		if(vehicle.getReg().equals(this.getReg()))
			return true;
		return true;
	}
	
	@Override
	public int hashCode(){
		return 31 * 1 + ((getReg() == null) ? 0 : getReg().hashCode());
	}
	
	

}
