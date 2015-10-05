package com.brillio.training.programs;

public class Ex01 {
	public static void main(String[] args) {

		int a = 100, b = 40, c = 300, temp;
		sumOfNumbers(a, b, c);
	}


	private static void sumOfNumbers(int a, int b, int c)
	// TODO Auto-generated method stub
	{
		int temp;
		if (c > a && c > b) {
			if (a > b) {
				temp = a;
				a = b;
				b = temp;
			}
		} else if (b > a && b > c) {
			temp = b;
			b = c;
			c = temp;

			if (a > b) {
				temp = a;
				a = b;
				b = temp;
			}
		}

		else {
			temp = c;
			c = a;
			a = temp;
			if (a > b) {
				temp = a;
				a = b;
				b = temp;
			}

		}
		System.out.print("a=" + a + "b=" + b + "c=" + c);
	}
}
