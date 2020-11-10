package com.yoc;

import java.util.Random;

public class RandomSentences {

	private final String[] article = { "the", "a", "one", "some", "any" };
	private final String[] noun = { "boy", "girl", "dog", "town", "car" };
	private final String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };
	private final String[] preposition = { "to", "from", "over", "under", "on" };

	public String generateSentence() {
		StringBuilder sentence = new StringBuilder();
		String space = " ";
		Random random = new Random();
		int index = random.nextInt(article.length);
		String word = article[index];
		Character firstLetter = Character.toUpperCase(word.charAt(0));
		word = word.replace(word.charAt(0), firstLetter);

		sentence.append(word);
		sentence.append(space);

		index = random.nextInt(article.length);
		word = noun[index];
		sentence.append(word);
		sentence.append(space);

		index = random.nextInt(article.length);
		word = verb[index];
		sentence.append(word);
		sentence.append(space);

		index = random.nextInt(article.length);
		word = preposition[index];
		sentence.append(word);
		sentence.append(".");

		return sentence.toString();
	}

	public void displayMultipleTimes() {
		for (int i = 0; i < 20; i++) {
			System.out.println(generateSentence());
		}
	}

	public static void main(String... args) {
		RandomSentences rs = new RandomSentences();
		rs.displayMultipleTimes();
	}

}
