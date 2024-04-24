package com.customer;

public enum ServicePlan 
{
	
	SILVER(1000),
	GOLD(2000),
	DIAMOND(3000),
	PLATINUM(5000);
	
	private double planAmount;

	private ServicePlan(double planAmount) 
	{
		this.planAmount = planAmount;
	}
	

	public double getPlanAmount() {
		return planAmount;
	}


	@Override
	public String toString() 
	{		
		return "Service Plan: "+ name()+" Amount: "+planAmount;
	}
	
	
	
	
	
}
