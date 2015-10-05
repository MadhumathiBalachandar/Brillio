package com.brillio.training.programs;

import java.util.Arrays;

public class Program03 {
	public static void main(String[] args) {
		
		int [][] nums={
				{10,20},
				{10,30,45},
				{13,12,13,54,100},
				{10,34,35,56,78}};
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(Arrays.toString(nums[i]));
		}
		
		//String []names={"Scott", "Miller", "Alien", "Jones"};
		
	}

}
