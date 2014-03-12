package com.nathanael.vehivle;

public class Car extends Vehicle {

	private int noOfSeats;
	private int noOfDoors;
	
	
	public Car(String reg, String model, String make, int seats, int doors) {
		super(reg, model, make);
		this.noOfDoors = doors;
		this.noOfSeats = seats;
		// TODO Auto-generated constructor stub
	}


	public int getNoOfSeats() {
		return noOfSeats;
	}


	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}


	public int getNoOfDoors() {
		return noOfDoors;
	}


	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	
	
	

}
