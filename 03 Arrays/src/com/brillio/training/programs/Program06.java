package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class Program06 {
	public static void main(String[] args) {
		Person p1= new Person(7733,"Robert","NewYork");
		
		// array of objects
		Person[] persons={
				new Person(),
				new Person(7788, "John Scott", "NewYork"),
				new Person(7789, "mary","chennai"),
				p1
				};
		
	}

}
