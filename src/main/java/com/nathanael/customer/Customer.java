package com.nathanael.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "customerId")
	private Integer id;
	
	@Column(name="Firstname")
	private String firstName;
	
	@Column(name="Lastname")
	private String surname;
	
	@Column(name="Age")
	private int age;
	
	@Column(name="Address")
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
