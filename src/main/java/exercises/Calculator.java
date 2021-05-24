package exercises;

import java.util.Scanner;

public class Calculator {

	public static int addition(int a, int b) {
		return a + b;
	}
	
	public static int multiplication(int a, int b) {
		return a * b;
	}
	
	public static int subtraction (int a, int b) {
		return a - b;
	}
	
	public static double division(double a, double b) {
		return a / b;
	}
	
	
	public static void menu() {
		Scanner scan = new Scanner(System.in);
		double first = 0;
		double second = 0;
		System.out.println("1) Addition\n2) Multiplication\n3) Substraction\n4) Division");
		int chose = scan.nextInt();
		scan =new Scanner(System.in);
		
		switch (chose) {
			case 1:
				System.out.println("First num:");
				first = scan.nextInt();
				scan =new Scanner(System.in);
				System.out.println("Second num:");
				second = scan.nextInt();
				System.out.println(addition((int)first, (int)second));
				break;
			case 2:
				System.out.println("First num:");
				first = scan.nextInt();
				scan =new Scanner(System.in);
				System.out.println("Second num:");
				second = scan.nextInt();
				System.out.println(multiplication((int)first, (int)second));
				break;
			case 3:
				System.out.println("First num:");
				first = scan.nextInt();
				scan =new Scanner(System.in);
				System.out.println("Second num:");
				second = scan.nextInt();
				System.out.println(subtraction((int)first, (int)second));
				break;
			case 4:
				System.out.println("First num:");
				first = scan.nextDouble();
				scan =new Scanner(System.in);
				System.out.println("Second num:");
				second = scan.nextDouble();
				System.out.println(division(first, second));
				break;
			default:
				System.out.println("You could have chose better.");
		}
	}
	
}
