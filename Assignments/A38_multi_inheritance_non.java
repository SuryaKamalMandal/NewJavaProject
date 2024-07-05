package Assignments;

class family_mandal {
	
	void property() {
		System.out.println("We have 2 LAND");
	}
}
class family_saha extends family_mandal{
	
	void property1() {
		System.out.println("We have 4 HOUSE");
	}
}
public class A38_multi_inheritance_non extends family_saha {

	public static void main(String[] args) {
		
		A38_multi_inheritance_non multi= new A38_multi_inheritance_non();
		multi.property();
		multi.property1();
	}
}