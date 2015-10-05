package com.brillio.training.programs;

public class Ex6 {
	public static void main(String[] args) {
		int num1=-321;
		reverseOfNum(num1);
	}

	private static void reverseOfNum(int num1) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		if(num1>0){
		a=num1%10;
		b=num1/10;
		c=b%10;
		d=b/10;
		System.out.println(a+""+c+""+d);
		}
		else{
			num1=num1*(-1);
			a=num1%10;
			b=num1/10;
			c=b%10;
			d=b/10;
			System.out.println("-"+a+""+c+""+d);
		}
		}
		
		
		
		}
	


