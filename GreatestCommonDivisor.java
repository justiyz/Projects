package com.chapter6;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public void gcd() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int FirstNumber = scanner.nextInt();
		System.out.println("Enter the second number: ");
		int SecondNumber = scanner.nextInt();
		while (FirstNumber != SecondNumber) {
			if (FirstNumber > SecondNumber) {
				FirstNumber -= SecondNumber;
			} else {
				SecondNumber -= FirstNumber;
			}
		}
		System.out.println("The greatest common divisor is: " + FirstNumber);
		scanner.close();

	}

	public static void main(String[] args) {
		GreatestCommonDivisor grt = new GreatestCommonDivisor();
		grt.gcd();

	}

}
