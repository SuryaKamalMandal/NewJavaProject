package Assignments;
class newparent {
	
	void add() {
		System.out.println("ADDING");
	}
	void sub() {
		System.out.println("SUBTRACTING");
	}
}

public class A107_upcasting extends newparent {

	public static void main(String[] args) {
		
		newparent p= new A107_upcasting();
		p.add();
		p.sub();		
	}
}