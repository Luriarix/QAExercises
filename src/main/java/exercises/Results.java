package exercises;

public class Results {
	
	private double Physics;
	private double Chemistry;
	private double Biology;
	private double total;
	private double percentage;
	private boolean mark;
	
	public Results(double physics, double chemistry, double biology) {
		Physics = physics;
		Chemistry = chemistry;
		Biology = biology;
		this.total = physics + chemistry + biology;
		this.percentage = (total * 100) / 450;
		if (percentage >= 60) {
			if ((physics / 150 * 100) < 60 || (chemistry / 150 * 100) < 60 || (biology / 150 * 100) < 60) {
				this.mark = false;
			} else {
				this.mark = true;
			}
		} else {
			this.mark = false;
		}

	}

	@Override
	public String toString() {
		if (mark == false) {
			int countFailedExams = 0;
			if (((this.Physics / 150) * 100) < 60) {
				countFailedExams++;
			}
			if (((Chemistry / 150) * 100) < 60) {
				countFailedExams++;
			}
			if (((Biology / 150) * 100) < 60) {
				System.out.println((this.Biology / 150) * 100);
				countFailedExams++;
			}
			
			return "Results: \n\tPhysics=" + Physics + "\n\tChemistry=" + Chemistry + "\n\tBiology=" + Biology + "\n\tTotal=" + total + "\n\tFailed at " + ((countFailedExams == 3) ? "Every" : countFailedExams) + " Exam";			
		}	
		return "Results: \n\tPhysics=" + Physics + "\n\tChemistry=" + Chemistry + "\n\tBiology=" + Biology + "\n\tTotal=" + total + "\n\tPass";			
	}

	public float getPercentage() {
		return (float) percentage;
	}
		
}
