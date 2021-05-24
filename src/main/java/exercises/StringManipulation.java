package exercises;

public class StringManipulation {

	public static void concat(String something, String something2) {
		String end = something2 + something;
		System.out.println(end.toUpperCase());
		
		String subSomething2 = something2.substring(0, 11);
		String subSomething = something.substring(16, 24);
		System.out.println((subSomething2 + subSomething).toUpperCase());
	}

	public static void wordCount(String something) {
		int count = 0;
		for (int i = 0; i < something.length(); i++) {
			if (something.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void name(String something) {
		for (int i = 0; i < something.length(); i++) {
			System.out.println(something.charAt(i));
		}
	}
	
	public static void reverseWordWithArray(String something) {
		String[] words = something.split(" ");
		
		for (int i = words.length; i > 0; i--) {
			System.out.println(words[(i - 1)]);;
		}
	}
	
	public static void reverseWord(String something) {
		int start = 0;
		int end = something.length() - 1;
		for (int i = something.length() - 1; i >= 0; i--) {
			if (something.charAt(i) == ' ' || i == 0) {
				start = (i == 0) ? i : i + 1;
				System.out.println(something.substring(start, end));
				end = start;
			}
		}
	}
	
	public static void stringCheck(String message, String target) {
		if (message.contains(target)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
	
}
