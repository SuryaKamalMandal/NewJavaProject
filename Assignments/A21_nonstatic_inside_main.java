package Assignments;

public class A21_nonstatic_inside_main {
	
	void name() {
		System.out.println("Surya Kamal Mandal");
	}
	public static void main(String[] args) {
		
		A21_nonstatic_inside_main ns=new A21_nonstatic_inside_main();
		ns.name();
	}
}