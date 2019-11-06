package firstPackage;

public class PrintNoInWords {
	public static void main(String[] args) {

		int num = 9046;
		convertNumtoWords(num);
	}

	public static void convertNumtoWords(int num) {

		String[] ones = { " ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "ninteen" };

		String[] tens = { " ", " ", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty" };

		String[] hundreds = { " ", "hundred", "two hundred", "three hundred", "four hundred", "five hundred",
				"six hundred", "seven hundred", "eight hundred", "nine hundred" };

		String[] thousands = { " ", "one thousand", "two thousand", "three thosand", "four thousand", "five thousand",
				"six thosand", "seven thousand", "eight thousand", "nine thousand" };

		if (num > 999 & num < 9999) {
			System.out.print(thousands[num / 1000]);
			num = num % 1000;
		}
		if (num > 99 & num < 999) {
			System.out.print(" " + hundreds[num / 100]);
			num = num % 100;
		}
		if (num > 19 & num < 99) {
			System.out.print(" " + tens[num / 10] + " " + ones[num % 10]);
		} else if (num < 19 & num > 0) {
			System.out.print(" " + ones[num]);
		} else if (num == 0) {
			System.out.println("zero");
		} else if (num < 0)
			System.out.println("Number less than 0");
		else
			System.out.println("Number greater than 1000");
	}

}
