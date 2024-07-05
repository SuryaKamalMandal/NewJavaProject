package Assignments;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A62_trycatch_prog {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		try {
			System.out.println("Enter your AGE");
			int age= s.nextInt();
			System.out.println("Enter your Salary");
			double salary= s.nextDouble();
			System.out.println("Enter your Weight");
			double weight= s.nextDouble();
			System.out.println("Are you a Student? true/false ");
			boolean are_u_a_student= s.nextBoolean();
			System.out.println("We have got all your Inputs. Your age is "+age+". Your salary is "+salary+". Your weight is "+weight+" & ARE YOU A STUDENT? "+are_u_a_student);
		}
		catch(InputMismatchException a1) {
			Scanner s1= new Scanner(System.in);
			System.out.println("You have Entered Wrong Input, Please Enter it Correctly");
			System.out.println("Enter your AGE");
			int age1= s1.nextInt();
			System.out.println("Enter your Salary");
			double salary1= s1.nextDouble();
			System.out.println("Enter your Weight");
			double weight1= s1.nextDouble();
			System.out.println("Are you a Student? true/false ");
			boolean are_u_a_student1= s1.nextBoolean();
			System.out.println("We have got all your Inputs. Your age is "+age1+". Your salary is "+salary1+". Your weight is "+weight1+" & ARE YOU A STUDENT? "+are_u_a_student1);
		}
	}
}