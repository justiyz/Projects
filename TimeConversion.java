package com.yoc;

public class TimeConversion {

	void timeInWords(int hours, int minutes) {
		String number[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
				"twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six",
				"twenty seven", "twenty eight", "twenty nine" };

		if (minutes == 0)
			System.out.println(number[hours] + " o' clock ");

		else if (minutes == 1)
			System.out.println("one minute past " + number[hours]);

		else if (minutes == 59)
			System.out.println("one minute to " + number[(hours % 12) + 1]);

		else if (minutes == 15)
			System.out.println("quarter past " + number[hours]);

		else if (minutes == 30)
			System.out.println("half past " + number[hours]);

		else if (minutes == 45)
			System.out.println("quarter to " + number[(hours % 12) + 1]);

		else if (minutes <= 30)
			System.out.println(number[minutes] + " minutes past " + number[hours]);

		else if (minutes > 30)
			System.out.println(number[60 - minutes] + " minutes to " + number[(hours % 12) + 1]);
	}

	public static void main(String... args) {

		TimeConversion tc = new TimeConversion();
		tc.timeInWords(7, 1);
		tc.timeInWords(4, 15);

	}
}
