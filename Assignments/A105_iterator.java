package Assignments;
import java.util.ArrayList;
import java.util.Iterator;

public class A105_iterator {

	public static void main(String[] args) {

		ArrayList a1= new ArrayList();
		a1.add("surya");
		a1.add("ram");
		a1.add("sam");
		
		Iterator e= a1.iterator();
		
		while(e.hasNext()) {
			System.out.println(e.next());
		}
	}
}