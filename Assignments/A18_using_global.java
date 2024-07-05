package Assignments;

public class A18_using_global {
	
	static double pi=3.14;
	
	static void area() {
		int r=22;
		double area=pi*r*r;
		System.out.println(area);
	}
	public static void main(String[] args) {
		
		area();
	}
}