package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class Program07 {
	public static void main(String[] args) {
		
		//this is not allocation of space for person objects
		//this is a space for 3 references of person type
		//equivalent of creating - Person p1,p2,p3
		Person[] persons= new Person[3];  // array of 3 Person
		
		//must create a Person object before using it for
		//invoking methods
		
		//this line is equivalent to null.setId(4)
		//and will throw an exception of type NullPointerException
		persons[0].setId(4);
		persons[0].setName("madhhu");
		persons[0].setCity("bangalore");
		
		System.out.println(persons[1]);
		
	}

}
