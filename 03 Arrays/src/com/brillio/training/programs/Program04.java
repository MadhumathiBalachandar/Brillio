package com.brillio.training.programs;

public class Program04 {
	public static void main(String[] args) {
		//array of 4 strings
		String[] names={"Scott", "Miller", "Alien", "Jones"};
		
		//enhanced for loop(for-each loop)
		// introduced in java 1.5
		for(String name: names) {
			System.out.println(name);
			}
		
		System.out.println("Name at index 1 is"+ names[1]);
	}

}
