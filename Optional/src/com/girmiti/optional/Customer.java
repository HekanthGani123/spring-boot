package com.girmiti.optional;

import java.util.List;

public class Customer {
	
	private Integer id;
	private String name;
	private String email;
	private List<Integer> phoneNumbers;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Customer(Integer id, String name, String email, List<Integer> phoneNumbers) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
	}
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List<Integer> getPhoneNumbers() {
		return phoneNumbers;
	}


	public void setPhoneNumbers(List<Integer> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phoneNumbers=" + phoneNumbers + "]";
	}
	
	
	

}
