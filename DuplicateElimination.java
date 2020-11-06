package com.yoc;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElimination {

	Scanner scanner = new Scanner(System.in);

	public void checkForDuplicate() {
		byte limit = 10;
		Set<Integer> set = new HashSet<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any 10 number between 01 and 100: ");
		for (int i = 0; i < limit; i++) {
			set.add(scanner.nextInt());
		}
		System.out.println("The Unique numbers are: ");
		for (Integer i : set) {
			System.out.printf(" %d \t", i);
		}
		scanner.close();
	}

	public static void main(String[] args) {
		DuplicateElimination dup = new DuplicateElimination();
		dup.checkForDuplicate();

	}

}
