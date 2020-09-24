package com.chapter6;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

	int userGuess;
	int systemGuess;
	short guessCount = 0;
	byte numOfTimeUserGuess = 5;
	Scanner scanner = new Scanner(System.in);

	public void generateRandomNumbers() {
		Random random = new Random();
		systemGuess = random.nextInt(1000);
		System.out.println(systemGuess);
		System.out.println();
	}

	public void guessNumber() {

		while (true) {
			System.out.println("Guess a number between 1 and 1000: ");
			userGuess = scanner.nextInt();
			guessCount++;
			if (userGuess <= 1000) {
				System.out.println(systemGuess);
				System.out.println();
				if (userGuess == systemGuess) {
					System.out.println("Congratulations... !!!");
					if (guessCount <= numOfTimeUserGuess) {
						System.out.println("You know the secret! ");
					} else if (guessCount == numOfTimeUserGuess) {
						System.out.println("Aha! You know the secret! ");
					} else {
						System.out.println("You should be able to do better!");
					}
					System.out.println();
				} else if (userGuess > systemGuess) {
					System.out.println("Too high... try again.");
					System.out.println();
				} else if (userGuess < systemGuess) {
					System.out.println("Too low... try again.");
					System.out.println();
				}
				System.out.println("Do you want to try again? 1 to Continue, 0 to Exit ");
				byte tryAgain = scanner.nextByte();
				if (tryAgain == 0) {
					break;
				}
			} else {
				System.out.println("You have a number greater than 1000...");
				System.out.println();
			}
			generateRandomNumbers();
			System.out.println();

		}
		System.out.println(guessCount);

	}

	public static void main(String[] args) {
		GuessTheNumberGame guess = new GuessTheNumberGame();
		guess.generateRandomNumbers();
		guess.guessNumber();

	}

}
