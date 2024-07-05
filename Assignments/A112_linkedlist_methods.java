package Assignments;
import java.util.LinkedList;

public class A112_linkedlist_methods {

	public static void main(String[] args) {
		
		LinkedList a1= new LinkedList();
		a1.add("surya");
		a1.add("ram");
		a1.add("sam");
		a1.add("rahul");
		a1.add("dev");
		
		a1.addFirst("Kohli");
		System.out.println("Added at 1st place--> "+a1);
		
		a1.addLast("MSD");
		System.out.println("Added at last place--> "+a1);
		
		a1.removeFirst();
		System.out.println("Removed the 1st value--> "+a1);
		
		a1.removeLast();
		System.out.println("Removed the last value--> "+a1);	
	}
}