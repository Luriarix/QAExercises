package exercises;

import java.util.ArrayList;

public class EnhancedFor {

	private static ArrayList<Integer> nums = new ArrayList<Integer>();
	
	public static void setArray(int i) {
		nums.add(i);
	}
	
	public static void print() {
		nums.sort(null);
		for (Integer integer : nums) {
			System.out.println(integer);
		}
	}
	
	public static void printSquare() {
		nums.sort(null);
		for (Integer integer : nums) {
			System.out.println(integer * integer);
		}
	}
	
	public static boolean evenOdd(int i) {
			if (i % 2 == 0) {
				return true;				
			} else {
				return false;
			}
	}

	public static void cubeSquare() {
		for (Integer integer : nums) {
			if (evenOdd(integer) == true) {
				System.out.println(integer * integer * integer);
			} else {
				System.out.println(integer * integer);
			}
		}

	}
}
