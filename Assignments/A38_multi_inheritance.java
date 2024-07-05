package Assignments;

class mandal_family extends saha_family {
	
	static void property() {
		System.out.println("We have a LAND");
	}
}
class saha_family {
	
	static void property1() {
		System.out.println("We have a HOUSE");
	}
}
public class A38_multi_inheritance extends mandal_family {

	public static void main(String[] args) {
		
		property1();
		property();
	}
}