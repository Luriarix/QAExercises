package exercises;

public class Flowcharts {

	//part 1
	public static int test (int a, int b, boolean c) {
		if (c == true) {
			return a + b;
		} else {
			return a * b;
		}
	}
	
	public static void flow (int a) {
		if (a > 2000) {
			System.out.println('A');
			if (a > 6000) {
				System.out.println('C');
			} else {
				System.out.println('B');
				if (a > 4000) {
					System.out.println('D');
				} else {
					System.out.println('E');
				}
			}
			
		} else {
			System.out.println('1');
			if (a > 100) {
				System.out.println('3');
				if (a > 600) {
					System.out.println('5');
				} else {
					System.out.println('4');
					if (a > 500) {
						System.out.println('6');
					} else {
						System.out.println('7');
					}
				}
			} else {
				System.out.println('2');
			}
		}
	}
	
	
//	part 2
	
	public static void flow2 () {
		for (int A = 100; A <= 200; A++) {
			System.out.println(" A ");
		}
	}
	
	public static void flow3 () {
		for (int A = 100; A <= 200; A++) {
			if (A % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}
	
	public static void nums10Times () {
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i);
			}
		}
	}
	
	public static void numsTimes () {
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.println(i);
			}
		}
	}

	
}
