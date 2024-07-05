package Assignments;
import java.util.Scanner;

public class A34_rectangle_scanner {
	
	static Scanner scan= new Scanner(System.in);
	
	static void area_rectangle( ) {
		System.out.println("Enter the length of a Rectangle");
		int length= scan.nextInt();
		System.out.println("Enter the width of a Rectangle");
		int width= scan.nextInt();
		int area= length*width;
		System.out.println("Area of Rectangle is-->"+area);
	}
	public static void main(String[] args) {
		
		area_rectangle();
	}
}