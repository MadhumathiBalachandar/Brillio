package com.brillio.training.programs;

import java.util.Arrays;

public class Program01 {
	
	public static void increment(int[] arr,int by){
		for (int i = 0; i < arr.length; i++) {
			arr[i] += by;
		}
		
		
	}
	public static void main(String[] args) {
		// n is a reference to an array object
		int [] n={12, 449,5659};
		System.out.println(Arrays.toString(n));
		System.out.println(n[2]);
		
		n= new int[3];
		n[0]=100;
		n[1]=12;
		n[2]=120;
		System.out.println(Arrays.toString(n));
		// n={12,449,5659}; //error
		n= new int[]{48,587,383};
		
		n[2]= 12;
		n[0]= 22;
		n[1]= 393;
		
		int index=2;
		System.out.println(n[index]);
		
		
		System.out.println(Arrays.toString(n));
		
		increment(n,10);
		System.out.println(Arrays.toString(n));
		//System.out.println(n);
		
		//n[3]= 39393; // throws ArrayIndex out of bounds Exception()
		//n[-1]= 434;  // throws ArrayIndex out of bounds Exception() 
	}

}
