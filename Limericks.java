package com.yoc;

import java.util.Random;

public class Limericks {

	private final String[] lime1 = { "i", "she", "who", "he" };
	private final String[] lime2 = { "saw", "had", "knew", "discovered" };
	private final String[] lime3 = { "a man", "a boy", "a father", "a teacher" };
	private final String[] lime4 = { "with a", "that had a", "alongside a", "next to a" };
	private final String[] lime5 = { "bear", "thread", "spear", "deer" };
	private final String[] lime6 = { "knife", "kite", "foresight", "website" };
	private final String space = " ";
	Random random = new Random();

	public String generateWords() {
		StringBuilder sentence = new StringBuilder();
		int index = random.nextInt(lime1.length);
		String word = lime1[index];
		word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
		sentence.append(word);
		sentence.append(space);

		index = random.nextInt(lime1.length);
		word = lime2[index];
		sentence.append(word);
		sentence.append(space);

		index = random.nextInt(lime1.length);
		word = lime3[index];
		sentence.append(word);
		sentence.append(space);

		index = random.nextInt(lime1.length);
		word = lime4[index];
		sentence.append(word);
		sentence.append(space);

		index = random.nextInt(lime1.length);
		word = lime5[index];
		sentence.append(word);
		sentence.append(".");

		return sentence.toString();
	}

	public String generateLimericks() {
		StringBuilder sentence = new StringBuilder();
		int index = random.nextInt(lime1.length);
		String word = lime1[index];
		word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
		sentence.append(word);
		sentence.append(space);

		index = random.nextInt(lime1.length);
		word = lime2[index];
		sentence.append(word);
		sentence.append(space);

		index = random.nextInt(lime1.length);
		word = lime3[index];
		sentence.append(word);
		sentence.append(space);

		index = random.nextInt(lime1.length);
		word = lime4[index];
		sentence.append(word);
		sentence.append(space);

		index = random.nextInt(lime1.length);
		word = lime6[index];
		sentence.append(word);
		sentence.append(".");

		return sentence.toString();
	}

	public void displayLimericks() {
		for (int i = 0; i < 2; i++) {
			System.out.println(generateWords());
		}
		for (int j = 0; j < 2; j++) {
			System.out.println(generateLimericks());
		}
		System.out.println(generateWords());
	}

	public static void main(String... args) {
		Limericks lm = new Limericks();
		lm.displayLimericks();
	}

}
