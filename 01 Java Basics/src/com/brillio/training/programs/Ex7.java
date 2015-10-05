package com.brillio.training.programs;

public class Ex7 {
	public static void main(String[] args) {
		int binaryNumber=10101010;
		binaryToDecimay(binaryNumber);
	}

	private static void binaryToDecimay(int binaryNumber) {
		// TODO Auto-generated method stub
		int decimal = 0;
	    int p = 0;
	    while(true){
	      if(binaryNumber == 0){
	        break;
	      } else {
	          int temp = binaryNumber%10;
	          decimal += temp*Math.pow(2, p);
	          binaryNumber = binaryNumber/10;
	          p++;
	       }
	    }
	   System.out.println(decimal);
	  }
	}
	


