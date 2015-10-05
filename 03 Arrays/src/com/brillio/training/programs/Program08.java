package com.brillio.training.programs;

public class Program08 {
	public static void main(String[] args) {
		
		
		//to supply command line arguements in eclipse
		//use the menu "Run" -> Run Configuration.."
		//select the arguements tab
		//pass the values through "Program Arguements"
		
		//to apply strings with space, use the double quotes
		
		//to supply double quotes as part of the input, escape them
		// for eg "5' 10\"" will be accepted as 5' 10"
		System.out.println("there are"+ args.length+ "command line arguements");
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] is "+ args[i]);
			
		}
	}

}
