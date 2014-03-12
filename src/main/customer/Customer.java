package com.nathanael.customer;

public class Customer {
	private String firstName;
	private String surName;
	private int age;
	private String address;
	
	
	
	public Customer(String firstName, String surName, int age, String address) {
		super();
		this.firstName = firstName;
		this.surName = surName;
		this.age = age;
		this.address = address;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
