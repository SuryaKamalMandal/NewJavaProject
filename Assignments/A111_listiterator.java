package Assignments;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class A111_listiterator {

	public static void main(String[] args) {
		
		LinkedList a1= new LinkedList();
		a1.add("surya");
		a1.add("ram");
		a1.add("sam");
		a1.add("rahul");
		a1.add("dev");
		
		ListIterator e= a1.listIterator();
		System.out.println("--Forward Direction--");
		while(e.hasNext()) {
			System.out.println(e.next());
		}
		System.out.println("--Backward Dirction--");
		while(e.hasPrevious()) {
			System.out.println(e.previous());
		}	
	}
}