package com.Bridgelabs;

import java.util.Scanner;

public class SwapOfNumber {

	public static void main(String[] args) {
		int num1,num2,num3,num4;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of x , y and z");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num4 = scan.nextInt();
		
		System.out.println();
		System.out.println("before swapping numbers: " + num1 + " " + num2 + " " + num4);
		
		num3=num1;
		num1=num2;
		num2=num4;
		num4=num3;
		
		System.out.println();
		System.out.println("After swapping:" + num2 + " " + num1 + " " + num4);
		
	}

}
