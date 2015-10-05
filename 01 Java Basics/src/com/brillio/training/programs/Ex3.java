package com.brillio.training.programs;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		System.out.println("Enter :");
		Scanner sc = new Scanner(System.in);
		int[] n = new int[4];
		for (int i = 0; i < 4; i++) {
			n[i] = sc.nextInt();
		}

		int h = n[0], m = n[1], s = n[2], f = n[3], u = 0;
		f=Math.abs(f);
		//System.out.println(f);
		
		if (h > 24 || m > 60 || s > 60) {
			System.out.println("Invalid Input");
			System.exit(1);
		}

		if (f >= 3600) {
			u = f / 3600;
			f -= u * 3600;
			h += u;
		}

		if (f < 3600) {
			u = f / 60;
			f -= u * 60;
			m += u;
		} 
		
		if(f<60){
			s += f;
		}

		if (s > 60) {
			m++;
			s -= 60;
		}

		if (m > 60) {
			h++;
			m -= 60;
		}
		System.out.println("Future Time" + h + " " + m + " " + s);

	}
}