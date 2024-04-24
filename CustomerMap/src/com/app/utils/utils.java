package com.app.utils;

import static com.validation.CustomerValidation.validateSignIn;

import java.util.Map;
import java.util.Scanner;

import com.customer.Customer;
import com.exception.CustomerException;
import com.validation.CustomerValidation;

public class utils 
{	
	static Scanner sc = new Scanner(System.in);
	
	// Method which signup the user which returns Customer
		public static Customer signup(Map<String, Customer> myList) throws CustomerException {
			System.out.println("Enter Your Mail ID: ");
			String mail = sc.next();
			System.out.println("Enter First Name: ");
			String fName = sc.next();
			System.out.println("Enter Last Name: ");
			String lName = sc.next();
			System.out.println("Enter Password: ");
			String password = sc.next();
			System.out.println("Enter Registration Amount: ");
			double amount = sc.nextDouble();
			System.out.println("Enter You Date of Birth: ");
			String dob = sc.next();
			System.out.println("Enter Service Plan: ");
			String servicePlan = sc.next();

			Customer c = CustomerValidation.validateAll(mail, fName, lName, password, amount, dob, servicePlan, myList);
			return c;
		}
	
	//Method which signin the user which returns Customer
		public static void signIn(Map<String,Customer> myList) throws CustomerException
		{
			System.out.println("Enter mail id: ");
			String email= sc.next();
			System.out.println("Enter password");
			String password= sc.next();
			validateSignIn(email,password,myList);
			
		}
		//Method which Changepassword the user which returns Customer
		public static void changePassword(Map<String,Customer> myList) throws CustomerException
		{
			String email = signin(myList);
			System.out.println("Enter New password");
			String password2= sc.next();
			myList.get(email).setPassword(password2);
			
		}
		//Method which Unsubscribe the user which returns Customer
		public static void unSubscribe(Map<String,Customer> myList) throws CustomerException
		{
			String email = signin(myList);
			myList.get(email).setSubscribe(false);
		
		}
		
		public static String signin(Map<String,Customer> myList) throws CustomerException
		{
			System.out.println("Enter mail id: ");
			String email= sc.next();
			System.out.println("Enter password");
			String password1= sc.next();
			validateSignIn(email,password1,myList);
			return email;
		}
}
