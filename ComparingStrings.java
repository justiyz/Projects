package com.yoc;

import java.util.Scanner;

public class ComparingStrings {
	Scanner sc = new Scanner(System.in);

	public String compare(String word1, String word2) {
		int result = 0;
		String message = null;

		result = word1.compareTo(word2);
		System.out.println(result);
		if (result == 0) {
			message = String.format("%s is equal to %s ", word1, word2);
		} else if (result > 0) {
			message = String.format("%s is greater than %s ", word1, word2);
		} else {
			message = String.format("%s is less than %s ", word1, word2);
		}
		return message;
	}

	public String comparePortionsOfStrings(String word1, String word2) {
		boolean result = false;
		String message = null;
		result = word1.regionMatches(true, 2, word2, 2, 4);
		if (result == true) {
			message = String.format("The strings are equal");
		} else {
			message = String.format("The strings are not equal");
		}
		return message;

	}

}
