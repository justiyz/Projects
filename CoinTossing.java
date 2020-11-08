package com.chapter6;

import java.util.Random;
import java.util.Scanner;

public class CoinTossing {
	enum Coin {
		HEADS, TAILS
	}

	private byte chances;
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();

	public Coin tossCoin() {
		int toss = random.nextInt(2);
		if (toss == 1) {
			return Coin.TAILS;
		} else {
			return Coin.HEADS;
		}

	}

	public void flip() {
		System.out.println("How many times do you want to toss the coin?: ");
		chances = scanner.nextByte();
		byte heads = 0;
		byte tails = 0;
		for (int i = 1; i <= chances; i++) {
			if (tossCoin().equals(Coin.TAILS)) {
				heads++;
			} else {
				tails++;
			}
		}
		System.out.println("You flipped the coin " + chances + " time." + "\nThe number of time heads appeared is: "
				+ heads + "" + "\nThe number of times tails appeared is: " + tails);
	}

	public static void main(String[] args) {
		CoinTossing coin = new CoinTossing();
		coin.tossCoin();
		coin.flip();

	}

}
