package Assignments;

public class A61_trycatch {

	public static void main(String[] args) {
		
		try {
			int a= 1/0;
			System.out.println(a);
		}
		catch(ArithmeticException ae) {
			System.out.println("Eror 404:");
		}
	}
}