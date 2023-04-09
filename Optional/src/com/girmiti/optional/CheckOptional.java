package com.girmiti.optional;

import java.util.List;

public class CheckOptional {
	
	public static Customer getCustomerByEmailid(String email) throws Exception {
		List<Customer> customers=MySql.getAll();
		return customers.stream()
		         .filter(custom->custom.getEmail().equals(email))
		         .findAny().orElseThrow(()->new Exception("no"));
		
		         
	}
	public static void main(String[] args) throws Exception {
		Customer customer = getCustomerByEmailid("Sushma@gmail.com");
		System.out.println(customer);
	}

}
