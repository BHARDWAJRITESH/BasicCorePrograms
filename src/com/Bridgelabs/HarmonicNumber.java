package com.Bridgelabs;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String args []) {
		
		int number;
		float harmonicNumber = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the nth term:-  ");
		number =scan.nextInt();
		
		for(int i =1; i < number; i++) {
			harmonicNumber = harmonicNumber +(float)1/i;
		}
		
		System.out.println("Sum of n terms in harmonic series= " + harmonicNumber);
	}
	
}
