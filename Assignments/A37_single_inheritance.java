package Assignments;

class single_inheritance {
	
	void name() {
		System.out.println("Surya");
	}
	static void course() {
		System.out.println("Automation Testing");
	}
}
public class A37_single_inheritance extends single_inheritance {
	
	public static void main(String[] args) {
		
		A37_single_inheritance s= new A37_single_inheritance();
		s.name();
		course();
	}
}