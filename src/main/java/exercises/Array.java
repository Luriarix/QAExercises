package exercises;

import java.util.ArrayList;

public class Array {

	private static ArrayList<Integer> nums = new ArrayList<Integer>();
	
	public static void itteration () {
		for (int i = 0; i < 10; i++) {
			nums.add((int) (Math.random() * 90));
		}
		nums.sort(null);
		for (Integer integer : nums) {
			System.out.println(integer);
		}
	}
	
	public static void itterationTimes10() {
		for (int i = 0; i < 10; i++) {
			nums.set(i, nums.get(i) * 10);
			System.out.println(nums.get(i));
		}
	}
	
	
}
