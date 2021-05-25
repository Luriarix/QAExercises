package exercises;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static ArrayList<Integer> nums;
	public static List<Integer> hundreds;
	
	public static void numbs() {
		for (int i = 1; i <= 100; i++) {
			nums.add(i);
		}
		for (int i = 100; i <= 999; i++) {
			hundreds.add(i);
		}
		for (Integer integer : hundreds) {
			System.out.println(integer * 10);
		}
	}
}
