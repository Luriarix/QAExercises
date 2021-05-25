package exercises;


public class CheckString {
	public static boolean name(String toCheck) {
		String actualString = "I wonder";
		return toCheck.equals(actualString);
	}	
	
	public static boolean name(String toCheck, String actualString) {
		BiPredicate check = (String a, String b) -> a.equals(b);
		
		CheckString lambda = new CheckString();
		System.out.println(lambda.operate(toCheck, actualString, check));
		return lambda.operate(toCheck, actualString, check);
		
		
//		return toCheck.equals(actualString);
	}
	

	interface BiPredicate {
		boolean concat(String a, String b);
	}
	
	private boolean operate(String a, String b, BiPredicate funcObj) {
        return funcObj.concat(a, b);
    }
}
