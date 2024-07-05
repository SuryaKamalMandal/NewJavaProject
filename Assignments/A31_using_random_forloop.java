package Assignments;

public class A31_using_random_forloop {
	
	static double pi_value= Math.PI;
	public static void main(String[] args) {
				
		for(int i=0;i<=5;i++) {
			double r= Math.random();
			double area= pi_value*r*r;
			System.out.println(area);
		}
	}
}