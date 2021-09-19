package com.Bridgelabs;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		
		Scanner coin = new Scanner(System.in);
		System.out.println("Enter number of times to flip the coin: ");
		
		int loopCount = coin.nextInt();
		int heads = 0, tails = 0;
		
		for (int i = 1; i <= loopCount;i++) {
			int countCheck = (int) Math.floor(Math.random() *10) % 2;
			
			if(countCheck == 0) {
				System.out.println("This is tails");
				tails++;
			}else {
				System.out.println("This is heads");
				heads++;
			}
		}
		
		double percentageOfHeads = ((double) heads / loopCount) * 100;
		double percentageOfTails = ((double) tails / loopCount) * 100;
		
		System.out.println("Percentage of heads is: " + percentageOfHeads);
		System.out.println("Percentage of tails is: " + percentageOfTails);
	}

}
