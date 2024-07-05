package Assignments;

class grandparents {
	
	void add() {
		System.out.println("Adding of 2 number");
	}
	void sub() {
		System.out.println("Subtraction of 2 number");
	}
}
abstract class father extends grandparents {
	
	abstract void multi();
	abstract void div();
	
	void mod() {
		System.out.println("Modules operation of 2 number");
	}
	void course_name() {
		System.out.println("Automation Testing");
	}
}
public class A46_super_abstract_subclass extends father{
	
	void multi() {
		System.out.println("Multiplication of 2 number");
	}
	void div() {
		System.out.println("Division of 2 number");
	}
	
	void name() {
		System.out.println("Surya");
	}
	void countryname() {
		System.out.println("INDIA");
	}
	public static void main(String[] args) {
		
		A46_super_abstract_subclass sas=new A46_super_abstract_subclass();
		sas.add();
		sas.sub();
		sas.multi();
		sas.div();
		sas.mod();
		sas.course_name();
		sas.name();
		sas.countryname();
	}
}