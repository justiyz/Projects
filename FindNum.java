package com.random.findnum;

public class FindNum {
	private int[] number = { -1, 3, 8, 2, 9, 5 };

	// find the two numbers in the array that gives 17 when added
	public void sumOfTwoNum() {
		int[] tempNum = number;
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < i; j++) {
				if (number[i] + tempNum[j] == 17) {
					System.out.printf("The sum of two numbers to give 17 are: %d and %d... ", number[i], tempNum[j]);
				}

			}
		}
	}

	public static void main(String[] args) {
		FindNum find = new FindNum();
		find.sumOfTwoNum();
	}

}
