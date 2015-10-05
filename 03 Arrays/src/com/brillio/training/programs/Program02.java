package com.brillio.training.programs;

import java.util.Arrays;

public class Program02 {
	public static void main(String[] args) {
		// ar is a reference to an array object
		int[][]ar;  // ref to an array where  integer arrays are stored
		ar= new int[3][]; // need memory to store 3 integer arrays
		
		ar[0]= new int[]{10,15,13};
		System.out.println(Arrays.toString(ar[0]));
		
		ar[1]= new int[10];
		ar[2]= new int[]{23,44};
		
		for (int j = 0; j < ar.length; j++) {
			System.out.println(Arrays.toString(ar[j]));
		}
	}

}
