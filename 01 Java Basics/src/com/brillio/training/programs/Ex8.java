package com.brillio.training.programs;

public class Ex8 {
	public static void main(String[] args) {
		double num=-125;
		nearestIntSqrt(num);
	}

	private static void nearestIntSqrt(double num) {
		// TODO Auto-generated method stub
		double a;
		float b;
		if(num>0){
		a= Math.sqrt(num);
		b= Math.round(a);
		System.out.println(b);
		}
		else
			System.out.println("-1");
		
		
	}

}
