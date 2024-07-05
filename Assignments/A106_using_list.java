package Assignments;

import java.util.ArrayList;
import java.util.ListIterator;

public class A106_using_list {

	public static void main(String[] args) {
		
		ArrayList a1= new ArrayList();
		a1.add("surya");
		a1.add("ram");
		a1.add("sam");
		
		ListIterator b= a1.listIterator();
		
		System.out.println("Printing in forward direction");
		while(b.hasNext()) {
			System.out.println(b.next());
		}
		System.out.println("Printing in backward dirction");
		while(b.hasPrevious()) {
			System.out.println(b.previous());
		}
	}
}