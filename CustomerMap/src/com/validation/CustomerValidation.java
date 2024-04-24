package com.validation;

import java.time.LocalDate;
import java.util.Map;

import com.customer.Customer;
import com.customer.ServicePlan;
import com.exception.CustomerException;

public class CustomerValidation 
{
	//Validation method for All Stastes of object
	public static Customer validateAll(String mail,String fName,String lName,String password,
			double amount,String dob,String servicePlan,Map<String,Customer> MyList) throws CustomerException
	{
		mail= validateEmail(mail, MyList);
		ServicePlan sp = validateServicePlan(servicePlan); 
		amount= validateAmount(amount, sp);
		
		return new Customer(fName, lName, mail, password, amount, LocalDate.parse(dob), sp);
	}
	//validation method for Service plan
	public static ServicePlan validateServicePlan(String servicePlan) throws CustomerException {
		return ServicePlan.valueOf(servicePlan.toUpperCase());
	}
	//Validation method for Email
	public static String validateEmail(String email, Map<String,Customer> MyList ) throws CustomerException {
		if(MyList .containsKey(email)) {
			throw new CustomerException("Email already registered!!!");
		}
		return email;
	}
	//Validation method for Service Plan Amount
	public static double validateAmount(double amount, ServicePlan s) throws CustomerException {
		if(amount < s.getPlanAmount()) {
			throw new CustomerException("Amount entered is less!!!");
		}
		return amount;
	}
	//Validation method for Signin Data
	public static void validateSignIn(String email,String Pass, Map<String,Customer> MyList) throws CustomerException 
	{
		if(MyList .containsKey(email)) 
		{	
			if(!(MyList.get(email).getPassword().equals(Pass)))
			{
				throw new CustomerException("Invalid Credentials");
			}
					
		}
	}
	
	public static boolean adminSignin(String name , String password) throws CustomerException
	{
		if(!((name.equals("vallabhjadhav789@gmail.com")) && (password.equals("Vallabh@06"))))
		{
			throw new CustomerException("Admin Not Found!!!!!");
		}
		return true;
	}
	
}
