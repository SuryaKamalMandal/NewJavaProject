package Assignments;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A64_finally_block {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		try {
			System.out.println("Enter your AGE");
			int age= s.nextInt();
		}
		catch(InputMismatchException a1) {
			System.out.println("Input Mismatched");
		}
		catch(ArithmeticException a2) {
			System.out.println("ArithmeticException Occurred");
		}
		finally {
			System.out.println("Finally block is executed");
		}
	}
}