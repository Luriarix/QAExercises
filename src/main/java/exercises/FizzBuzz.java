package exercises;

public class FizzBuzz {
	public static String outcome(int num) {
		if (num % 3 == 0 && num % 5 == 0) {
			return "FizzBuzz";
		} else if (num % 3 == 0 || num % 5 == 0){
			return (num % 3 == 0) ? "Fizz" : "Buzz";
		} else { 
			return Integer.toString(num);
		} 
	}
}
