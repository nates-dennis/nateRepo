package com.nathanael.vehicle;

public class Van extends Vehicle {

	private double height;
	private double weight;
	
	public Van(String reg, String make, String model) {
		super(reg, make, model);
	}

	public double getHeight() {return height;}

	public void setHeight(double height) {this.height = height;}

	public double getWeight() {return weight;}

	public void setWeight(double weight) {this.weight = weight;}
	
	@Override
	public String toString(){
		return "Van: " + String.valueOf(reg) + "\t" + String.valueOf(make) + "\t" + 
				String.valueOf(model) + "\t" + String.valueOf(getHeight()) + "\t" + 
				String.valueOf(getWeight());
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
