package com.yoc;

import java.util.Scanner;

public class ReversingNumbers {

	public void getReverseNum() {
		Scanner scanner = new Scanner(System.in);
		int reversedNum = 0;
		try {
			System.out.println("Enter a any digit you want to reverse: ");
			int number = scanner.nextInt();
			reversedNum = 0;
			while (number != 0) {
				reversedNum = reversedNum * 10;
				reversedNum = reversedNum + number % 10;
				number = number / 10;
			}
			System.out.println(reversedNum);
		} catch (Exception e) {
			System.out.println("you have entered a non-integer value");
		}

		scanner.close();

	}

	public static void main(String[] args) {
		ReversingNumbers rev = new ReversingNumbers();
		rev.getReverseNum();
	}

}
