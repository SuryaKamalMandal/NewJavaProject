package Assignments;

public class A51_specifier_within_class {

	public void add() {
		System.out.println("Adding");
	}
	private void sub() {
		System.out.println("Subtracting");
	}
	protected void multi() {
		System.out.println("Multiplication");
	}
	void div() {
		System.out.println("Division");
	}
	public static void main(String[] args) {
		
		A51_specifier_within_class as= new A51_specifier_within_class();
		as.add();
		as.sub();
		as.multi();
		as.div();
	}
}