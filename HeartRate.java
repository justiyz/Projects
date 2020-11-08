package com.yoc;

import java.util.Scanner;

public class HeartRate {
	private String firstName;
	private String lastName;
	private String day;
	private String month;
	private static short year;
	private int age;
	private int maximumHeartRate;

	public HeartRate(String firstName, String lastName, String day, String month) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.day = day;
		this.month = month;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName (String lastName) {
		this.lastName = lastName;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getAge() {
		age = 2020 - year;
		System.out.printf("You are %d years old", age);
		System.out.println();
		return age;
	}

	public int getMaximumHeartRate() {
		maximumHeartRate = 220 - age;
		System.out.printf("Your Maximum Heart Rate is: %d", Math.abs(maximumHeartRate));
		System.out.println();
		return maximumHeartRate;

	}

	public double getTargetHeartRate() {
		double targetHeartRate1 = 0.5 * maximumHeartRate;
		double targetHeartRate2 = 0.8 * maximumHeartRate;

		System.out.printf("Your Target Heart Rate is between %.2f and %.2f", targetHeartRate1, targetHeartRate2);
		return 0;
	}

	public String toString() {
		return getFirstName() + getLastName() + getAge() + getMaximumHeartRate() + getTargetHeartRate();

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String firstName = scanner.next().toUpperCase();
		System.out.println("Enter your last name: ");
		String lastName = scanner.next().toUpperCase();
		System.out.println("Enter your year of birth: ");
		year = scanner.nextShort();

		HeartRate heartrate = new HeartRate(firstName, lastName, "", "");
		System.out.println("======================");
		System.out.println("WELCOME " + firstName + " " + lastName);
		System.out.println("======================");
		heartrate.toString();
		scanner.close();

	}

}
