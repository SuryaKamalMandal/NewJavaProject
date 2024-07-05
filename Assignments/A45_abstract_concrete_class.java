package Assignments;
abstract class prog_abstract {
	
	abstract void add();
	abstract void div();
	
}
public class A45_abstract_concrete_class extends prog_abstract {
	
	void add() {
		System.out.println("Addition of 2 number will happen here");	
	}
	void div() {
		System.out.println("Division of 2 number will happen here");	
	}
	public static void main(String[] args) {
		
		A45_abstract_concrete_class ac=new A45_abstract_concrete_class();
		ac.add();
		ac.div();
	}
}