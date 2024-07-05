package Assignments;

class saha_fam {
	
	saha_fam() {
		
		System.out.println("saha family constructor is executing");
	}
}
class mandal_fam extends saha_fam {
	
	mandal_fam() {
		
		System.out.println("mandal family constructor is executing");
	}
}
public class A39_super_class_nopara extends mandal_fam {

	A39_super_class_nopara() {
		
		System.out.println("Sub class constructor is executing");
	}
	public static void main(String[] args) {
		
		new A39_super_class_nopara();

	}

}