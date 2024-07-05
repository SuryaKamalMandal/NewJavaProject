package Assignments;
import java.util.Scanner;

public class A35_circumference_scanner {

	static Scanner scan= new Scanner(System.in);
	static double pi_value=Math.PI;
	
	static void circum_circle( ) {
		
		int a=2;
		System.out.println("Enter the value of radius of a Circle");
		int radius= scan.nextInt();
		double circum= a*pi_value*radius;
		System.out.println("Circumference of Circle is--> "+circum);
	}
	public static void main(String[] args) {
		circum_circle();
	}
}