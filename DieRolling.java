package com.yoc;

import java.util.Random;

public class DieRolling {
	public void rollDie() {

		int[] sumOfRolledDie = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int[] frequency = new int[11];
		int count = 2;
		Random random = new Random();
		for (int roll = 0; roll < 36000; roll++) {
			int firstDie = 1 + random.nextInt(6);
			int secondDie = 1 + random.nextInt(6);
			int sum = firstDie + secondDie;
			for (int i = 0; i < sumOfRolledDie.length; i++) {
				if (sum == sumOfRolledDie[i]) {
					++frequency[i];
				}
			}
		}
		System.out.printf("%4s %20s%n", " Number", "Number Of Times");

		for (int num : frequency) {
			System.out.printf("%4d %16d%n", count++, num);
		}
	}

	public static void main(String[] args) {
		DieRolling die = new DieRolling();
		die.rollDie();
	}

}
