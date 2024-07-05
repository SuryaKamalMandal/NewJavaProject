package Assignments;

public class A13_nonstatic_method_calling {
	
	void name() {
		System.out.println("Surya");
	}
	void country() {
		System.out.println("INDIA");
	}
	void course(int a, int b) {
		System.out.println("Automation Testing");
	}
	void address(String c, String d) {
		
		System.out.println("Address is-->");
	}
	public static void main(String[] args) {
		
		A13_nonstatic_method_calling ns=new A13_nonstatic_method_calling();
		ns.name();
		ns.country();
		ns.course(50, 60);
		ns.address("Begur", "Bangalore");
	}
}