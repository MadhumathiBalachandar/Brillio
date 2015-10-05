package com.brillio.training.programs;

public class Ex2 {
	public static void main(String[] args) {
		int month = -2;
		int year = 1991;
		int days = 0;
		int ret = 0;
		int number= numberOfDays(month, year, days);
		System.out.println("No of days=" +number);
	}

	private static int numberOfDays(int month, int year, int days)
	// TODO Auto-generated method stub
	{   
		int temp = 0;
		if (month <= 0 || month > 12) {
			temp= -1;
			// System.out.println("return="+ret);
		}
		if (year <= 0) {
			temp= -2;
			// System.out.println("return="+ret);
		}
		if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				&& (year > 0)) {
			temp=  31;
			// System.out.println("days=" + days);
		} else if (month == 2 && (year > 0)) {
			temp=  28;
			// System.out.println("days=" + days);
		} else if ((month == 2 || month == 4 || month == 6 || month == 9 || month == 11) && (year > 0))

		{
			temp= 30;
			// System.out.println("days=" + days);

		}
		return temp;

		// System.out.println("return="+ret);

	}

}
