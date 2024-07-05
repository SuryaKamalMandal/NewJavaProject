package Assignments;
import java.util.Scanner;

public class A32_scannerclass {
	
	static Scanner scan= new Scanner(System.in);
	
	static void add() {
		System.out.println("Enter the First number to add");
		int a=scan.nextInt();
		System.out.println("Enter the Second number to add");
		int b=scan.nextInt();
		int add= a+b;
		System.out.println("Addition of 2 number is ==>"+add);
	}
	static void sub() {
		System.out.println("Enter the First number to do Subtraction");
		int a=scan.nextInt();
		System.out.println("Enter the Second number to do Subtraction");
		int b=scan.nextInt();
		int sub= a-b;
		System.out.println("Subtraction of 2 number is ==>"+sub);
		
	}
	static void multi() {
		System.out.println("Enter the First number to do Multiplication");
		int a=scan.nextInt();
		System.out.println("Enter the Second number to do Multiplication");
		int b=scan.nextInt();
		int multi= a*b;
		System.out.println("Multiplication of 2 number is ==>"+multi);
	}
	static void div() {
		System.out.println("Enter First number to do Division");
		int a=scan.nextInt();
		System.out.println("Enter Second number to do Division");
		int b=scan.nextInt();
		int div= a/b;
		System.out.println("Division of 2 number is ==>"+div);
	}
	static void mod() {
		System.out.println("Enter First number to do Modulus Operation");
		int a=scan.nextInt();
		System.out.println("Enter Second number to do Modulus Operation");
		int b=scan.nextInt();
		int modulus= a%b;
		System.out.println("Modulus of 2 number is ==>"+modulus);
	}
	public static void main(String[] args) {
		
		add();
		sub();
		multi();
		div();
		mod();
	}
}