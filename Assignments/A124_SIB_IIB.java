package Assignments;

public class A124_SIB_IIB {
	
	static
	{
		System.out.println("SIB");
	}
	
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}
	A124_SIB_IIB() {
		System.out.println("Non-Para Constructor");
	}
	A124_SIB_IIB(int a) {
		System.out.println("Para Constructor");
	}
	
	public static void main(String[] args) {

		System.out.println("Print Statement inside MAIN Method");
		new A124_SIB_IIB();
		new A124_SIB_IIB(100);
	}
}