package com.synechron.basics.array;

public class ArrayDemo1 {
	
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		// use when we want to manipulate the data on the basis of the index
		
		for (int i=0; i<a.length; i++) {
			a[i]= (int) (Math.random()*100);
			
		}
		
		// returns a double value with positive sign
		// greater than or equal to 0.0 and less than 1.0 
		
		
		// when we want to print the array content then
		// we should use for each loop
		for (int i:a) {
			System.out.println(i);
		}
		
		// print numbers in array divisible by 3 & 7
		for (int i:a) {
			if(i%3==0 && i%7==0)
			System.out.println(i);
		}
		

	}
}
