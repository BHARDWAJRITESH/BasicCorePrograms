package com.Bridgelabs;

import java.util.Scanner;

public class CheckingAlphabet {

	public static void main(String[] args) {
		System.out.println("Enter a character: ");
		Scanner scan = new Scanner(System.in);
		
		char character = scan.next().charAt(0);
		
		if (character =='a' || character =='e' || character =='i' || character =='o' || character =='u' || character ==' ') {
			System.out.println("Given character is an vowel");
		}else {
			System.out.println("Given character is a consonant");
		}
		
	}

}
