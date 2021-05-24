package exercises;

public class Taxes {

	public int taxedPercentage(int salary) {
		if (salary < 14999) {
			return 0;
		}
		
		if (salary < 19999) {
			return 10;
		}		
		
		if (salary < 29999) {
			return 15;
		}		
		
		if (salary < 44999) {
			return 20;
		}
		
		return 25;
	}
	
	
	public double taxed (int salary, int taxPercentage) {
		if (salary < 14999) {
			return 0;
		}
		
		return (salary * (taxedPercentage(salary) / 100));
	}
}
