package Assignments;

class method_overriding {
	
	void student_details() {
		
		System.out.println("Surya");
		System.out.println("Automation Tester");
	}
}
public class A42_method_overriding extends method_overriding {
	
	void student_details() {
		
		System.out.println("Surya Kamal Mandal");
		System.out.println("Automation Testing Engg");
	}

	public static void main(String[] args) {
		
		A42_method_overriding over= new A42_method_overriding();
		over.student_details();
	}
}