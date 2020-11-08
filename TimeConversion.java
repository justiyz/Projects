package com.yoc;

public class TimeConversion {

	private static String timeInWords = null;
	private static String number[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
			"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
			"twenty six", "twenty seven", "twenty eight", "twenty nine", "thirty" };

	static String minutesPastCurrentHour(int hours, int minutes) {

		if (minutes == 1) {
			timeInWords = String.format("one minute past %s", number[hours]);
		} else {
			timeInWords = String.format("The time is %s minutes past %s", number[minutes], number[hours]);
		}
		return timeInWords;
	}

	static String minutesToNextHour(int hours, int minutes) {
		if (minutes > 30 && minutes < 59) {
			timeInWords = String.format("%s minutes to %s", number[60 - minutes], number[(hours % 12) + 1]);
		} else {
			timeInWords = String.format("%s minute to %s", number[60 - minutes], number[(hours % 12) + 1]);
		}
		return timeInWords;
	}

	static String o_Clock(int hours, int minutes) {
		if (hours > 12 || minutes > 0) {
			throw new IllegalArgumentException("This is a 12-hour clock. Enter a valid hour(s)/minutes(s)");
		} else {
			timeInWords = String.format("The time is %s o'Clock", number[hours]);
		}
		return timeInWords;

	}

}
