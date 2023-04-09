package com.girmiti.optional;

import java.util.Arrays;
import java.util.List;

public class MySql {
	
	public  static List<Customer> getAll(){
		return Arrays.asList(new Customer(7, "Hekanth", "hekanth@gmail.com", Arrays.asList(797571,805066)),
				new Customer(1, "Amar", "amar@gmail.com", Arrays.asList(797571,805066)),
						new Customer(6, "Gowri", "gowri@gmail.com", Arrays.asList(797571,805066)),
								new Customer(4, "Sushma", "Sushma@gmail.com", Arrays.asList(797571,805066)));
		
	}

}
