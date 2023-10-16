package home_work_two;

public class Main {

	public static void main(String[] args) {
		

		double sideA = 0.3;
		double sideB = 0.4;
		double sideD = 0.5;
		
		double p;
		double squ;
		
		
		p = 0.5 * (sideA + sideB + sideD);
		squ = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideD));
		
		
		System.out.println("We calculate the area using Heron's formula, S = " + squ);
	}

}
