package com.synechron.basics.array;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
	
		String ip="192.168.1.1";
		
		// each ip address cell has a range of 0 to 255
		// based on the value from 1st cell, need to return the class of ip
		
		String s[] =ip.split("\\."); 
				
		for (String value : s) {
			// check each cell should have the value between 0 and 255
			
		int cellValue = Integer.parseInt(value);
		// transform our string into int value
		
		if(cellValue>=0 && cellValue<=255) {
			System.out.println(value);
		}
		
		else {
			System.out.println("ip is not valid");
			System.exit(1);
		}
		
		}
		
		// 
		
		int cellOneValue = Integer.parseInt(s[0]);
		
		if(cellOneValue>=1 && cellOneValue<=126 ) {
			System.out.println("Ip belongs to class A");
		}
		
		else if(cellOneValue>=128 && cellOneValue<=191 ) {
			System.out.println("Ip belongs to class B");
		}
		
		else if(cellOneValue>=192 && cellOneValue<=223 ) {
			System.out.println("Ip belongs to class C");
		}
		
		else if(cellOneValue>=224 && cellOneValue<=239 ) {
			System.out.println("Ip belongs to class D");
		}
		
		else if(cellOneValue>=240 && cellOneValue<=254 ) {
			System.out.println("Ip belongs to class E");
		}
		else {
			System.out.println("not in the available range");
		}
	

		
		
}}
