package com.customer;

import java.time.LocalDate;

public class Customer 

{
	//State of Objects
	private static int counter = 1;
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan servicePlan;
	private boolean subscribe;
	
	//Constructor
	public Customer(String fname, String lname, String email, String password, double registrationAmount,
			LocalDate dob, ServicePlan servicePlan) {
		
		this.id = counter;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.servicePlan = servicePlan;
		this.subscribe = true;
		counter++;
	}

    //Getter Setter Methods
	public String getPassword() {
		return password;
	}


	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}
	
	public void setPassword(String setPassword)
	{
		this.password=setPassword;
	}
	
	public void setSubscribe(boolean sub)
	{
		this.subscribe = sub;
	}
	
	

	public LocalDate getDob() {
		return dob;
	}

	//Override method toString() which is from superclass 
	@Override
	public String toString() {
		return "Customer id: " + id + ", fisrt name: " + fname + ", last name: " + lname + ", Email ID: " + email  + ", Registration Amount: " + registrationAmount + ", Date of Birth: " + dob + ", Service Plan: "
				+ servicePlan + ((subscribe)?" Subscribe":" Unsubscribe");
	}

	
	
	
	
	
	
	
}
