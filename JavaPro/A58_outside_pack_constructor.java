package JavaPro;

public class A58_outside_pack_constructor {
	
	public A58_outside_pack_constructor(int a) {
		System.out.println("Constructor having int");
	}
	protected A58_outside_pack_constructor(String b) {
		System.out.println("Constructor having String");
	}
	private A58_outside_pack_constructor(double c) {
		System.out.println("Constructor having double");
	}
	A58_outside_pack_constructor() {
		System.out.println("Constructor having no para");
	}
}