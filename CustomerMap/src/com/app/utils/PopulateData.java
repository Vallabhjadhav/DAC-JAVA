package com.app.utils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import com.customer.Customer;
import com.customer.ServicePlan;
import com.exception.CustomerException;

public class PopulateData {
	static Scanner sc = new Scanner(System.in);

	// populating Data
	public static HashMap<String, Customer> populatelist() throws CustomerException {
		HashMap<String, Customer> customers = new HashMap<>();
		customers.put("abc@gmail.com", new Customer("Vallabh", "Jadhav", "abc@gmail.com", "abcd", 5000,
				LocalDate.parse("2002-02-02"), ServicePlan.valueOf("SILVER")));
		customers.put("efg@gmail.com", new Customer("Akash", "Solunke", "efg@gmail.com", "egfh", 6000,
				LocalDate.parse("2001-12-20"), ServicePlan.valueOf("DIAMOND")));
		customers.put("hij@gmail.com", new Customer("Aniket", "Ghodke", "hij@gmail.com", "ijkl", 7000,
				LocalDate.parse("2000-10-30"), ServicePlan.valueOf("GOLD")));
		customers.put("klm@gmail.com", new Customer("Jayesh", "Sapkale", "klm@gmail.com", "mnop", 4000,
				LocalDate.parse("2002-05-06"), ServicePlan.valueOf("PLATINUM")));
		customers.put("mno@gmail.com", new Customer("Guru", "Kamble", "mno@gmail.com", "qrst", 10000,
				LocalDate.parse("2005-08-15"), ServicePlan.valueOf("SILVER")));

		return customers;
	}

	

}
