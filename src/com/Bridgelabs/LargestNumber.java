package com.Bridgelabs;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of num1, num2 and num3");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		if (num1 >= num2 && num1 >= num3)
			System.out.println(num1 + " is the largest Number");

		else if (num2 >= num1 && num2 >= num3)
			System.out.println(num2 + " is the largest Number");
		else
			System.out.println(num3 + " is the largest number");
	}
	
}

