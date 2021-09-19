package com.Bridgelabs;

import java.util.Scanner;

public class PrimeFactorisation {
		public static void main (String args[]) {
		
			int number;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number: ");
			number = scan.nextInt();
		
			for (int i=2;i < number; i++) {
				while (number % i == 0) {
					System.out.println(i + " ");
					number = number / i;
				}
			}
			
			if (number > 2) {
				System.out.println(number);
			}
			
		}

}
