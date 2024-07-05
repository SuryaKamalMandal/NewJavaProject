package Assignments;

class saha_fam1 {
	
	saha_fam1(double a) {
		
		System.out.println("Saha family constructor is executing");
	}
}
class mandal_fam1 extends saha_fam1 {
	
	mandal_fam1(boolean b) {
		super(99.99);
		System.out.println("Mandal family constructor is executing");
	}
}

public class A39_super_class_para extends mandal_fam1 {

	A39_super_class_para() {
		super(true);
		System.out.println("Super class constructor is executing");
	}
	public static void main(String[] args) {
		
		new A39_super_class_para();
	}
}