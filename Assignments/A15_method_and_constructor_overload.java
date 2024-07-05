package Assignments;

public class A15_method_and_constructor_overload {
	
	static void add(int a) {
		int sum=a+45;
		System.out.println(sum);
	}
	static void sub(long b, long c) {
		long sub=b-c;
		System.out.println(sub);
	}
	void multi(double d, double e) {
		double multi=d*e;
		System.out.println(multi);
	}
	void div(int f, int g) {
		int div=f/g;
		System.out.println(div);
	}
	A15_method_and_constructor_overload() {
		
	}
	A15_method_and_constructor_overload(boolean f) {
		System.out.println("boolean constructor is called");
	}
	A15_method_and_constructor_overload(char g) {
		System.out.println("char constructor is called");
	}

	public static void main(String[] args) {
		
		A15_method_and_constructor_overload a1=new A15_method_and_constructor_overload();
		add(60);
		sub(156, 35);
		a1.multi(60.5, 5.9);
		a1.div(100, 5);
		new A15_method_and_constructor_overload(false);
		new A15_method_and_constructor_overload('S');
	}
}