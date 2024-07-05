package Assignments;

public class A19_global_variables {

	static int a=100;
	static int b=50;
	
	static void add() {
		int add=a+b;
		System.out.println(add);
	}
	static void sub() {
		int sub=a-b;
		System.out.println(sub);
	}
	static void multi() {
		int multi=a*b;
		System.out.println(multi);
	}
	static void div() {
		int div=a/b;
		System.out.println(div);
	}
	static void mod() {
		int mod=a%b;
		System.out.println(mod);
	}
	
	public static void main(String[] args) {
		
		add();
		sub();
		multi();
		div();
		mod();
	}
}