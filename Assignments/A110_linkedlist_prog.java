package Assignments;
import java.util.Iterator;
import java.util.LinkedList;

public class A110_linkedlist_prog {
	
	public static void main(String[] args) {
		
		LinkedList a1= new LinkedList();
		a1.add("surya");
		a1.add("ram");
		a1.add("sam");
		a1.add("rahul");
		
		Iterator e= a1.iterator();
		
		while(e.hasNext()) {
			System.out.println(e.next());
		}	
	}
}