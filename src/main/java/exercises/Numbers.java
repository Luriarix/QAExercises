package exercises;

public class Numbers {
	
	
	public int digitSum (int num) {
		String numString = Integer.toString(num);
		int sum = 0;
		
		for (char digit : numString.toCharArray()) {
			sum += Character.getNumericValue(digit);
		}
		
		return sum;
	}
	
	public String oneToNine (int num) {
		
		return "a";
	}
	
}
