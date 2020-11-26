package com.yoc;

public class TimeConversion {

	private static String timeInWords = null;
	private static String number[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
			"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
			"twenty six", "twenty seven", "twenty eight", "twenty nine", "thirty", "thirty one", "thirty two",
			"thirty three", "thirty four", "thirty five", "thirty six", "thirty seven", "thirty eight", "thirty nine",
			"forty", "forty one", "forty two", "forty three", "forty four", "forty five", "forty six", "forty seven",
			"forty eight", "forty nine", "fifty", "fifty one", "fifty two", "fifty three", "fifty four", "fifty five",
			"fifty six", "fifty seven", "fifty eight", "fifty nine" };

	static String timeInWords(int hours, int minutes) {
		if (hours > 23 || minutes > 59) {
			throw new IllegalArgumentException("Enter a valid hour(s)/minutes(s)");
		} else if (minutes > 0 && minutes < 10 && hours == 0) {
			timeInWords = String.format("%s o' %s", number[12], number[minutes]);
		} else if (minutes > 9 && hours == 0) {
			timeInWords = String.format("%s %s", number[12], number[minutes]);
		} else if (minutes > 9 && hours > 0) {
			timeInWords = String.format("%s %s", number[hours], number[minutes]);
		}
//		System.out.println(timeInWords);
		return timeInWords;
	}

	public static String o_clock(int hours, int minutes) {
		if (minutes == 0 && hours == 0) {
			timeInWords = String.format("%s o'clock", number[12]);
		} else if (minutes == 0 && hours >= 0) {
			timeInWords = String.format("%s o'clock", number[hours]);
		}
//		System.out.println(timeInWords);
		return timeInWords;

	}

}

//package com.yoc;
//
//
//
//public class NumberInWords {
//	
//	
//	
//
//	
//}
