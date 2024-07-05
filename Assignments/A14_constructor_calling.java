package Assignments;

public class A14_constructor_calling {
	
	A14_constructor_calling() {
		System.out.println("Constructor is without Parameter");
	}
	A14_constructor_calling(double a, float b) {
		System.out.println("Constructor has Parameter as double & float");
	}
	A14_constructor_calling(long c) {
		System.out.println("Constructor has Parameter as long");
	}
	public static void main(String[] args) {
		
		new A14_constructor_calling();
		new A14_constructor_calling(55.55,900.900f);
		new A14_constructor_calling(321548415);
	}
}