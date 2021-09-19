package com.Bridgelabs;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for print table of power of 2: ");
		
		long power = scan.nextLong();
		int number =1, i;
		
		
		for ( i = 1;  i <= power; i++) {
			number = number * 2; 
			System.out.println("2 ^ " + i + " = " + number);
		}

	}

}
