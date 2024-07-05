package Assignments;
import java.util.Arrays;
import java.util.Scanner;

public class A70_array_using_scanner {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First Value to be Store");
		int num1= s.nextInt();
		System.out.println("Enter the Second Value to be Store");
		int num2= s.nextInt();
		System.out.println("Enter the Third Value to be Store");
		int num3= s.nextInt();
		System.out.println("Enter the Forth Value to be Store");
		int num4= s.nextInt();
		System.out.println("Enter the Fifth Value to be Store");
		int num5= s.nextInt();
		
		int roll[]= new int[5];
		roll[0]= num1;
		roll[1]= num2;
		roll[2]= num3;
		roll[3]= num4;
		roll[4]= num5;

		System.out.println("You have Stored "+roll.length+" values--> "+Arrays.toString(roll)); 
	}
}