package Assignments;
import java.util.InputMismatchException;

public class A63_multiple_catch {

	public static void main(String[] args) {
		
		try {
			int a= 1/0;
			System.out.println(a);
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