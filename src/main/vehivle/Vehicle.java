package com.nathanael.vehivle;

public abstract class Vehicle {
	private String reg;
	private String model;
	private String make;
	
	public Vehicle(String reg, String model, String make) {
		super();
		this.reg = reg;
		this.model = model;
		this.make = make;
	}

	public String getReg() {
		return reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	
	
	

}
