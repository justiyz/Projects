package com.random;

public class FindNum2 {
	private int[] number = { -1, 3, 8, 2, 9, 5 };
	private int[] number2 = { 4, 1, 2, 10, 5, 20 };

	// Find the two numbers that gives 100 when multiplied
	public void getTwoNumbers() {
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number2.length; j++) {
				if (number[i] * number2[j] == 100) {
					System.out.printf("The two numbers that gives 100 when multiplied are: %d and %d. ", number[i],
							number2[j]);
				}

			}
		}
	}

	public static void main(String[] args) {
		FindNum2 find = new FindNum2();
		find.getTwoNumbers();
	}

}
