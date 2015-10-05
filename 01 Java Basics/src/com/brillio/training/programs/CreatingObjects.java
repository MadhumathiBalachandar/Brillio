package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class CreatingObjects {
	public static void main(String[] args) {
		Person p1;  // Created a Reference Variable p1(8 byte), Class person is not loaded here
		
		p1= new Person();  // allocate memory for a person object, class is loaded here
							// Note down the address
							// Call constructor i.e the class person
		System.out.println("p1 is"+ p1);
		System.out.println("Name="+p1.name);
		System.out.println("Age="+p1.age );
		
		
	}

}
