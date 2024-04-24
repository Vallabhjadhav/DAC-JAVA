package com.app.tester;

import static com.app.utils.utils.*;
import static com.validation.CustomerValidation.*;
import static com.app.utils.PopulateData.populatelist;

import java.util.Map;
import java.util.Scanner;

import com.customer.Customer;
import com.exception.CustomerException;

public class CustomerApp {
	public static void main(String[] args) throws CustomerException {

		try (Scanner sc = new Scanner(System.in)) {
			Map<String, Customer> myList = populatelist();// reference of map which holds the HashMap returning from
															// poplatelist method

			String choice;
			boolean exit = true;
			System.out.println("Enter Admin Mail: ");
			String adminName = sc.next();
			System.out.println("Enter Password: ");
			String password = sc.next();
			if (adminSignin(adminName, password)) {
				while (exit) {
					System.out.println("______________________________________________________");
					System.out.println("\n\tMenu");
					System.out.println("1.SignIUp(customer registration)");
					System.out.println("2.SignIn");
					System.out.println("3.Change Password");
					System.out.println("4.Unsubscribe Customer");
					System.out.println("5.Display All Customer");
					System.out.println("6.Sort Customers bye DOB");
					System.out.println("7.Sort Customers bye DOB by Descending Order");
					System.out.println("8.Sort Customers bye ID by Descending Order");
					System.out.println("0.EXIT");
					System.out.println("______________________________________________________");
					System.out.println("Enter Your Choice: ");
					choice = sc.next();

					try {
						switch (choice) {
						case "1":// SignUp
							Customer c = signup(myList);
							myList.put(c.getEmail(), c);
							System.out.println("SignUp Successfull!!!");
							break;
						case "2":// signin
							signIn(myList);
							System.out.println("Login Successfull");
							break;
						case "3":// ChangePassword
							changePassword(myList);
							System.out.println("Password Change Succesfully!!!");
							break;
						case "4":// Unsubscribe customer
							unSubscribe(myList);
							System.out.println("UnSubscribe Succesfully!!!");
							break;
						case "5":// Display all customer
							System.out.println("______________________________________________________");
							System.out.println("\n\tDisplaying Data");
							myList.values().forEach(v -> System.out.println(v));
							break;
						case "6":// sort by Date of Birth(Ascending)
							myList.values().stream().sorted((v1, v2) -> v1.getDob().compareTo(v2.getDob()))
									.forEach(v -> System.out.println(v));
							break;
						case "7":// sort by Date of Birth(Descending)
							myList.values().stream().sorted((v1, v2) -> v2.getDob().compareTo(v1.getDob()))
									.forEach(v -> System.out.println(v));
							break;
						case "8":// sort by ID(Descending)
							myList.values().stream().sorted((v1, v2) -> ((Integer)v2.getId()).compareTo(v1.getId()))
							.forEach(v -> System.out.println(v));
							break;
						case "0":// exit from application
							System.out.println("______________________________________________________");
							System.out.println("Exiting Application!");
							System.out.println("______________________________________________________");
							exit = false;
							break;
						default:// deafult condtion for try again
							System.out.println("Invalid Choice Enter Again!!1");
							break;

						}
					} catch (Exception e)// Catch all block
					{
						sc.nextLine();// eats all unexpected literals from exception
						System.out.println(e);
					}
				}
			}
		} catch (Exception e) {

			System.out.println(e);
		}
	}
}
