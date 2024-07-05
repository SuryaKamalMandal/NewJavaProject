package Assignments;

public class A12_static_method_calling {
	
	static void name() {
		System.out.println("Surya");
	}
	static void country() {
		System.out.println("INDIA");
	}
	static void course(int a, int b) {
		System.out.println("Automation Testing");
	}
	static void address(String c, String d) {
		
		System.out.println("Address is-->");
	}
	
	public static void main(String[] args) {
		
		name();
		country();
		course(10,10);
		address("Bangalore", "Begur");
	}
}