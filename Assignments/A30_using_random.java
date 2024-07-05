package Assignments;

public class A30_using_random {
	
	static double pi_value= Math.PI;
	public static void main(String[] args) {
		
		double r= Math.random();
		double area= pi_value*r*r;
		System.out.println(area);
	}
}