package com.nathanael.customer;

public class Customer {
	private String firstName;
	private String surname;
	private int age;
	private String address;
	
	
	
	public Customer(String firstName, String surName, int age, String address) {
		this.firstName = firstName;
		this.surname = surName;
		this.age = age;
		this.address = address;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}



	public String getFirstName() {return firstName;}
	
	public void setFirstName(String firstName) {this.firstName = firstName;}
	
	public String getSurName() {return surname;}
	
	public void setSurName(String surName) {this.surname = surName;}
	
	public int getAge() {return age;}
	
	public void setAge(int age) {this.age = age;}
	
	public String getAddress() {return address;}
	
	public void setAddress(String address) {this.address = address;}
	
	

}
