package com.Bridgelabs;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of the divisor: ");
		int divisor = scan.nextInt();
		
		System.out.println("Enter the value of the divident: ");
		int divident = scan.nextInt();
		
		int quotient = divident / divisor;
		int remainder = divident % divisor;
		
		System.out.println("Quotient value: " + quotient);
		System.out.println("Remainder value: " + remainder);

	}

}
