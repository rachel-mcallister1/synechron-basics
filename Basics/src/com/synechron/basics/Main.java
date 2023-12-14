package com.synechron.basics;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		// Scanner: it will help us to accept vales from the user
		// this class is introduced from javaSE5
		
		// print
		System.out.println("hello from Rachel");
		
		// array: a set of similar type elements.
		
		// array index: will start with -1
		
		
//		int a [] = {1, 2, 3, 4, 5}; 
//		System.out.println(a[4]);
		
		
		
//		for (int i : a) {
//			System.out.println(i);
//		}
//		
		
		int a[] = new int[5];
		for (int i=0; i < a.length; i++) {
			a[i] = (int) (Math.random()*1000);
		}
		
		for (int i : a) {
			
			System.out.println(i);
		}
		
		System.out.println("enter the value to delete from array");
		int userInput = scanner.nextInt(); // 
		// nextXXX() : XXX: name of data type
		// 8 data types. + string
 		
		System.out.println(userInput);
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==userInput) {
				System.out.println("number found and deleted");
				// i + 1 => i.... if i+1 (a.length) should place 0
				
				
				a[i] = 0;
			}
		}
		for (int i : a) {
			System.out.println(i);
		}
		// delete the value?
		// delete the index?

	}

}
