package com.synechron.basics.array;

public class ArrayDemo3 {
	
	// we need object 


	
	public boolean isValuePresent(int value) {
		
		int a[] ={10, 20, 24, 23, 200,1000};
		
		for (int i:a) {
			if (i == value) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		ArrayDemo3 arrayDemo3 = new ArrayDemo3();
		// reference = object 
		boolean result = arrayDemo3.isValuePresenr(200);
		
		System.out.println(result);
	}

}
