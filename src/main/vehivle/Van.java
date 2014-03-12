package com.nathanael.vehivle;

public class Van extends Vehicle {

	private double height;
	private double weight;
	
	public Van(String reg, String model, String make) {
		super(reg, model, make);
		// TODO Auto-generated constructor stub
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	

}
