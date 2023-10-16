package home_work_two_c;

public class Main {

	public static void main(String[] args) {
		int distance = 120;
		int fuelcon = 8;
		double costbenz = 1.2;
		double percent = 100.0;
		double x;
		double costbenzsum;
		
		
		x = (( distance * fuelcon ) / percent);
		costbenzsum = x * costbenz;
		System.out.println( "The total amount for gasoline will be $" + costbenzsum);
		
	}

}
