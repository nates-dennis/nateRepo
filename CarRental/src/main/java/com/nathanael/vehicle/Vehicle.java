package com.nathanael.vehicle;

public abstract class Vehicle {
	
	protected String reg;
	protected String model;
	protected String make;
	protected String type;
	protected double price;
	protected String status;
	
	
	public Vehicle(String reg,String make, String model) {
		this.reg = reg;
		this.model = model;
		this.make = make;
	}

	public String getReg() {return reg;}

	public void setReg(String reg) {this.reg = reg;}

	public String getModel() {return model;}

	public void setModel(String model) {this.model = model;}

	public String getMake() {return make;}

	public void setMake(String make) {this.make = make;}
	
	public String getType() {return type;}

	public void setType(String type) {this.type = type;}

	public double getPrice() {return price;}

	public void setPrice(double price) {this.price = price;}

	public String getStatus() {return status;}

	public void setStatus(String staus) {this.status = staus;}

	public enum VehicleType{
		SPORTS,ESTATE,HATCHBACK,SMALL,MEDIUM,LARGE
	}
	public enum Status{
		RENTED,AVAILABLE
	}
	

}
