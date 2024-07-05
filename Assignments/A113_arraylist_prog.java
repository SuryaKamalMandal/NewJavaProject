package Assignments;
import java.util.ArrayList;

public class A113_arraylist_prog {

	public static void main(String[] args) {
		
		ArrayList a1= new ArrayList();
		
		a1.add("surya");
		a1.add("kamal");
		a1.add("raman");
		System.out.println(a1);
		
		System.out.println(a1.get(0));
		Object a= a1.set(1, "rahul");
		System.out.println(a1);
		
		System.out.println(a1.indexOf("raman"));
	}
}