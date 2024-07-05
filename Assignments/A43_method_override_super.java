package Assignments;

class overriding_method {
	
	void details_students() {
		System.out.println("Surya");
		System.out.println("Automation Engg");
	}
}
public class A43_method_override_super extends overriding_method {
	
	void details_students() {
		System.out.println("Surya Kamal Mandal");
		System.out.println("Automation Test Engg");
		super.details_students();
	}
	public static void main(String[] args) {
		
		A43_method_override_super ride= new A43_method_override_super();
		ride.details_students();
	}
}