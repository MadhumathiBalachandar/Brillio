package com.brillio.training.programs;

public class Ex5 {
	public static void main(String[] args) {
		int num1=50;
		int num2=-100;
		sumOfPrimes(num1,num2);
		}

	private static void sumOfPrimes(int num1, int num2) {
		// TODO Auto-generated method stub
		int a=0;
		int temp;
		int sum=0;
		
		if(num1>num2)
		{
			temp=num1;
			num1=num2;
			num2=temp;
		}
		if(num1<0) num1=2;
		if(num2<0) num2=2;
		
		for (int i = num1; i <= num2; i++) {
			a=0;
			for (int j = 2; j <= i/2; j++) {
			if(i%j==0){
			a=1;
			//break; 
			}
			}
			if(a==0){
			sum+=i;
			}
			}
			System.out.println("Sum= "+sum);
			}
			
		
		
	}


