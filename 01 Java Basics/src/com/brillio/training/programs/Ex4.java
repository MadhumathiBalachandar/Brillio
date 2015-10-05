package com.brillio.training.programs;

public class Ex4 {
	public static void main(String[] args) {
		int num1 = 48455;
		int num2 = -15243;
		digitReorder(num1);
		digitReorder(num2);

	}

	private static void digitReorder(int num) {
		// TODO Auto-generated method stub
		int digit;
		long temp;
		
		if (num > 0) 
		{
			for (digit = 0; digit < 9; digit++)
			for (temp = num; temp > 0; temp /= 10)
			if (temp % 10 == digit)
			System.out.print(" " + digit);
			System.out.println("\n");
			
		}
		else 
		{
			System.out.print("-");
			num = num * -1;
			for (digit = 9; digit > 0; digit--)
			for (temp = num; temp > 0; temp /= 10)
			if (temp % 10 == digit)
			System.out.print(" " + digit);
			System.out.println("\n");
		}
	
}
}
