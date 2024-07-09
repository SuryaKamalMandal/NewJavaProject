package Assignments;

class father_upcasting {
	
}
public class A120_upcasting extends father_upcasting {

	public static void main(String[] args) {

		father_upcasting f= new A120_upcasting(); // implicitly
		
		father_upcasting f1= (father_upcasting) new A120_upcasting(); // explicitly
	}
}