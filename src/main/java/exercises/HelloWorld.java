package exercises;

public class HelloWorld {
	
	public static String hello(String something) {
		System.out.println("HelloWorld");
		Consumer add = (String a, String b) -> a + b;
		
		HelloWorld lambda = new HelloWorld();
		System.out.println(lambda.operate("HelloWorld", something, add));
		return lambda.operate("HelloWorld", something, add);
		
	}
	
	interface Consumer {
		String concat(String a, String b);
	}
	
	private String operate(String a, String b, Consumer funcObj) {
        return funcObj.concat(a, b);
    }
}
