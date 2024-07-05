package Assignments;

public class A4_add_sub_mul_div {
	
	static void add() {
		
		int a=100;
		int b=4000;
		int add= a+b;
		System.out.println("Addition of a & b is-->"+ add);
	}
	static void sub() {
		
		int a=100;
		int b=4000;
		int sub=b-a;
		System.out.println("Subtraction of b & a is-->"+ sub);
	}
	static void multi() {
		
		int a=100;
		int b=4000;
		int multi= a*b;
		System.out.println("Multiplication of a & b is-->"+ multi);
	}
	static void div() {
		
		int a=100;
		int b=4000;
		int div= b/a;
		System.out.println("Division of b & a is-->"+ div);
	}

	public static void main(String[] args) {
		
		add();
		sub();
		multi();
		div();
	}
}