package exercises;

import java.util.Arrays;
import java.util.List;

public class Iteration {

	public static void iter1To10() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	
	public static void iter100To999() {
		for (int i = 100; i <= 999; i++) {
			System.out.println(i);
		}
	}
	
	static List<String> digits = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
	static List<String> teens = Arrays.asList("eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen");
	static List<String> tens = Arrays.asList("twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety");
	static List<String> digitposition = Arrays.asList("", "hundred", "thousand");
	
	public static String iter1To10InWords(int i) {
			return digits.get(i - 1);
	}
	
	public static String iter1To99InWords(int i) {
			if (i <= 10) {
				return iter1To10InWords(i);			
			} else if (i < 20) {
				return teens.get(i % 10 - 1);
			} else if (i % 10 == 0) {
				return tens.get(i / 10 - 2);				
			} else {
				return tens.get(i / 10 - 2) + " " + iter1To10InWords(i % 10);								
			}
	}
	
	public static String iter100To1000InWords(int i) {
		int lenght = Integer.toString(i).length();
		if (i == 0) {
			return "";
		}
		
		if (lenght < 3) {
			return iter1To99InWords(i);		
		} else if (lenght == 3 && i % 100 != 0) {
			return iter100To1000InWords(i / 100) + " " + digitposition.get(lenght / 3) + " " + iter100To1000InWords(i % 100);
		} else if (lenght > 3 && i % 100 != 0) {
			return iter100To1000InWords(i / (int) Math.pow(10, (lenght / 3) * 3)) + " " + digitposition.get(lenght / 3 + 1) + " " + iter100To1000InWords(i % (int) Math.pow(10, (lenght / 3) * 3));
		} else {
			if (lenght == 3) {
				return iter100To1000InWords(i / 100) + " " + digitposition.get(lenght / 3);				
			} else {
				return iter100To1000InWords(i / (int) Math.pow(10, (lenght % 3 == 0) ? (lenght - 3) : (lenght / 3) * 3 - (lenght % 3))) + " " + digitposition.get((lenght - 3) / 3 + 1);	
			}
		}
	}
}
