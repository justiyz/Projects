package com.yoc;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAidedInstruction {
	Scanner scanner = new Scanner(System.in);
	SecureRandom sr = new SecureRandom();
	byte limit = 5;
	byte question;
	int firstNumber;
	int secondNumber;
	int correctAnswer;
	int inCorrectAnswer;
	byte noOfcorrectResponses;
	byte noOfIncorrectResponses;

	public void generateRandomNumbers() {
		firstNumber = sr.nextInt(limit);
		secondNumber = sr.nextInt(limit);

	}

	public void generatePossibleResponses4CorrectAnswers() {
		correctAnswer = 1 + sr.nextInt(4);
		switch (correctAnswer) {
		case 1:
			System.out.println("Excellent!");
			break;
		case 2:
			System.out.println("Very good!");
			break;
		case 3:
			System.out.println("Nice work!");
			break;
		case 4:
			System.out.println("Keep up with the good work!");
			break;
		}

	}

	public void generatePossibleResponses4IncorrectAnswers() {
		inCorrectAnswer = 1 + sr.nextInt(4);
		switch (inCorrectAnswer) {
		case 1:
			System.out.println("No. Please try again!");
			break;
		case 2:
			System.out.println("Don't give up!");
			break;
		case 3:
			System.out.println("Wrong. Try once more!");
			break;
		case 4:
			System.out.println("No. Keep trying!");
			break;
		}
	}

	public void multiplyGeneratedNumbers() {

		label: while (question != 10) {
			System.out.println("What is " + firstNumber + " multiplied by " + secondNumber + " ?.");
			int result = scanner.nextInt();
			if (result == firstNumber * secondNumber) {
				System.out.println();
				noOfcorrectResponses++;
				generatePossibleResponses4CorrectAnswers();
				System.out.println();
			} else {
				System.out.println();
				generatePossibleResponses4IncorrectAnswers();
				System.out.println();
				noOfIncorrectResponses++;
//				continue label;
			}
			question++;
			System.out.println("Number of questions answered is: " + question);
			System.out.println("You got " + noOfcorrectResponses + " question(s) correctly.");
			System.out.println("You failed " + noOfIncorrectResponses + " question(s).");
			System.out.println();
			generateRandomNumbers();
		}
		gradings();
	}

	public void gradings() {
		// I used BigDecimal to find the percentage
		int percentOfResponses = 0;
		switch (noOfcorrectResponses) {
		case 1:
			percentOfResponses = (int) (noOfcorrectResponses * (10.0f / noOfcorrectResponses));
			System.out.println("You scored " + percentOfResponses + "% " + " overall");
			break;
		case 2:
			percentOfResponses = (int) (noOfcorrectResponses * (20.0f / noOfcorrectResponses));
			System.out.println("You scored " + percentOfResponses + "% " + " overall");
			break;
		case 3:
			percentOfResponses = (int) (noOfcorrectResponses * (30.0f / noOfcorrectResponses));
			System.out.println("You scored " + percentOfResponses + "% " + " overall");
			break;
		case 4:
			percentOfResponses = (int) (noOfcorrectResponses * (40.0f / noOfcorrectResponses));
			System.out.println("You scored " + percentOfResponses + "% " + " overall");
			break;
		case 5:
			percentOfResponses = (int) (noOfcorrectResponses * (50.0f / noOfcorrectResponses));
			System.out.println("You scored " + percentOfResponses + "% " + " overall");
			break;
		case 6:
			percentOfResponses = (int) (noOfcorrectResponses * (60.0f / noOfcorrectResponses));
			System.out.println("You scored " + percentOfResponses + "% " + " overall");
			break;
		case 7:
			percentOfResponses = (int) (noOfcorrectResponses * (70.0f / noOfcorrectResponses));
			System.out.println("You scored " + percentOfResponses + "% " + " overall");
			break;
		case 8:
			percentOfResponses = (int) (noOfcorrectResponses * (80.0f / noOfcorrectResponses));
			System.out.println("You scored " + percentOfResponses + "% " + " overall");
			break;
		case 9:
			percentOfResponses = (int) (noOfcorrectResponses * (90.0f / noOfcorrectResponses));
			System.out.println("You scored " + percentOfResponses + "% " + " overall");
			break;
		case 10:
			percentOfResponses = (int) (noOfcorrectResponses * (100.0f / noOfcorrectResponses));
			System.out.println("You scored " + percentOfResponses + "% " + " overall");
			break;
		}
		if (percentOfResponses >= 65) {
			System.out.println("Congratulations, you are ready to go to the next level!");

		} else {
			System.out.println("Please ask your teacher for extra help!");
		}

	}

	public static void main(String[] args) {
		ComputerAidedInstruction comp = new ComputerAidedInstruction();
		comp.generateRandomNumbers();
		comp.multiplyGeneratedNumbers();

	}

}
