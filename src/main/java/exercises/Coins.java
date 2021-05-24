package exercises;

import java.text.DecimalFormat;

public class Coins {
	
	private static double[] currency = {50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01}; 
	
	private static DecimalFormat df = new DecimalFormat("0.00");
	
	public static void change(double cost, double amount) {
		double change = amount - cost;
		
		for (double d : currency) {
			int times = (int) (change / d);
			String result = "";
			if (times > 0) {
				if (d > 2) {
					result += times + " £" + d + " note";									
				} else {
					result += times + " " + (int) (d * 100) + "p";
				}
				if (times > 1) {
					result += "'s";
				}
				System.out.println(result);
				change = Double.parseDouble(df.format(change - d * times));
			}
		}	
	}
	
	
}
